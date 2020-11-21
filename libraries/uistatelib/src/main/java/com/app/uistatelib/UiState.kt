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

package com.app.uistatelib

import com.app.uistatelib.UiState.Failure
import com.app.uistatelib.model.BaseNetworkResp
import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.InvocationKind
import kotlin.contracts.contract

/**
 * A discriminated union that encapsulates a successful outcome with a value of type [M]
 * or a failure with a string [Failure.errorCode] representing error case, a nullable [Throwable]
 * exception and few more properties or a loading/initial state of the operation
 */
public sealed class UiState<out M> {

    public data class Success<out M>(val value: M) : UiState<M>()

    public object Loading : UiState<Nothing>()

    public class Failure(
            public val errorCode: String,
            public val errorType: Int,
            public val errorMessage: String,
            public val displayError: String?,
            public val throwable: Throwable? = null,
    ) : UiState<Nothing>()

    public companion object {
        public const val SERVER_ERROR: Int = 1
        public const val CLIENT_ERROR: Int = 2
        public const val NETWORK_ERROR: Int = 3
        public const val UNKNOWN_ERROR: Int = 4
    }
}

/**
 * Performs the [successBlock] function for the encapsulated value [M] if this instance represents [success][UiState.Success]
 * or performs the [failureBlock] function for the encapsulated [UiState.Failure] if it is [failure][UiState.Failure].
 *
 * Note, that this function rethrows any [Throwable] exception thrown by [successBlock] or by [failureBlock] function.
 */
@OptIn(ExperimentalContracts::class)
public inline fun <M> UiState<M>.fold(
        failureBlock: (Failure) -> Unit = { },
        successBlock: (value: M) -> Unit,
): UiState<M> {
    contract {
        callsInPlace(failureBlock, InvocationKind.AT_MOST_ONCE)
        callsInPlace(successBlock, InvocationKind.AT_MOST_ONCE)
    }
    when (this) {
        is UiState.Success -> {
            successBlock(this.value)
        }
        is UiState.Loading -> {
            /* no-op */
        }
        is Failure -> {
            failureBlock(this)
        }
    }
    return this
}

/**
 * Performs the given [successBlock] on the encapsulated value if this instance represents [success][UiState.Success].
 * @return the original `UiState` unchanged.
 */
@OptIn(ExperimentalContracts::class)
public inline fun <M> UiState<M>.onSuccess(
        successBlock: (value: M) -> Unit,
): UiState<M> {
    contract {
        callsInPlace(successBlock, InvocationKind.AT_MOST_ONCE)
    }
    when (this) {
        is UiState.Success -> {
            successBlock(this.value)
        }
        is UiState.Loading -> {
            /* no-op */
        }
        is Failure -> {
            /* no-op */
        }
    }
    return this
}

/**
 * Performs the given [failureBlock] on the [UiState.Failure] value if this instance represents [failure][UiState.Failure].
 * @return the original `UiState` unchanged.
 */
@OptIn(ExperimentalContracts::class)
public inline fun <M> UiState<M>.onFailure(
        failureBlock: (Failure) -> Unit,
): UiState<M> {
    contract {
        callsInPlace(failureBlock, InvocationKind.AT_MOST_ONCE)
    }
    when (this) {
        is UiState.Success -> {
            /* no-op */
        }
        is UiState.Loading -> {
            /* no-op */
        }
        is Failure -> {
            failureBlock(this)
        }
    }
    return this
}

/**
 * Returns the encapsulated result of the given [transform] function applied to the encapsulated value
 * if this instance represents [success][UiState.Success] or the
 * original encapsulated [UiState] if it is [failure][UiState.Failure] or [loading][UiState.Loading].
 *
 * Note, that this function rethrows any [Throwable] exception thrown by [transform] function.
 * See [flatMap] for an alternative that encapsulates exceptions and loading state.
 */
@OptIn(ExperimentalContracts::class)
public inline fun <M, T> UiState<M>.map(
        transform: (M) -> T,
): UiState<T> {
    contract {
        callsInPlace(transform, InvocationKind.AT_MOST_ONCE)
    }
    return when (this) {
        is UiState.Success -> {
            UiState.Success(transform(this.value))
        }
        is UiState.Loading -> {
            this
        }
        is Failure -> {
            this
        }
    }
}

/**
 * Returns the encapsulated result of the given [transform] function applied to the encapsulated value
 * if this instance represents [success][UiState.Success] or
 * original encapsulated [UiState] if it is [failure][UiState.Failure] or [loading][UiState.Loading].
 *
 * This function catches any [UiState] failure or loading state emitted by [transform] function and encapsulates it as a corresponding [UiState].
 * See [map] for an alternative that rethrows exceptions from `transform` function.
 */
@OptIn(ExperimentalContracts::class)
public inline fun <M, T> UiState<M>.flatMap(
        transform: (M) -> BaseNetworkResp<T>,
): UiState<T> {
    contract {
        callsInPlace(transform, InvocationKind.AT_MOST_ONCE)
    }
    return when (this) {
        is UiState.Success -> {
            tryWithUiState {
                transform(this.value)
            }
        }
        is UiState.Loading -> {
            this
        }
        is Failure -> {
            this
        }
    }
}