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
import retrofit2.HttpException
import java.net.SocketException
import java.net.UnknownHostException
import javax.net.ssl.SSLException

public fun <M> BaseNetworkResp<M>.toUiState(): UiState<M> {
    return when (this.httpCode) {
        in 200..299 -> {
            UiState.Success(this.data)
        }
        in 400..499 -> {
            UiState.Failure(
                    errorCode = httpCode.toString(),
                    displayError = this.displayMessage,
                    errorMessage = this.message ?: "Error msg is empty",
                    errorType = UiState.CLIENT_ERROR
            )
        }
        in 500..599 -> {
            UiState.Failure(
                    errorCode = httpCode.toString(),
                    displayError = this.displayMessage,
                    errorMessage = this.message ?: "Error msg is empty",
                    errorType = UiState.SERVER_ERROR
            )
        }
        else -> error("Wrong http code passed, httpCode = ${this.httpCode}")
    }
}

public fun <M> Exception.toUiState(): UiState<M> {
    return when {
        isNetworkError() -> {
            UiState.Failure(
                    errorCode = "-1",
                    errorType = UiState.SERVER_ERROR,
                    errorMessage = "Unable to connect!",
                    displayError = "Unable to connect",
                    throwable = this,
            )
        }
        this is HttpException -> {
            UiState.Failure(
                    errorCode = this.code().toString(),
                    displayError = "Something went wrong!",
                    errorMessage = this.message(),
                    errorType = UiState.SERVER_ERROR,
                    throwable = this
            )
        }
        else -> UiState.Failure(
                errorCode = "-1",
                displayError = "Something went wrong!",
                errorMessage = this.message.toString(),
                errorType = UiState.UNKNOWN_ERROR,
                throwable = this
        )
    }
}

public inline fun <M> tryWithUiState(block: () -> BaseNetworkResp<M>): UiState<M> {
    return try {
        block().toUiState()
    } catch (e: java.lang.Exception) {
        e.toUiState()
    }
}

public inline fun tryWithErrorBlock(block: () -> Unit, errorBlock: (e: Exception) -> Unit) {
    return try {
        block()
    } catch (e: Exception) {
        errorBlock(e)
    }
}

public fun Throwable?.isNetworkError(): Boolean = this is java.net.SocketTimeoutException || this is UnknownHostException || this is SocketException || this is SSLException