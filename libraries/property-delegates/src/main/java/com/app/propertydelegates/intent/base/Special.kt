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
import android.os.Bundle
import android.os.Parcelable
import com.app.propertydelegates.PropertyDelegate
import com.app.propertydelegates.intent.IntentExtra
import com.app.propertydelegates.intent.IntentPropertyDelegate
import java.io.Serializable

public inline fun IntentExtra.Bundle(
        name: String? = null,
        customPrefix: String? = null
): PropertyDelegate<Intent, Bundle?> =
    Bundle({ it }, { it }, name, customPrefix)

public inline fun IntentExtra.Bundle(
        defaultValue: Bundle,
        name: String? = null,
        customPrefix: String? = null
): PropertyDelegate<Intent, Bundle> =
    Bundle({ it ?: defaultValue }, { it }, name, customPrefix)

public inline fun IntentExtra.CharSequence(
        name: String? = null,
        customPrefix: String? = null
): PropertyDelegate<Intent, CharSequence?> =
    CharSequence({ it }, { it }, name, customPrefix)

public inline fun IntentExtra.CharSequence(
        defaultValue: CharSequence,
        name: String? = null,
        customPrefix: String? = null
): PropertyDelegate<Intent, CharSequence> =
    CharSequence({ it ?: defaultValue }, { it }, name, customPrefix)

public inline fun IntentExtra.String(
        name: String? = null,
        customPrefix: String? = null
): PropertyDelegate<Intent, String?> =
    String({ it }, { it }, name, customPrefix)

public inline fun IntentExtra.String(
        defaultValue: String,
        name: String? = null,
        customPrefix: String? = null
): PropertyDelegate<Intent, String> =
    String({ it ?: defaultValue }, { it }, name, customPrefix)

public inline fun <T : Parcelable>
        IntentExtra.Parcelable(
        name: String? = null,
        customPrefix: String? = null
): PropertyDelegate<Intent, T?> =
    Parcelable<T?, T>({ it }, { it }, name, customPrefix)

public inline fun <T : Parcelable>
        IntentExtra.Parcelable(
        defaultValue: T,
        name: String? = null,
        customPrefix: String? = null
): IntentPropertyDelegate<T> =
    Parcelable({ it ?: defaultValue }, { it }, name, customPrefix)

public inline fun <T : Serializable>
        IntentExtra.Serializable(
        name: String? = null,
        customPrefix: String? = null
): IntentPropertyDelegate<T?> =
    Serializable<T?, T>({ it }, { it }, name, customPrefix)

public inline fun <T : Serializable>
        IntentExtra.Serializable(
        defaultValue: T,
        name: String? = null,
        customPrefix: String? = null
): IntentPropertyDelegate<T> =
    Serializable({ it ?: defaultValue }, { it }, name, customPrefix)
