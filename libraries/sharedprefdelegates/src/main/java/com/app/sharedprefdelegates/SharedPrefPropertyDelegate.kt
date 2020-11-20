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

package com.app.sharedprefdelegates

import android.content.SharedPreferences
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

private typealias TypeReader<T, R> = (R) -> T
private typealias TypeWriter<T, R> = (T) -> R

private typealias SharedPrefReader<R> = SharedPreferences.(name: String, defaultValue: R?) -> R
internal typealias SharedPrefReaderDefaultNotNull<R> = SharedPreferences.(name: String, defaultValue: R) -> R
internal typealias SharedPrefWriter<R> = SharedPreferences.Editor.(name: String, value: R) -> Any?


@PublishedApi
internal inline fun <T, R> SharedPrefPropertyDelegate(
        prefs: SharedPreferences,
        crossinline sharedPrefReader: SharedPrefReader<R>,
        crossinline sharedPrefWriter: SharedPrefWriter<R>,
        crossinline typeReader: TypeReader<T, R>,
        crossinline typeWriter: TypeWriter<T, R>,
        crossinline hasProperty: SharedPreferences.(String) -> Boolean,
        name: String,
        defaultValue: T? = null,
) = object : ReadWriteProperty<Any?, T?> {
    override fun getValue(thisRef: Any?, property: KProperty<*>): T? {
        return if (prefs.hasProperty(name)) {
            typeReader(prefs.sharedPrefReader(name, null))
        } else {
            defaultValue
        }
    }

    override fun setValue(thisRef: Any?, property: KProperty<*>, value: T?) {
        value?.let {
            val editor = prefs.edit()
            sharedPrefWriter(editor, name, typeWriter(it))
            editor.apply()
        }
    }
}

@PublishedApi
internal inline fun <T, R> SharedPrefPropertyDelegateDefaultNotNull(
        prefs: SharedPreferences,
        crossinline sharedPrefReader: SharedPrefReaderDefaultNotNull<R>,
        crossinline sharedPrefWriter: SharedPrefWriter<R>,
        crossinline typeReader: TypeReader<T, R>,
        crossinline typeWriter: TypeWriter<T, R>,
        name: String,
        defaultValue: T,
) = object : ReadWriteProperty<Any?, T> {
    override fun getValue(thisRef: Any?, property: KProperty<*>): T {
        return typeReader(prefs.sharedPrefReader(name, typeWriter(defaultValue)))
    }

    override fun setValue(thisRef: Any?, property: KProperty<*>, value: T) {
        value?.let {
            val editor = prefs.edit()
            sharedPrefWriter(editor, name, typeWriter(it))
            editor.apply()
        }
    }
}