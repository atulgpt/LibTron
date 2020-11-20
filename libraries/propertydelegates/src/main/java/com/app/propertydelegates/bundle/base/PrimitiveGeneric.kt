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

package com.app.propertydelegates.bundle.base

import android.os.Bundle
import com.app.propertydelegates.PropertyDelegate
import com.app.propertydelegates.TypeReader
import com.app.propertydelegates.TypeWriter
import com.app.propertydelegates.bundle.*

public inline fun <T> BundleExtra.Boolean(
        crossinline reader: TypeReader<T, Boolean?>,
        crossinline writer: TypeWriter<T, Boolean?>,
        name: String? = null,
        customPrefix: String? = null,
): PropertyDelegate<Bundle, T> =
        Generic(
                ::getBoolean,
                ::putBoolean,
                reader,
                writer,
                name,
                customPrefix
        )

public inline fun <T> BundleExtra.Int(
        crossinline reader: TypeReader<T, Int?>,
        crossinline writer: TypeWriter<T, Int?>,
        name: String? = null,
        customPrefix: String? = null,
): PropertyDelegate<Bundle, T> =
        Generic(
                ::getInt,
                ::putInt,
                reader,
                writer,
                name,
                customPrefix
        )

public inline fun <T> BundleExtra.Long(
        crossinline reader: TypeReader<T, Long?>,
        crossinline writer: TypeWriter<T, Long?>,
        name: String? = null,
        customPrefix: String? = null,
): PropertyDelegate<Bundle, T> =
        Generic(
                ::getLong,
                ::putLong,
                reader,
                writer,
                name,
                customPrefix
        )

public inline fun <T> BundleExtra.Short(
        crossinline reader: TypeReader<T, Short?>,
        crossinline writer: TypeWriter<T, Short?>,
        name: String? = null,
        customPrefix: String? = null,
): PropertyDelegate<Bundle, T> =
        Generic(
                ::getShort,
                ::putShort,
                reader,
                writer,
                name,
                customPrefix
        )

public inline fun <T> BundleExtra.Double(
        crossinline reader: TypeReader<T, Double?>,
        crossinline writer: TypeWriter<T, Double?>,
        name: String? = null,
        customPrefix: String? = null,
): PropertyDelegate<Bundle, T> =
        Generic(
                ::getDouble,
                ::putDouble,
                reader,
                writer,
                name,
                customPrefix
        )

public inline fun <T> BundleExtra.Float(
        crossinline reader: TypeReader<T, Float?>,
        crossinline writer: TypeWriter<T, Float?>,
        name: String? = null,
        customPrefix: String? = null,
): PropertyDelegate<Bundle, T> =
        Generic(
                ::getFloat,
                ::putFloat,
                reader,
                writer,
                name,
                customPrefix
        )

public inline fun <T> BundleExtra.Char(
        crossinline reader: TypeReader<T, Char?>,
        crossinline writer: TypeWriter<T, Char?>,
        name: String? = null,
        customPrefix: String? = null,
): PropertyDelegate<Bundle, T> =
        Generic(
                ::getChar,
                ::putChar,
                reader,
                writer,
                name,
                customPrefix
        )

public inline fun <T> BundleExtra.Byte(
        crossinline reader: TypeReader<T, Byte?>,
        crossinline writer: TypeWriter<T, Byte?>,
        name: String? = null,
        customPrefix: String? = null,
): PropertyDelegate<Bundle, T> =
        Generic(
                ::getByte,
                ::putByte,
                reader,
                writer,
                name,
                customPrefix
        )
