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

@file:Suppress("FunctionName")

package com.app.propertydelegates.intent.base

import android.content.Intent
import android.os.Bundle
import android.os.Parcelable
import com.app.propertydelegates.PropertyDelegate
import com.app.propertydelegates.TypeReader
import com.app.propertydelegates.TypeWriter
import com.app.propertydelegates.intent.Generic
import com.app.propertydelegates.intent.IntentExtra
import java.io.Serializable

public inline fun <T> IntentExtra.Bundle(
        crossinline reader: TypeReader<T, Bundle?>,
        crossinline writer: TypeWriter<T, Bundle?>,
        name: String? = null,
        customPrefix: String? = null,
): PropertyDelegate<Intent, T> =
    Generic(
            Intent::getBundleExtra,
            Intent::putExtra,
            reader,
            writer,
            name,
            customPrefix
    )

public inline fun <T> IntentExtra.CharSequence(
        crossinline reader: TypeReader<T, CharSequence?>,
        crossinline writer: TypeWriter<T, CharSequence?>,
        name: String? = null,
        customPrefix: String? = null,
): PropertyDelegate<Intent, T> =
    Generic(
            Intent::getCharSequenceExtra,
            Intent::putExtra,
            reader,
            writer,
            name,
            customPrefix
    )

public inline fun <T> IntentExtra.String(
        crossinline reader: TypeReader<T, String?>,
        crossinline writer: TypeWriter<T, String?>,
        name: String? = null,
        customPrefix: String? = null,
): PropertyDelegate<Intent, T> =
    Generic(
            Intent::getStringExtra,
            Intent::putExtra,
            reader,
            writer,
            name,
            customPrefix
    )

public inline fun <T, R : Parcelable> IntentExtra.Parcelable(
        crossinline reader: TypeReader<T, R?>,
        crossinline writer: TypeWriter<T, R?>,
        name: String? = null,
        customPrefix: String? = null,
): PropertyDelegate<Intent, T> =
    Generic(
            Intent::getParcelableExtra,
            Intent::putExtra,
            reader,
            writer,
            name,
            customPrefix
    )

public inline fun <T, R : Serializable> IntentExtra.Serializable(
        crossinline reader: TypeReader<T, R?>,
        crossinline writer: TypeWriter<T, R?>,
        name: String? = null,
        customPrefix: String? = null,
): PropertyDelegate<Intent, T> =
    Generic(
            { nameInLambda ->
                    @Suppress("UNCHECKED_CAST")
                    getSerializableExtra(nameInLambda) as? R?
            },
            Intent::putExtra,
            reader,
            writer,
            name,
            customPrefix
    )
