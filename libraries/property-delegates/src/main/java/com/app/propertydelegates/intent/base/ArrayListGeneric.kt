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

package com.app.propertydelegates.intent.base

import android.content.Intent
import android.os.Parcelable
import com.app.propertydelegates.PropertyDelegate
import com.app.propertydelegates.TypeReader
import com.app.propertydelegates.TypeWriter
import com.app.propertydelegates.intent.Generic
import com.app.propertydelegates.intent.IntentExtra
import java.util.*

public inline fun <T> IntentExtra.IntArrayList(
    crossinline reader: TypeReader<T, ArrayList<Int?>?>,
    crossinline writer: TypeWriter<T, ArrayList<Int?>?>,
    name: String? = null,
    customPrefix: String? = null,
): PropertyDelegate<Intent, T> =
    Generic(
        Intent::getIntegerArrayListExtra,
        Intent::putIntegerArrayListExtra,
        reader,
        writer,
        name,
        customPrefix
    )

public inline fun <T> IntentExtra.CharSequenceArrayList(
    crossinline reader: TypeReader<T, ArrayList<CharSequence?>?>,
    crossinline writer: TypeWriter<T, ArrayList<CharSequence?>?>,
    name: String? = null,
    customPrefix: String? = null,
): PropertyDelegate<Intent, T> =
    Generic(
        Intent::getCharSequenceArrayListExtra,
        Intent::putCharSequenceArrayListExtra,
        reader,
        writer,
        name,
        customPrefix
    )

public inline fun <T> IntentExtra.StringArrayList(
    crossinline reader: TypeReader<T, ArrayList<String?>?>,
    crossinline writer: TypeWriter<T, ArrayList<String?>?>,
    name: String? = null,
    customPrefix: String? = null,
): PropertyDelegate<Intent, T> =
    Generic(
        Intent::getStringArrayListExtra,
        Intent::putStringArrayListExtra,
        reader,
        writer,
        name,
        customPrefix
    )

public inline fun <T, R : Parcelable> IntentExtra.ParcelableArrayList(
    crossinline reader: TypeReader<T, ArrayList<R?>?>,
    crossinline writer: TypeWriter<T, ArrayList<R?>?>,
    name: String? = null,
    customPrefix: String? = null,
): PropertyDelegate<Intent, T> =
    Generic(
        Intent::getParcelableArrayListExtra,
        Intent::putParcelableArrayListExtra,
        reader,
        writer,
        name,
        customPrefix
    )
