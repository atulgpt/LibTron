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

package com.app.sharedprefdelegates

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

@PublishedApi
internal fun Any?.toStringUsingGson(): String? {
    this ?: return null
    return Gson().toJson(this)
}

@PublishedApi
internal inline fun <reified T> String?.fromJson(): T? = try {
    this?.let {
        Gson().fromJson<T>(this, object : TypeToken<T>() {}.type)
    } ?: run {
        null
    }
} catch (e: Exception) {
//    Timber.e(e, "fromJson: error = ${e.message}")
    null
}