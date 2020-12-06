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

package com.app.propertydelegates

import kotlin.reflect.KProperty

internal typealias TypeReader<T, R> = (R) -> T
internal typealias TypeWriter<T, R> = (T) -> R

internal typealias ExtraReader<This, R> = This.(name: String) -> R
internal typealias ExtraWriter<This, R> = This.(name: String, value: R) -> Any?

public interface DelegateProvider<out T> {
    public operator fun provideDelegate(thisRef: Any?, property: KProperty<*>): T
}

/**
 * A property delegate that can read and write from a receiver of type [This].
 */
public interface PropertyDelegate<in This, T> : DelegateProvider<PropertyDelegate<This, T>> {
    public operator fun getValue(thisRef: This, property: KProperty<*>): T
    public operator fun setValue(thisRef: This, property: KProperty<*>, value: T)
}

/**
 * Helper to create a [PropertyDelegate].
 *
 * @param R The raw type that will be read/written directly to the receiver of type [This].
 * @param T The transformed type (from [R]) that will be read/written from the property.
 * @param typeReader Transforms the raw type [R] in the property type [T] when reading from the receiver of type [This].
 * @param typeWriter Transforms the property type [T] in the raw type [R] when writing to the receiver of type [This].
 * @param extraReader Reads the value from the receiver of type [This].
 * @param extraWriter Writes the value to the receiver of type [This].
 * @param name An optional name for the property. If missing, a compile-time constant will be used equal to the qualified name of the class
 * in which the property is declared plus the real name of the property itself.
 * @param customPrefix An optional prefix for the property name, to be used before the real name of the property.
 * Note that this is ignored if [name] is present.
 */
@Suppress("FunctionName")
@PublishedApi
internal inline fun <This, T, R> PropertyDelegate(
    crossinline extraReader: ExtraReader<This, R>,
    crossinline extraWriter: ExtraWriter<This, R>,
    crossinline typeReader: TypeReader<T, R>,
    crossinline typeWriter: TypeWriter<T, R>,
    name: String? = null,
    customPrefix: String? = null,
): PropertyDelegate<This, T> = object : PropertyDelegate<This, T> {

    private lateinit var name: String

    override operator fun provideDelegate(thisRef: Any?, property: KProperty<*>) = apply {
        this.name = name ?: property.defaultDelegateName(customPrefix)
    }

    override fun getValue(thisRef: This, property: KProperty<*>): T =
        typeReader(extraReader(thisRef, this.name))

    override fun setValue(thisRef: This, property: KProperty<*>, value: T) {
        value?.let { extraWriter(thisRef, this.name, typeWriter(it)) }
    }
}