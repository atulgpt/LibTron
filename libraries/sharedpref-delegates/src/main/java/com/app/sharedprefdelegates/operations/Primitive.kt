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

@file:Suppress("FunctionName", "NOTHING_TO_INLINE", "unused")

package com.app.sharedprefdelegates.operations

import android.content.SharedPreferences
import android.util.Log
import com.app.sharedprefdelegates.*
import kotlin.properties.ReadWriteProperty

/**
 * To be used to get the delegated property to access the shared pref [String] value
 * @param name Name of the [SharedPreferences] key
 * @param defaultValue Default value to be used when key is absent, defaults to null and hence the property
 *          becomes nullable
 * @return Delegated property [PrimitiveGeneric]
 */
public inline fun SharedPreferences.String(
        name: String,
        defaultValue: String? = null,
): ReadWriteProperty<Any?, String?> = PrimitiveGeneric(
        prefs = this,
        sharedPrefReader = SharedPreferences::getString,
        sharedPrefWriter = SharedPreferences.Editor::putString,
        name = name,
        defaultValue = defaultValue
)

/**
 * To be used to get the delegated property to access the shared pref [String] value
 * @param name Name of the [SharedPreferences] key
 * @param defaultValue Default value to be used when key is absent, defaults to "" string and hence the property
 *          becomes not-nullable
 * @return Delegated property [PrimitiveGeneric]
 */
public inline fun SharedPreferences.StringNotNull(
        name: String,
        defaultValue: String = "",
): ReadWriteProperty<Any?, String> = PrimitiveGeneric(
        prefs = this,
        sharedPrefReader = { nameInLambda, defaultValueInLambda ->
                return@PrimitiveGeneric this.getString(nameInLambda, defaultValueInLambda)
                        ?: defaultValueInLambda
        },
        sharedPrefWriter = SharedPreferences.Editor::putString,
        name = name,
        defaultValue = defaultValue
)

/**
 * To be used to get the delegated property to access the shared pref [Int] value
 * @param name Name of the [SharedPreferences] key
 * @param defaultValue Default value to be used when key is absent, defaults to -1
 * @return Delegated property [PrimitiveGeneric]
 */
public inline fun SharedPreferences.Int(
        name: String,
        defaultValue: Int = -1,
): ReadWriteProperty<Any?, Int> = PrimitiveGeneric(
        prefs = this,
        sharedPrefReader = SharedPreferences::getInt,
        sharedPrefWriter = SharedPreferences.Editor::putInt,
        name = name,
        defaultValue = defaultValue
)

/**
 * To be used to get the delegated property to access the shared pref [Long] value
 * @param name Name of the [SharedPreferences] key
 * @param defaultValue Default value to be used when key is absent, defaults to -1L
 * @return Delegated property [PrimitiveGeneric]
 */
public inline fun SharedPreferences.Long(
        name: String,
        defaultValue: Long = -1L,
): ReadWriteProperty<Any?, Long> = PrimitiveGeneric(
        prefs = this,
        sharedPrefReader = SharedPreferences::getLong,
        sharedPrefWriter = SharedPreferences.Editor::putLong,
        name = name,
        defaultValue = defaultValue
)

/**
 * To be used to get the delegated property to access the shared pref [Float] value
 * @param name Name of the [SharedPreferences] key
 * @param defaultValue Default value to be used when key is absent, defaults to -1F
 * @return Delegated property [PrimitiveGeneric]
 */
public inline fun SharedPreferences.Float(
        name: String,
        defaultValue: Float = -1F,
): ReadWriteProperty<Any?, Float> = PrimitiveGeneric(
        prefs = this,
        sharedPrefReader = SharedPreferences::getFloat,
        sharedPrefWriter = SharedPreferences.Editor::putFloat,
        name = name,
        defaultValue = defaultValue
)

/**
 * To be used to get the delegated property to access the shared pref [Boolean] value
 * @param name Name of the [SharedPreferences] key
 * @param defaultValue Default value to be used when key is absent, defaults to false
 * @return Delegated property [PrimitiveGeneric]
 */
