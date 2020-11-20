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

@file:Suppress("NOTHING_TO_INLINE")

package com.app.propertydelegates.intent

import android.content.Intent
import com.app.propertydelegates.*

@PublishedApi
internal inline fun getBooleanExtra(
        receiver: Intent,
        name: String,
) =
        receiver.readBoolean(
                Intent::hasExtra,
                Intent::getBooleanExtra,
                name
        )

@PublishedApi
internal inline fun getIntExtra(
        receiver: Intent,
        name: String,
) =
        receiver.readInt(
                Intent::hasExtra,
                Intent::getIntExtra,
                name
        )

@PublishedApi
internal inline fun getLongExtra(
        receiver: Intent,
        name: String,
) =
        receiver.readLong(
                Intent::hasExtra,
                Intent::getLongExtra,
                name
        )

@PublishedApi
internal inline fun getShortExtra(
        receiver: Intent,
        name: String,
) =
        receiver.readShort(
                Intent::hasExtra,
                Intent::getShortExtra,
                name
        )

@PublishedApi
internal inline fun getDoubleExtra(
        receiver: Intent,
        name: String,
) =
        receiver.readDouble(
                Intent::hasExtra,
                Intent::getDoubleExtra,
                name
        )

@PublishedApi
internal inline fun getFloatExtra(
        receiver: Intent,
        name: String,
) =
        receiver.readFloat(
                Intent::hasExtra,
                Intent::getFloatExtra,
                name
        )

@PublishedApi
internal inline fun getCharExtra(
        receiver: Intent,
        name: String,
) =
        receiver.readChar(
                Intent::hasExtra,
                Intent::getCharExtra,
                name
        )

@PublishedApi
internal inline fun getByteExtra(
        receiver: Intent,
        name: String,
) =
        receiver.readByte(
                Intent::hasExtra,
                Intent::getByteExtra,
                name
        )

@PublishedApi
internal inline fun putExtra(
        receiver: Intent,
        name: String,
        value: Boolean?,
) =
        receiver.putExtra(
                Intent::removeExtra,
                Intent::putExtra,
                name,
                value
        )

@PublishedApi
internal inline fun putExtra(
        receiver: Intent,
        name: String,
        value: Int?,
) =
        receiver.putExtra(
                Intent::removeExtra,
                Intent::putExtra,
                name,
                value
        )

@PublishedApi
internal inline fun putExtra(
        receiver: Intent,
        name: String,
        value: Long?,
) =
        receiver.putExtra(
                Intent::removeExtra,
                Intent::putExtra,
                name,
                value
        )

@PublishedApi
internal inline fun putExtra(
        receiver: Intent,
        name: String,
        value: Short?,
) =
        receiver.putExtra(
                Intent::removeExtra,
                Intent::putExtra,
                name,
                value
        )

@PublishedApi
internal inline fun putExtra(
        receiver: Intent,
        name: String,
        value: Double?,
) =
        receiver.putExtra(
                Intent::removeExtra,
                Intent::putExtra,
                name,
                value
        )

@PublishedApi
internal inline fun putExtra(
        receiver: Intent,
        name: String,
        value: Float?,
) =
        receiver.putExtra(
                Intent::removeExtra,
                Intent::putExtra,
                name,
                value
        )

@PublishedApi
internal inline fun putExtra(
        receiver: Intent,
        name: String,
        value: Char?,
) =
        receiver.putExtra(
                Intent::removeExtra,
                Intent::putExtra,
                name,
                value
        )

@PublishedApi
internal inline fun putExtra(
        receiver: Intent,
        name: String,
        value: Byte?,
) =
        receiver.putExtra(
                Intent::removeExtra,
                Intent::putExtra,
                name,
                value
        )
