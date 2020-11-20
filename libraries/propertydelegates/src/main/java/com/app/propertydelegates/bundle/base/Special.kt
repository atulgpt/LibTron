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

package com.app.propertydelegates.bundle.base

import android.os.Bundle
import android.os.Parcelable
import com.app.propertydelegates.PropertyDelegate
import com.app.propertydelegates.bundle.BundleExtra
import com.app.propertydelegates.bundle.BundlePropertyDelegate
import java.io.Serializable

public inline fun BundleExtra.Bundle(
        name: String? = null,
        customPrefix: String? = null,
): PropertyDelegate<Bundle, Bundle?> =
        Bundle({ it }, { it }, name, customPrefix)

public inline fun BundleExtra.Bundle(
        defaultValue: Bundle,
        name: String? = null,
        customPrefix: String? = null,
): PropertyDelegate<Bundle, Bundle> =
        Bundle({ it ?: defaultValue }, { it }, name, customPrefix)

public inline fun BundleExtra.CharSequence(
        name: String? = null,
        customPrefix: String? = null,
): PropertyDelegate<Bundle, CharSequence?> =
        CharSequence({ it }, { it }, name, customPrefix)

public inline fun BundleExtra.CharSequence(
        defaultValue: CharSequence,
        name: String? = null,
        customPrefix: String? = null,
): PropertyDelegate<Bundle, CharSequence> =
        CharSequence({ it ?: defaultValue }, { it }, name, customPrefix)

public inline fun BundleExtra.String(
        name: String? = null,
        customPrefix: String? = null,
): PropertyDelegate<Bundle, String?> =
        String({ it }, { it }, name, customPrefix)

public inline fun BundleExtra.String(
        defaultValue: String,
        name: String? = null,
        customPrefix: String? = null,
): PropertyDelegate<Bundle, String> =
        String({ it ?: defaultValue }, { it }, name, customPrefix)

public inline fun <T : Parcelable> BundleExtra.Parcelable(
        name: String? = null,
        customPrefix: String? = null,
): PropertyDelegate<Bundle, T?> =
        Parcelable<T?, T>({ it }, { it }, name, customPrefix)

public inline fun <T : Parcelable>
        BundleExtra.Parcelable(
        defaultValue: T,
        name: String? = null,
        customPrefix: String? = null,
): BundlePropertyDelegate<T> =
        Parcelable({ it ?: defaultValue }, { it }, name, customPrefix)

public inline fun <T : Serializable>
        BundleExtra.Serializable(
        name: String? = null,
        customPrefix: String? = null,
): BundlePropertyDelegate<T?> =
        Serializable<T?, T>({ it }, { it }, name, customPrefix)

public inline fun <T : Serializable>
        BundleExtra.Serializable(
        defaultValue: T,
        name: String? = null,
        customPrefix: String? = null,
): BundlePropertyDelegate<T> =
        Serializable({ it ?: defaultValue }, { it }, name, customPrefix)
