/*
 * Copyright (C) 2020 Atul Gupta.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

@file:Suppress("unused")

package com.app.coroutinefireadapter

import com.google.firebase.firestore.*
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.cancel
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.mapNotNull
import kotlinx.coroutines.suspendCancellableCoroutine
import timber.log.Timber
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException

public suspend inline fun <reified M> DocumentReference.toValue(
    fieldPath: FieldPath? = null,
    source: Source = Source.SERVER,
): M? {
    val snapshot = toSnapshotValue(source)
    snapshot ?: return null
    return if (snapshot.exists()) {
        snapshot.convertToObj(fieldPath)
    } else {
        null
    }
}

public inline fun <reified M : Any> DocumentReference.toValueFlow(
    fieldPath: FieldPath? = null,
    excludeCache: Boolean = true,
    includeMetaDataChanges: Boolean = true,
): Flow<M> {
    return toSnapshotValueFlow(includeMetaDataChanges).filter {
        it.exists()
    }.filter {
        if (!excludeCache) {
            true
        } else {
            excludeCache && !it.metadata.isFromCache
        }
    }.mapNotNull {
        it.convertToObj(fieldPath)
    }
}

@OptIn(ExperimentalCoroutinesApi::class)
@PublishedApi
internal fun DocumentReference.toSnapshotValueFlow(includeMetaDataChanges: Boolean): Flow<DocumentSnapshot> {
    return callbackFlow {
        val valueEventListener = EventListener<DocumentSnapshot> { p0, p1 ->
            p0?.let {
                // Success case
                Timber.d("[SnapShotValueFlow] onDataChange")
                try {
                    offer(it)
                } catch (e: Throwable) {
                    // Handle exception from the channel: failure in flow or premature closing
                    Timber.e(RuntimeException("Failure in flow or premature closing", e))
                }
            }

            p1?.let {
                // Error case
                Timber.d("[SnapShotValueFlow] onCancelled")
                Timber.e(p1)
                cancel(CancellationException("[SnapShotValueFlow] API Error", p1))
            }
        }
        val registrationListener =
            this@toSnapshotValueFlow.addSnapshotListener(
                if (includeMetaDataChanges) MetadataChanges.INCLUDE else MetadataChanges.EXCLUDE,
                valueEventListener
            )

        awaitClose {
            Timber.d("[toValueFlow] awaitClose called")
            registrationListener.remove()
        }
    }
}

@PublishedApi
internal inline fun <reified M> DocumentSnapshot.convertToObj(fieldPath: FieldPath?): M? {
    return fieldPath?.let {
        this[it, M::class.java]
    } ?: this.toObject(M::class.java)
}

@PublishedApi
internal suspend fun DocumentReference.toSnapshotValue(source: Source): DocumentSnapshot? {
    return suspendCancellableCoroutine { cancellableContinuation ->
        this.get(source).addOnCompleteListener { task ->
            if (!cancellableContinuation.isActive) {
                return@addOnCompleteListener
            }
            if (task.isSuccessful) {
                Timber.d("[SnapshotValue] onDataChange: data = ${task.result}")
                cancellableContinuation.resume(task.result)
            } else {
                Timber.d("[SnapshotValue] onCancelled")
                Timber.e(task.exception)
                cancellableContinuation.resumeWithException(
                    task.exception ?: RuntimeException("Null exception from Firestore")
                )
            }
        }

        cancellableContinuation.invokeOnCancellation {
            Timber.d("[SnapshotValue] invokeOnCancellation")
        }
    }
}