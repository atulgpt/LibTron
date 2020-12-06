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

public inline fun <T> BundleExtra.ParcelableArray(
    crossinline reader: TypeReader<T, Array<Parcelable?>?>,
    crossinline writer: TypeWriter<T, Array<Parcelable?>?>,
    name: String? = null,
    customPrefix: String? = null,
): PropertyDelegate<Bundle, T> =
    Generic(
        Bundle::getParcelableArray,
        Bundle::putParcelableArray,
        reader,
        writer,
        name,
        customPrefix
    )

public inline fun <T> BundleExtra.CharSequenceArray(
    crossinline reader: TypeReader<T, Array<CharSequence?>?>,
    crossinline writer: TypeWriter<T, Array<CharSequence?>?>,
    name: String? = null,
    customPrefix: String? = null,
): PropertyDelegate<Bundle, T> =
    Generic(
        Bundle::getCharSequenceArray,
        Bundle::putCharSequenceArray,
        reader,
        writer,
        name,
        customPrefix
    )

public inline fun <T> BundleExtra.StringArray(
    crossinline reader: TypeReader<T, Array<String?>?>,
    crossinline writer: TypeWriter<T, Array<String?>?>,
    name: String? = null,
    customPrefix: String? = null,
): PropertyDelegate<Bundle, T> =
    Generic(
        Bundle::getStringArray,
        Bundle::putCharSequenceArray,
        reader,
        writer,
        name,
        customPrefix
    )
