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

package com.app.propertydelegates.bundle.base

import android.os.Bundle
import android.os.Parcelable
import com.app.propertydelegates.PropertyDelegate
import com.app.propertydelegates.TypeReader
import com.app.propertydelegates.TypeWriter
import com.app.propertydelegates.bundle.BundleExtra
import com.app.propertydelegates.bundle.Generic
import java.io.Serializable

public inline fun <T> BundleExtra.Bundle(
        crossinline reader: TypeReader<T, Bundle?>,
        crossinline writer: TypeWriter<T, Bundle?>,
        name: String? = null,
        customPrefix: String? = null,
): PropertyDelegate<Bundle, T> =
        Generic(
                Bundle::getBundle,
                Bundle::putBundle,
                reader,
                writer,
                name,
                customPrefix
        )

public inline fun <T> BundleExtra.CharSequence(
        crossinline reader: TypeReader<T, CharSequence?>,
        crossinline writer: TypeWriter<T, CharSequence?>,
        name: String? = null,
        customPrefix: String? = null,
): PropertyDelegate<Bundle, T> =
        Generic(
                Bundle::getCharSequence,
                Bundle::putCharSequence,
                reader,
                writer,
                name,
                customPrefix
        )

public inline fun <T> BundleExtra.String(
        crossinline reader: TypeReader<T, String?>,
        crossinline writer: TypeWriter<T, String?>,
        name: String? = null,
        customPrefix: String? = null,
): PropertyDelegate<Bundle, T> =
        Generic(
                Bundle::getString,
                Bundle::putString,
                reader,
                writer,
                name,
                customPrefix
        )

public inline fun <T, R : Parcelable> BundleExtra.Parcelable(
        crossinline reader: TypeReader<T, R?>,
        crossinline writer: TypeWriter<T, R?>,
        name: String? = null,
        customPrefix: String? = null,
): PropertyDelegate<Bundle, T> =
        Generic(
                Bundle::getParcelable,
                Bundle::putParcelable,
                reader,
                writer,
                name,
                customPrefix
        )

public inline fun <T, R : Serializable> BundleExtra.Serializable(
        crossinline reader: TypeReader<T, R?>,
        crossinline writer: TypeWriter<T, R?>,
        name: String? = null,
        customPrefix: String? = null,
): PropertyDelegate<Bundle, T> =
        Generic(
                { nameInLambda ->
                        @Suppress("UNCHECKED_CAST")
                        getSerializable(nameInLambda) as? R?
                },
                Bundle::putSerializable,
                reader,
                writer,
                name,
                customPrefix
        )
