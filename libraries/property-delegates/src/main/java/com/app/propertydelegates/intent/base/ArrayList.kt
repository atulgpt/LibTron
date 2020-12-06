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

@file:Suppress("NOTHING_TO_INLINE", "unused", "FunctionName")

package com.app.propertydelegates.intent.base

import android.content.Intent
import android.os.Parcelable
import com.app.propertydelegates.PropertyDelegate
import com.app.propertydelegates.intent.IntentExtra
import com.app.propertydelegates.intent.IntentPropertyDelegate
import java.util.*

public inline fun IntentExtra.CharSequenceArrayList(
    name: String? = null,
    customPrefix: String? = null
): PropertyDelegate<Intent, ArrayList<CharSequence?>?> =
    CharSequenceArrayList({ it }, { it }, name, customPrefix)

public inline fun IntentExtra.CharSequenceArrayList(
    defaultValue: ArrayList<CharSequence?>,
    name: String? = null,
    customPrefix: String? = null
): PropertyDelegate<Intent, ArrayList<CharSequence?>> =
    CharSequenceArrayList({ it ?: defaultValue }, { it }, name, customPrefix)

public inline fun IntentExtra.StringArrayList(
    name: String? = null,
    customPrefix: String? = null
): PropertyDelegate<Intent, ArrayList<String?>?> =
    StringArrayList({ it }, { it }, name, customPrefix)

public inline fun IntentExtra.StringArrayList(
    defaultValue: ArrayList<String?>,
    name: String? = null,
    customPrefix: String? = null
): PropertyDelegate<Intent, ArrayList<String?>> =
    StringArrayList({ it ?: defaultValue }, { it }, name, customPrefix)

public inline fun IntentExtra.IntArrayList(
    name: String? = null,
    customPrefix: String? = null
): PropertyDelegate<Intent, ArrayList<Int?>?> =
    IntArrayList({ it }, { it }, name, customPrefix)

public inline fun IntentExtra.IntArrayList(
    defaultValue: ArrayList<Int?>,
    name: String? = null,
    customPrefix: String? = null
): PropertyDelegate<Intent, ArrayList<Int?>> =
    IntArrayList({ it ?: defaultValue }, { it }, name, customPrefix)

public inline fun <T : Parcelable> IntentExtra.ParcelableArrayList(
    name: String? = null,
    customPrefix: String? = null,
): IntentPropertyDelegate<ArrayList<T?>?> =
    ParcelableArrayList<ArrayList<T?>?, T>({ it }, { it }, name, customPrefix)

public inline fun <T : Parcelable> IntentExtra.ParcelableArrayList(
    defaultValue: ArrayList<T?>,
    name: String? = null,
    customPrefix: String? = null,
): IntentPropertyDelegate<ArrayList<T?>?> =
    ParcelableArrayList<ArrayList<T?>?, T>({ it ?: defaultValue }, { it }, name, customPrefix)
