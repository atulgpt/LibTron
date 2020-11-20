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

import android.os.Bundle
import com.app.propertydelegates.PropertyDelegate
import com.app.propertydelegates.bundle.BundleExtra

public inline fun BundleExtra.Boolean(
        name: String? = null,
        customPrefix: String? = null,
): PropertyDelegate<Bundle, Boolean?> =
        Boolean({ it }, { it }, name, customPrefix)

public inline fun BundleExtra.Boolean(
        defaultValue: Boolean,
        name: String? = null,
        customPrefix: String? = null,
): PropertyDelegate<Bundle, Boolean> =
        Boolean({ it ?: defaultValue }, { it }, name, customPrefix)

public inline fun BundleExtra.Byte(
        name: String? = null,
        customPrefix: String? = null,
): PropertyDelegate<Bundle, Byte?> =
        Byte({ it }, { it }, name, customPrefix)

public inline fun BundleExtra.Byte(
        defaultValue: Byte,
        name: String? = null,
        customPrefix: String? = null,
): PropertyDelegate<Bundle, Byte> =
        Byte({ it ?: defaultValue }, { it }, name, customPrefix)

public inline fun BundleExtra.Char(
        name: String? = null,
        customPrefix: String? = null,
): PropertyDelegate<Bundle, Char?> =
        Char({ it }, { it }, name, customPrefix)

public inline fun BundleExtra.Char(
        defaultValue: Char,
        name: String? = null,
        customPrefix: String? = null,
): PropertyDelegate<Bundle, Char> =
        Char({ it ?: defaultValue }, { it }, name, customPrefix)

public inline fun BundleExtra.Int(
        name: String? = null,
        customPrefix: String? = null,
): PropertyDelegate<Bundle, Int?> =
        Int({ it }, { it }, name, customPrefix)

public inline fun BundleExtra.Int(
        defaultValue: Int,
        name: String? = null,
        customPrefix: String? = null,
): PropertyDelegate<Bundle, Int> =
        Int({ it ?: defaultValue }, { it }, name, customPrefix)

public inline fun BundleExtra.Double(
        name: String? = null,
        customPrefix: String? = null,
): PropertyDelegate<Bundle, Double?> =
        Double({ it }, { it }, name, customPrefix)

public inline fun BundleExtra.Double(
        defaultValue: Double,
        name: String? = null,
        customPrefix: String? = null,
): PropertyDelegate<Bundle, Double> =
        Double({ it ?: defaultValue }, { it }, name, customPrefix)

public inline fun BundleExtra.Float(
        name: String? = null,
        customPrefix: String? = null,
): PropertyDelegate<Bundle, Float?> =
        Float({ it }, { it }, name, customPrefix)

public inline fun BundleExtra.Float(
        defaultValue: Float,
        name: String? = null,
        customPrefix: String? = null,
): PropertyDelegate<Bundle, Float> =
        Float({ it ?: defaultValue }, { it }, name, customPrefix)

public inline fun BundleExtra.Short(
        name: String? = null,
        customPrefix: String? = null,
): PropertyDelegate<Bundle, Short?> =
        Short({ it }, { it }, name, customPrefix)

public inline fun BundleExtra.Short(
        defaultValue: Short,
        name: String? = null,
        customPrefix: String? = null,
): PropertyDelegate<Bundle, Short> =
        Short({ it ?: defaultValue }, { it }, name, customPrefix)

public inline fun BundleExtra.Long(
        name: String? = null,
        customPrefix: String? = null,
): PropertyDelegate<Bundle, Long?> =
        Long({ it }, { it }, name, customPrefix)

public inline fun BundleExtra.Long(
        defaultValue: Long,
        name: String? = null,
        customPrefix: String? = null,
): PropertyDelegate<Bundle, Long> =
        Long({ it ?: defaultValue }, { it }, name, customPrefix)
