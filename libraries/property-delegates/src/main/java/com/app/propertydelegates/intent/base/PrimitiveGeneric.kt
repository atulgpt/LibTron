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
import com.app.propertydelegates.PropertyDelegate
import com.app.propertydelegates.TypeReader
import com.app.propertydelegates.TypeWriter
import com.app.propertydelegates.intent.*

public inline fun <T> IntentExtra.Boolean(
        crossinline reader: TypeReader<T, Boolean?>,
        crossinline writer: TypeWriter<T, Boolean?>,
        name: String? = null,
        customPrefix: String? = null,
): PropertyDelegate<Intent, T> =
    Generic(
            ::getBooleanExtra,
            ::putExtra,
            reader,
            writer,
            name,
            customPrefix
    )

public inline fun <T> IntentExtra.Int(
        crossinline reader: TypeReader<T, Int?>,
        crossinline writer: TypeWriter<T, Int?>,
        name: String? = null,
        customPrefix: String? = null,
): PropertyDelegate<Intent, T> =
    Generic(
            ::getIntExtra,
            ::putExtra,
            reader,
            writer,
            name,
            customPrefix
    )

public inline fun <T> IntentExtra.Long(
        crossinline reader: TypeReader<T, Long?>,
        crossinline writer: TypeWriter<T, Long?>,
        name: String? = null,
        customPrefix: String? = null,
): PropertyDelegate<Intent, T> =
    Generic(
            ::getLongExtra,
            ::putExtra,
            reader,
            writer,
            name,
            customPrefix
    )

public inline fun <T> IntentExtra.Short(
        crossinline reader: TypeReader<T, Short?>,
        crossinline writer: TypeWriter<T, Short?>,
        name: String? = null,
        customPrefix: String? = null,
): PropertyDelegate<Intent, T> =
    Generic(
            ::getShortExtra,
            ::putExtra,
            reader,
            writer,
            name,
            customPrefix
    )

public inline fun <T> IntentExtra.Double(
        crossinline reader: TypeReader<T, Double?>,
        crossinline writer: TypeWriter<T, Double?>,
        name: String? = null,
        customPrefix: String? = null,
): PropertyDelegate<Intent, T> =
    Generic(
            ::getDoubleExtra,
            ::putExtra,
            reader,
            writer,
            name,
            customPrefix
    )

public inline fun <T> IntentExtra.Float(
        crossinline reader: TypeReader<T, Float?>,
        crossinline writer: TypeWriter<T, Float?>,
        name: String? = null,
        customPrefix: String? = null,
): PropertyDelegate<Intent, T> =
    Generic(
            ::getFloatExtra,
            ::putExtra,
            reader,
            writer,
            name,
            customPrefix
    )

public inline fun <T> IntentExtra.Char(
        crossinline reader: TypeReader<T, Char?>,
        crossinline writer: TypeWriter<T, Char?>,
        name: String? = null,
        customPrefix: String? = null,
): PropertyDelegate<Intent, T> =
    Generic(
            ::getCharExtra,
            ::putExtra,
            reader,
            writer,
            name,
            customPrefix
    )

public inline fun <T> IntentExtra.Byte(
        crossinline reader: TypeReader<T, Byte?>,
        crossinline writer: TypeWriter<T, Byte?>,
        name: String? = null,
        customPrefix: String? = null,
): PropertyDelegate<Intent, T> =
    Generic(
            ::getByteExtra,
            ::putExtra,
            reader,
            writer,
            name,
            customPrefix
    )
