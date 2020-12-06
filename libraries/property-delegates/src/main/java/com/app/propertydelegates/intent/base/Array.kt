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

package com.app.propertydelegates.intent.base

import android.content.Intent
import android.os.Parcelable
import com.app.propertydelegates.PropertyDelegate
import com.app.propertydelegates.intent.IntentExtra

public inline fun IntentExtra.ParcelableArray(
    name: String? = null,
    customPrefix: String? = null
): PropertyDelegate<Intent, Array<Parcelable?>?> =
    ParcelableArray({ it }, { it }, name, customPrefix)

public inline fun IntentExtra.ParcelableArray(
    defaultValue: Array<Parcelable?>,
    name: String? = null,
    customPrefix: String? = null
): PropertyDelegate<Intent, Array<Parcelable?>> =
    ParcelableArray({ it ?: defaultValue }, { it }, name, customPrefix)

public inline fun IntentExtra.CharSequenceArray(
    name: String? = null,
    customPrefix: String? = null
): PropertyDelegate<Intent, Array<CharSequence?>?> =
    CharSequenceArray({ it }, { it }, name, customPrefix)

public inline fun IntentExtra.CharSequenceArray(
    defaultValue: Array<CharSequence?>,
    name: String? = null,
    customPrefix: String? = null
): PropertyDelegate<Intent, Array<CharSequence?>> =
    CharSequenceArray({ it ?: defaultValue }, { it }, name, customPrefix)

public inline fun IntentExtra.StringArray(
    name: String? = null,
    customPrefix: String? = null
): PropertyDelegate<Intent, Array<String?>?> =
    StringArray({ it }, { it }, name, customPrefix)

public inline fun IntentExtra.StringArray(
    defaultValue: Array<String?>,
    name: String? = null,
    customPrefix: String? = null
): PropertyDelegate<Intent, Array<String?>> =
    StringArray({ it ?: defaultValue }, { it }, name, customPrefix)

public inline fun IntentExtra.ByteArray(
    name: String? = null,
    customPrefix: String? = null
): PropertyDelegate<Intent, ByteArray?> =
    ByteArray({ it }, { it }, name, customPrefix)

public inline fun IntentExtra.ByteArray(
    defaultValue: ByteArray,
    name: String? = null,
    customPrefix: String? = null
): PropertyDelegate<Intent, ByteArray> =
    ByteArray({ it ?: defaultValue }, { it }, name, customPrefix)

public inline fun IntentExtra.CharArray(
    name: String? = null,
    customPrefix: String? = null
): PropertyDelegate<Intent, CharArray?> =
    CharArray({ it }, { it }, name, customPrefix)

public inline fun IntentExtra.CharArray(
    defaultValue: CharArray,
    name: String? = null,
    customPrefix: String? = null
): PropertyDelegate<Intent, CharArray> =
    CharArray({ it ?: defaultValue }, { it }, name, customPrefix)

public inline fun IntentExtra.IntArray(
    name: String? = null,
    customPrefix: String? = null
): PropertyDelegate<Intent, IntArray?> =
    IntArray({ it }, { it }, name, customPrefix)

public inline fun IntentExtra.IntArray(
    defaultValue: IntArray,
    name: String? = null,
    customPrefix: String? = null
): PropertyDelegate<Intent, IntArray> =
    IntArray({ it ?: defaultValue }, { it }, name, customPrefix)

public inline fun IntentExtra.ShortArray(
    name: String? = null,
    customPrefix: String? = null
): PropertyDelegate<Intent, ShortArray?> =
    ShortArray({ it }, { it }, name, customPrefix)

public inline fun IntentExtra.ShortArray(
    defaultValue: ShortArray,
    name: String? = null,
    customPrefix: String? = null
): PropertyDelegate<Intent, ShortArray> =
    ShortArray({ it ?: defaultValue }, { it }, name, customPrefix)

public inline fun IntentExtra.LongArray(
    name: String? = null,
    customPrefix: String? = null
): PropertyDelegate<Intent, LongArray?> =
    LongArray({ it }, { it }, name, customPrefix)

public inline fun IntentExtra.LongArray(
    defaultValue: LongArray,
    name: String? = null,
    customPrefix: String? = null
): PropertyDelegate<Intent, LongArray> =
    LongArray({ it ?: defaultValue }, { it }, name, customPrefix)

public inline fun IntentExtra.DoubleArray(
    name: String? = null,
    customPrefix: String? = null
): PropertyDelegate<Intent, DoubleArray?> =
    DoubleArray({ it }, { it }, name, customPrefix)

public inline fun IntentExtra.DoubleArray(
    defaultValue: DoubleArray,
    name: String? = null,
    customPrefix: String? = null
): PropertyDelegate<Intent, DoubleArray> =
    DoubleArray({ it ?: defaultValue }, { it }, name, customPrefix)

public inline fun IntentExtra.FloatArray(
    name: String? = null,
    customPrefix: String? = null
): PropertyDelegate<Intent, FloatArray?> =
    FloatArray({ it }, { it }, name, customPrefix)

public inline fun IntentExtra.FloatArray(
    defaultValue: FloatArray,
    name: String? = null,
    customPrefix: String? = null
): PropertyDelegate<Intent, FloatArray> =
    FloatArray({ it ?: defaultValue }, { it }, name, customPrefix)

public inline fun IntentExtra.BooleanArray(
    name: String? = null,
    customPrefix: String? = null
): PropertyDelegate<Intent, BooleanArray?> =
    BooleanArray({ it }, { it }, name, customPrefix)

public inline fun IntentExtra.BooleanArray(
    defaultValue: BooleanArray,
    name: String? = null,
    customPrefix: String? = null
): PropertyDelegate<Intent, BooleanArray> =
    BooleanArray({ it ?: defaultValue }, { it }, name, customPrefix)