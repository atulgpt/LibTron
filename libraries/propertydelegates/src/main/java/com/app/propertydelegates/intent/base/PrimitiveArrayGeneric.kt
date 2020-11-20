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
import com.app.propertydelegates.intent.Generic
import com.app.propertydelegates.intent.IntentExtra

public inline fun <T> IntentExtra.BooleanArray(
        crossinline reader: TypeReader<T, BooleanArray?>,
        crossinline writer: TypeWriter<T, BooleanArray?>,
        name: String? = null,
        customPrefix: String? = null,
): PropertyDelegate<Intent, T> =
        Generic(
                Intent::getBooleanArrayExtra,
                Intent::putExtra,
                reader,
                writer,
                name,
                customPrefix)

public inline fun <T> IntentExtra.ByteArray(
        crossinline reader: TypeReader<T, ByteArray?>,
        crossinline writer: TypeWriter<T, ByteArray?>,
        name: String? = null,
        customPrefix: String? = null,
): PropertyDelegate<Intent, T> =
        Generic(
                Intent::getByteArrayExtra,
                Intent::putExtra,
                reader,
                writer,
                name,
                customPrefix)

public inline fun <T> IntentExtra.CharArray(
        crossinline reader: TypeReader<T, CharArray?>,
        crossinline writer: TypeWriter<T, CharArray?>,
        name: String? = null,
        customPrefix: String? = null,
): PropertyDelegate<Intent, T> =
        Generic(
                Intent::getCharArrayExtra,
                Intent::putExtra,
                reader,
                writer,
                name,
                customPrefix)

public inline fun <T> IntentExtra.IntArray(
        crossinline reader: TypeReader<T, IntArray?>,
        crossinline writer: TypeWriter<T, IntArray?>,
        name: String? = null,
        customPrefix: String? = null,
): PropertyDelegate<Intent, T> =
        Generic(
                Intent::getIntArrayExtra,
                Intent::putExtra,
                reader,
                writer,
                name,
                customPrefix)

public inline fun <T> IntentExtra.ShortArray(
        crossinline reader: TypeReader<T, ShortArray?>,
        crossinline writer: TypeWriter<T, ShortArray?>,
        name: String? = null,
        customPrefix: String? = null,
): PropertyDelegate<Intent, T> =
        Generic(
                Intent::getShortArrayExtra,
                Intent::putExtra,
                reader,
                writer,
                name,
                customPrefix)

public inline fun <T> IntentExtra.LongArray(
        crossinline reader: TypeReader<T, LongArray?>,
        crossinline writer: TypeWriter<T, LongArray?>,
        name: String? = null,
        customPrefix: String? = null,
): PropertyDelegate<Intent, T> =
        Generic(
                Intent::getLongArrayExtra,
                Intent::putExtra,
                reader,
                writer,
                name,
                customPrefix)

public inline fun <T> IntentExtra.DoubleArray(
        crossinline reader: TypeReader<T, DoubleArray?>,
        crossinline writer: TypeWriter<T, DoubleArray?>,
        name: String? = null,
        customPrefix: String? = null,
): PropertyDelegate<Intent, T> =
        Generic(
                Intent::getDoubleArrayExtra,
                Intent::putExtra,
                reader,
                writer,
                name,
                customPrefix)

public inline fun <T> IntentExtra.FloatArray(
        crossinline reader: TypeReader<T, FloatArray?>,
        crossinline writer: TypeWriter<T, FloatArray?>,
        name: String? = null,
        customPrefix: String? = null,
): PropertyDelegate<Intent, T> =
        Generic(
                Intent::getFloatArrayExtra,
                Intent::putExtra,
                reader,
                writer,
                name,
                customPrefix)
