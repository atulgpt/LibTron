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
import com.app.propertydelegates.PropertyDelegate
import com.app.propertydelegates.intent.IntentExtra

public inline fun IntentExtra.Boolean(
    name: String? = null,
    customPrefix: String? = null
): PropertyDelegate<Intent, Boolean?> =
    Boolean({ it }, { it }, name, customPrefix)

public inline fun IntentExtra.Boolean(
    defaultValue: Boolean,
    name: String? = null,
    customPrefix: String? = null
): PropertyDelegate<Intent, Boolean> =
    Boolean({ it ?: defaultValue }, { it }, name, customPrefix)

public inline fun IntentExtra.Byte(
    name: String? = null,
    customPrefix: String? = null
): PropertyDelegate<Intent, Byte?> =
    Byte({ it }, { it }, name, customPrefix)

public inline fun IntentExtra.Byte(
    defaultValue: Byte,
    name: String? = null,
    customPrefix: String? = null
): PropertyDelegate<Intent, Byte> =
    Byte({ it ?: defaultValue }, { it }, name, customPrefix)

public inline fun IntentExtra.Char(
    name: String? = null,
    customPrefix: String? = null
): PropertyDelegate<Intent, Char?> =
    Char({ it }, { it }, name, customPrefix)

public inline fun IntentExtra.Char(
    defaultValue: Char,
    name: String? = null,
    customPrefix: String? = null
): PropertyDelegate<Intent, Char> =
    Char({ it ?: defaultValue }, { it }, name, customPrefix)

public inline fun IntentExtra.Int(
    name: String? = null,
    customPrefix: String? = null
): PropertyDelegate<Intent, Int?> =
    Int({ it }, { it }, name, customPrefix)

public inline fun IntentExtra.Int(
    defaultValue: Int,
    name: String? = null,
    customPrefix: String? = null
): PropertyDelegate<Intent, Int> =
    Int({ it ?: defaultValue }, { it }, name, customPrefix)

public inline fun IntentExtra.Double(
    name: String? = null,
    customPrefix: String? = null
): PropertyDelegate<Intent, Double?> =
    Double({ it }, { it }, name, customPrefix)

public inline fun IntentExtra.Double(
    defaultValue: Double,
    name: String? = null,
    customPrefix: String? = null
): PropertyDelegate<Intent, Double> =
    Double({ it ?: defaultValue }, { it }, name, customPrefix)

public inline fun IntentExtra.Float(
    name: String? = null,
    customPrefix: String? = null
): PropertyDelegate<Intent, Float?> =
    Float({ it }, { it }, name, customPrefix)

public inline fun IntentExtra.Float(
    defaultValue: Float,
    name: String? = null,
    customPrefix: String? = null
): PropertyDelegate<Intent, Float> =
    Float({ it ?: defaultValue }, { it }, name, customPrefix)

public inline fun IntentExtra.Short(
    name: String? = null,
    customPrefix: String? = null
): PropertyDelegate<Intent, Short?> =
    Short({ it }, { it }, name, customPrefix)

public inline fun IntentExtra.Short(
    defaultValue: Short,
    name: String? = null,
    customPrefix: String? = null
): PropertyDelegate<Intent, Short> =
    Short({ it ?: defaultValue }, { it }, name, customPrefix)

public inline fun IntentExtra.Long(
    name: String? = null,
    customPrefix: String? = null
): PropertyDelegate<Intent, Long?> =
    Long({ it }, { it }, name, customPrefix)

public inline fun IntentExtra.Long(
    defaultValue: Long,
    name: String? = null,
    customPrefix: String? = null
): PropertyDelegate<Intent, Long> =
    Long({ it ?: defaultValue }, { it }, name, customPrefix)
