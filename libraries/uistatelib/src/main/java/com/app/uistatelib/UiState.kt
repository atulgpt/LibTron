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

import com.app.uistatelib.model.BaseNetworkResp
import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.InvocationKind
import kotlin.contracts.contract

public sealed class UiState<out M> {

    public data class Success<out M>(val value: M) : UiState<M>()

    public data class Loading(val optionalMessage: String? = null) : UiState<Nothing>()

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

@OptIn(ExperimentalContracts::class)
public inline fun <M> UiState<M>.fold(
        failureBlock: (UiState<M>) -> Unit = { },
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
            // no-op
        }
        is UiState.Failure -> {
            failureBlock(this)
        }
    }

    return this
}

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
            // no-op
        }
        is UiState.Failure -> {
            // no-op
        }
    }

    return this
}

@OptIn(ExperimentalContracts::class)
public inline fun <M> UiState<M>.onFailure(
        failureBlock: (UiState.Failure) -> Unit,
): UiState<M> {
    contract {
        callsInPlace(failureBlock, InvocationKind.AT_MOST_ONCE)
    }
    when (this) {
        is UiState.Success -> {
            // no-op
        }
        is UiState.Loading -> {
            // no-op
        }
        is UiState.Failure -> {
            failureBlock(this)
        }
    }

    return this
}


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
            UiState.Loading(this.optionalMessage)
        }
        is UiState.Failure -> {
            this
        }
    }
}

@OptIn(ExperimentalContracts::class)
public inline fun <M, T> UiState<M>.flatMap(
        errorHandler: (response: UiState<M>, secondResponseFailure: UiState.Failure) -> Unit = { _: UiState<M>, _: UiState.Failure -> },
        transform: (M) -> BaseNetworkResp<T>,
): UiState<T> {
    contract {
        callsInPlace(transform, InvocationKind.AT_MOST_ONCE)
        callsInPlace(errorHandler, InvocationKind.AT_MOST_ONCE)
    }
    return when (this) {
        is UiState.Success -> {
            val secondResponse = tryWithUiState {
                transform(this.value)
            }
            when (secondResponse) {
                is UiState.Success -> {
                    UiState.Success(secondResponse.value)
                }
                is UiState.Loading -> {
                    UiState.Loading()
                }
                is UiState.Failure -> {
                    secondResponse
                }
            }
        }
        is UiState.Loading -> {
            UiState.Loading(this.optionalMessage)
        }
        is UiState.Failure -> {
            this
        }
    }
}