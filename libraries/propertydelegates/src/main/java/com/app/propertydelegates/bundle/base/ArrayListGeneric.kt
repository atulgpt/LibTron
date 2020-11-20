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
import java.util.*

public inline fun <T> BundleExtra.IntArrayList(
        crossinline reader: TypeReader<T, ArrayList<Int?>?>,
        crossinline writer: TypeWriter<T, ArrayList<Int?>?>,
        name: String? = null,
        customPrefix: String? = null,
): PropertyDelegate<Bundle, T> =
        Generic(
                Bundle::getIntegerArrayList,
                Bundle::putIntegerArrayList,
                reader,
                writer,
                name,
                customPrefix)

public inline fun <T> BundleExtra.CharSequenceArrayList(
        crossinline reader: TypeReader<T, ArrayList<CharSequence?>?>,
        crossinline writer: TypeWriter<T, ArrayList<CharSequence?>?>,
        name: String? = null,
        customPrefix: String? = null,
): PropertyDelegate<Bundle, T> =
        Generic(
                Bundle::getCharSequenceArrayList,
                Bundle::putCharSequenceArrayList,
                reader,
                writer,
                name,
                customPrefix)

public inline fun <T> BundleExtra.StringArrayList(
        crossinline reader: TypeReader<T, ArrayList<String?>?>,
        crossinline writer: TypeWriter<T, ArrayList<String?>?>,
        name: String? = null,
        customPrefix: String? = null,
): PropertyDelegate<Bundle, T> =
        Generic(
                Bundle::getStringArrayList,
                Bundle::putStringArrayList,
                reader,
                writer,
                name,
                customPrefix)

public inline fun <T, R : Parcelable> BundleExtra.ParcelableArrayList(
        crossinline reader: TypeReader<T, ArrayList<R?>?>,
        crossinline writer: TypeWriter<T, ArrayList<R?>?>,
        name: String? = null,
        customPrefix: String? = null,
): PropertyDelegate<Bundle, T> =
        Generic(
                Bundle::getParcelableArrayList,
                Bundle::putParcelableArrayList,
                reader,
                writer,
                name,
                customPrefix)
