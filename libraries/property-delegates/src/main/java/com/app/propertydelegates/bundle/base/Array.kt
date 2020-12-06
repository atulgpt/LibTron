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

@file:Suppress("NOTHING_TO_INLINE", "FunctionName", "unused")

package com.app.propertydelegates.bundle.base

import android.os.Build
import android.os.Bundle
import android.os.Parcelable
import androidx.annotation.RequiresApi
import com.app.propertydelegates.PropertyDelegate
import com.app.propertydelegates.bundle.BundleExtra

public inline fun BundleExtra.ParcelableArray(
    name: String? = null,
    customPrefix: String? = null
): PropertyDelegate<Bundle, Array<Parcelable?>?> =
    ParcelableArray({ it }, { it }, name, customPrefix)

public inline fun BundleExtra.ParcelableArray(
    defaultValue: Array<Parcelable?>,
    name: String? = null,
    customPrefix: String? = null
): PropertyDelegate<Bundle, Array<Parcelable?>> =
    ParcelableArray({ it ?: defaultValue }, { it }, name, customPrefix)

public inline fun BundleExtra.CharSequenceArray(
    name: String? = null,
    customPrefix: String? = null
): PropertyDelegate<Bundle, Array<CharSequence?>?> =
    CharSequenceArray({ it }, { it }, name, customPrefix)

public inline fun BundleExtra.CharSequenceArray(
    defaultValue: Array<CharSequence?>,
    name: String? = null,
    customPrefix: String? = null
): PropertyDelegate<Bundle, Array<CharSequence?>> =
    CharSequenceArray({ it ?: defaultValue }, { it }, name, customPrefix)

public inline fun BundleExtra.StringArray(
    name: String? = null,
    customPrefix: String? = null
): PropertyDelegate<Bundle, Array<String?>?> =
    StringArray({ it }, { it }, name, customPrefix)

public inline fun BundleExtra.StringArray(
    defaultValue: Array<String?>,
    name: String? = null,
    customPrefix: String? = null
): PropertyDelegate<Bundle, Array<String?>> =
    StringArray({ it ?: defaultValue }, { it }, name, customPrefix)

public inline fun BundleExtra.ByteArray(
    name: String? = null,
    customPrefix: String? = null
): PropertyDelegate<Bundle, ByteArray?> =
    ByteArray({ it }, { it }, name, customPrefix)

public inline fun BundleExtra.ByteArray(
    defaultValue: ByteArray,
    name: String? = null,
    customPrefix: String? = null
): PropertyDelegate<Bundle, ByteArray> =
    ByteArray({ it ?: defaultValue }, { it }, name, customPrefix)

public inline fun BundleExtra.CharArray(
    name: String? = null,
    customPrefix: String? = null
): PropertyDelegate<Bundle, CharArray?> =
    CharArray({ it }, { it }, name, customPrefix)

public inline fun BundleExtra.CharArray(
    defaultValue: CharArray,
    name: String? = null,
    customPrefix: String? = null
): PropertyDelegate<Bundle, CharArray> =
    CharArray({ it ?: defaultValue }, { it }, name, customPrefix)

public inline fun BundleExtra.IntArray(
    name: String? = null,
    customPrefix: String? = null
): PropertyDelegate<Bundle, IntArray?> =
    IntArray({ it }, { it }, name, customPrefix)

public inline fun BundleExtra.IntArray(
    defaultValue: IntArray,
    name: String? = null,
    customPrefix: String? = null
): PropertyDelegate<Bundle, IntArray> =
    IntArray({ it ?: defaultValue }, { it }, name, customPrefix)

public inline fun BundleExtra.ShortArray(
    name: String? = null,
    customPrefix: String? = null
): PropertyDelegate<Bundle, ShortArray?> =
    ShortArray({ it }, { it }, name, customPrefix)

public inline fun BundleExtra.ShortArray(
    defaultValue: ShortArray,
    name: String? = null,
    customPrefix: String? = null
): PropertyDelegate<Bundle, ShortArray> =
    ShortArray({ it ?: defaultValue }, { it }, name, customPrefix)

public inline fun BundleExtra.LongArray(
    name: String? = null,
    customPrefix: String? = null
): PropertyDelegate<Bundle, LongArray?> =
    LongArray({ it }, { it }, name, customPrefix)

public inline fun BundleExtra.LongArray(
    defaultValue: LongArray,
    name: String? = null,
    customPrefix: String? = null
): PropertyDelegate<Bundle, LongArray> =
    LongArray({ it ?: defaultValue }, { it }, name, customPrefix)

public inline fun BundleExtra.DoubleArray(
    name: String? = null,
    customPrefix: String? = null
): PropertyDelegate<Bundle, DoubleArray?> =
    DoubleArray({ it }, { it }, name, customPrefix)

public inline fun BundleExtra.DoubleArray(
    defaultValue: DoubleArray,
    name: String? = null,
    customPrefix: String? = null
): PropertyDelegate<Bundle, DoubleArray> =
    DoubleArray({ it ?: defaultValue }, { it }, name, customPrefix)

public inline fun BundleExtra.FloatArray(
    name: String? = null,
    customPrefix: String? = null
): PropertyDelegate<Bundle, FloatArray?> =
    FloatArray({ it }, { it }, name, customPrefix)

public inline fun BundleExtra.FloatArray(
    defaultValue: FloatArray,
    name: String? = null,
    customPrefix: String? = null
): PropertyDelegate<Bundle, FloatArray> =
    FloatArray({ it ?: defaultValue }, { it }, name, customPrefix)

@RequiresApi(Build.VERSION_CODES.LOLLIPOP_MR1)
public inline fun BundleExtra.BooleanArray(
    name: String? = null,
    customPrefix: String? = null
): PropertyDelegate<Bundle, BooleanArray?> =
    BooleanArray({ it }, { it }, name, customPrefix)

@RequiresApi(Build.VERSION_CODES.LOLLIPOP_MR1)
public inline fun BundleExtra.BooleanArray(
    defaultValue: BooleanArray,
    name: String? = null,
    customPrefix: String? = null
): PropertyDelegate<Bundle, BooleanArray> =
    BooleanArray({ it ?: defaultValue }, { it }, name, customPrefix)
