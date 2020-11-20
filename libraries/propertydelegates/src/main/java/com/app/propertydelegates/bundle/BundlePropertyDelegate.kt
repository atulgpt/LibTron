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

package com.app.propertydelegates.bundle

import android.os.Bundle
import com.app.propertydelegates.*

internal typealias BundlePropertyDelegate<T> = PropertyDelegate<Bundle, T>

/**
 * Helper to create an [BundlePropertyDelegate].
 *
 * @param R The raw type that will be read/written directly to the [Bundle].
 * @param T The transformed type (from [R]) that will be read/written from the property.
 * @param typeReader Transforms the raw type [R] in the property type [T] when reading from the [Bundle].
 * @param typeWriter Transforms the property type [T] in the raw type [R] when writing to the [Bundle].
 * @param bundleReader Reads the value from the [Bundle].
 * @param bundleWriter Writes the value to the [Bundle].
 * @param name An optional name for the [Bundle] extra. If missing, a compile-time constant will be used equal to the qualified name of the class
 * in which the property is declared plus the name of the property itself.
 * @param customPrefix An optional prefix for the [Bundle] extra, to be used before the property name.
 * Note that this is ignored if [name] is present.
 */
@Suppress("unused")
@PublishedApi
internal inline fun <T, R> BundleExtra.Generic(
        crossinline bundleReader: ExtraReader<Bundle, R>,
        crossinline bundleWriter: ExtraWriter<Bundle, R>,
        crossinline typeReader: TypeReader<T, R>,
        crossinline typeWriter: TypeWriter<T, R>,
        name: String? = null,
        customPrefix: String? = null,
): BundlePropertyDelegate<T> =
        PropertyDelegate(bundleReader, bundleWriter, typeReader, typeWriter, name, customPrefix)
