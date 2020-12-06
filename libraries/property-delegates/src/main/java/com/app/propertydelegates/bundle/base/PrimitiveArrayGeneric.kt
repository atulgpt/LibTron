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

import android.os.Build
import android.os.Bundle
import androidx.annotation.RequiresApi
import com.app.propertydelegates.PropertyDelegate
import com.app.propertydelegates.TypeReader
import com.app.propertydelegates.TypeWriter
import com.app.propertydelegates.bundle.BundleExtra
import com.app.propertydelegates.bundle.Generic

@RequiresApi(Build.VERSION_CODES.LOLLIPOP_MR1)
public inline fun <T> BundleExtra.BooleanArray(
    crossinline reader: TypeReader<T, BooleanArray?>,
    crossinline writer: TypeWriter<T, BooleanArray?>,
    name: String? = null,
    customPrefix: String? = null,
): PropertyDelegate<Bundle, T> =
    Generic(
        Bundle::getBooleanArray,
        Bundle::putBooleanArray,
        reader,
        writer,
        name,
        customPrefix
    )

public inline fun <T> BundleExtra.ByteArray(
    crossinline reader: TypeReader<T, ByteArray?>,
    crossinline writer: TypeWriter<T, ByteArray?>,
    name: String? = null,
    customPrefix: String? = null,
): PropertyDelegate<Bundle, T> =
    Generic(
        Bundle::getByteArray,
        Bundle::putByteArray,
        reader,
        writer,
        name,
        customPrefix
    )

public inline fun <T> BundleExtra.CharArray(
    crossinline reader: TypeReader<T, CharArray?>,
    crossinline writer: TypeWriter<T, CharArray?>,
    name: String? = null,
    customPrefix: String? = null,
): PropertyDelegate<Bundle, T> =
    Generic(
        Bundle::getCharArray,
        Bundle::putCharArray,
        reader,
        writer,
        name,
        customPrefix
    )

public inline fun <T> BundleExtra.IntArray(
    crossinline reader: TypeReader<T, IntArray?>,
    crossinline writer: TypeWriter<T, IntArray?>,
    name: String? = null,
    customPrefix: String? = null,
): PropertyDelegate<Bundle, T> =
    Generic(
        Bundle::getIntArray,
        Bundle::putIntArray,
        reader,
        writer,
        name,
        customPrefix
    )

public inline fun <T> BundleExtra.ShortArray(
    crossinline reader: TypeReader<T, ShortArray?>,
    crossinline writer: TypeWriter<T, ShortArray?>,
    name: String? = null,
    customPrefix: String? = null,
): PropertyDelegate<Bundle, T> =
    Generic(
        Bundle::getShortArray,
        Bundle::putShortArray,
        reader,
        writer,
        name,
        customPrefix
    )

public inline fun <T> BundleExtra.LongArray(
    crossinline reader: TypeReader<T, LongArray?>,
    crossinline writer: TypeWriter<T, LongArray?>,
    name: String? = null,
    customPrefix: String? = null,
): PropertyDelegate<Bundle, T> =
    Generic(
        Bundle::getLongArray,
        Bundle::putLongArray,
        reader,
        writer,
        name,
        customPrefix
    )

public inline fun <T> BundleExtra.DoubleArray(
    crossinline reader: TypeReader<T, DoubleArray?>,
    crossinline writer: TypeWriter<T, DoubleArray?>,
    name: String? = null,
    customPrefix: String? = null,
): PropertyDelegate<Bundle, T> =
    Generic(
        Bundle::getDoubleArray,
        Bundle::putDoubleArray,
        reader,
        writer,
        name,
        customPrefix
    )

public inline fun <T> BundleExtra.FloatArray(
    crossinline reader: TypeReader<T, FloatArray?>,
    crossinline writer: TypeWriter<T, FloatArray?>,
    name: String? = null,
    customPrefix: String? = null,
): PropertyDelegate<Bundle, T> =
    Generic(
        Bundle::getFloatArray,
        Bundle::putFloatArray,
        reader,
        writer,
        name,
        customPrefix
    )