public inline fun SharedPreferences.Boolean(
        name: String,
        defaultValue: Boolean = false,
): ReadWriteProperty<Any?, Boolean> = PrimitiveGeneric(
        prefs = this,
        sharedPrefReader = SharedPreferences::getBoolean,
        sharedPrefWriter = SharedPreferences.Editor::putBoolean,
        name = name,
        defaultValue = defaultValue
)

/**
 * To be used to get the delegated property to access the shared pref [Any] value
 * The object should be allowed to serialized by Gson for example it should not have any inner class which is not static
 * @param name Name of the key
 * @param defaultValue Default value, defaults to {@code null}
 * @see ObjectNotNull for non-null cases
 * @return Delegated property [SharedPrefPropertyDelegate]
 * @see toStringUsingGson
 * @see fromJson
 */
public inline fun <reified M> SharedPreferences.Object(
        name: String,
        defaultValue: M? = null,
): ReadWriteProperty<Any?, M?> = SharedPrefPropertyDelegate<M?, String?>(
        prefs = this,
        sharedPrefReader = SharedPreferences::getString,
        sharedPrefWriter = SharedPreferences.Editor::putString,
        name = name,
        defaultValue = defaultValue,
        typeWriter = {
                it.toStringUsingGson()
        },
        typeReader = {
                Log.i("SharedPref", "Class Info: ${M::class.java}")
                it.fromJson()
        },
        hasProperty = SharedPreferences::contains
)

/**
 * To be used to get the delegated property to access the shared pref [Any] value
 * The object should be allowed to serialized by Gson for example it should not have any inner class which is not static
 * @param name Name of the key
 * @param defaultValue Default value, this is non-nullable version
 * @see SharedPreferences.Object for null cases
 * @return Delegated property [SharedPrefPropertyDelegate]
 * @see toStringUsingGson
 * @see fromJson
 */
public inline fun <reified M> SharedPreferences.ObjectNotNull(
        name: String,
        defaultValue: M
): ReadWriteProperty<Any?, M> = SharedPrefPropertyDelegateDefaultNotNull(
        prefs = this,
        sharedPrefReader = { nameInLambda, defaultValueInLambda ->
                return@SharedPrefPropertyDelegateDefaultNotNull this.getString(
                        nameInLambda,
                        defaultValueInLambda
                )
                        ?: defaultValueInLambda
        },
        sharedPrefWriter = SharedPreferences.Editor::putString,
        name = name,
        defaultValue = defaultValue,
        typeWriter = {
                it.toStringUsingGson()!!
        },
        typeReader = {
                Log.i("SharedPref", "Class Info: ${M::class.java}")
                it.fromJson<M>()!!
        }
)

/**
 * Helper function to make the delegate property for primitive type in [SharedPreferences]
 * @param prefs [SharedPreferences] which will be used to access the property
 * @param sharedPrefReader CrossInline(non local return not allowed) extraReader that is used to read from [SharedPreferences]
 * @param sharedPrefWriter CrossInline(non local return not allowed) extraReader that is used to write to [SharedPreferences]
 * @param name Name of the key
 * @param defaultValue Default value
 * @return Delegated property [SharedPrefPropertyDelegateDefaultNotNull]
 */
@PublishedApi
internal inline fun <T> SharedPreferences.PrimitiveGeneric(
        prefs: SharedPreferences,
        crossinline sharedPrefReader: SharedPrefReaderDefaultNotNull<T>,
        crossinline sharedPrefWriter: SharedPrefWriter<T>,
        name: String,
        defaultValue: T,
): ReadWriteProperty<Any?, T> = SharedPrefPropertyDelegateDefaultNotNull(
        prefs = prefs,
        sharedPrefReader = sharedPrefReader,
        sharedPrefWriter = sharedPrefWriter,
        name = name,
        defaultValue = defaultValue,
        typeReader = { it },
        typeWriter = { it }
)