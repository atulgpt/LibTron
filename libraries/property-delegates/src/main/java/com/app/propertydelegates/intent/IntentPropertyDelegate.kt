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

package com.app.propertydelegates.intent

import android.content.Intent
import com.app.propertydelegates.*

internal typealias IntentPropertyDelegate<T> = PropertyDelegate<Intent, T>

/**
 * Helper to create an [IntentPropertyDelegate].
 *
 * @param R The raw type that will be read/written directly to the [Intent].
 * @param T The transformed type (from [R]) that will be read/written from the property.
 * @param typeReader Transforms the raw type [R] in the property type [T] when reading from the [Intent].
 * @param typeWriter Transforms the property type [T] in the raw type [R] when writing to the [Intent].
 * @param intentReader Reads the value from the [Intent].
 * @param intentWriter Writes the value to the [Intent].
 * @param name An optional name for the [Intent] extra. If missing, a compile-time constant will be used equal to the qualified name of the class
 * in which the property is declared plus the name of the property itself.
 * @param customPrefix An optional prefix for the [Intent] extra, to be used before the property name.
 * Note that this is ignored if [name] is present.
 */
@Suppress("FunctionName", "unused")
@PublishedApi
internal inline fun <T, R> IntentExtra.Generic(
    crossinline intentReader: ExtraReader<Intent, R>,
    crossinline intentWriter: ExtraWriter<Intent, R>,
    crossinline typeReader: TypeReader<T, R>,
    crossinline typeWriter: TypeWriter<T, R>,
    name: String? = null,
    customPrefix: String? = null,
): IntentPropertyDelegate<T> =
    PropertyDelegate(intentReader, intentWriter, typeReader, typeWriter, name, customPrefix)
