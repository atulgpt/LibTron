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

package com.app.propertydelegates.bundle

import android.os.Build
import android.os.Bundle
import com.app.propertydelegates.*

@PublishedApi
internal inline fun getBoolean(
        receiver: Bundle,
        name: String,
) = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP_MR1) {
    receiver.readBoolean(
            Bundle::containsKey,
            Bundle::getBoolean,
            name
    )
} else {
    receiver.readInt(
            Bundle::containsKey,
            Bundle::getInt,
            name
    ) == 1
}

@PublishedApi
internal inline fun getInt(
        receiver: Bundle,
        name: String,
) =
        receiver.readInt(
                Bundle::containsKey,
                Bundle::getInt,
                name
        )

@PublishedApi
internal inline fun getLong(
        receiver: Bundle,
        name: String,
) =
        receiver.readLong(
                Bundle::containsKey,
                Bundle::getLong,
                name
        )

@PublishedApi
internal inline fun getShort(
        receiver: Bundle,
        name: String,
) =
        receiver.readShort(
                Bundle::containsKey,
                Bundle::getShort,
                name
        )

@PublishedApi
internal inline fun getDouble(
        receiver: Bundle,
        name: String,
) =
        receiver.readDouble(
                Bundle::containsKey,
                Bundle::getDouble,
                name
        )

@PublishedApi
internal inline fun getFloat(
        receiver: Bundle,
        name: String,
) =
        receiver.readFloat(
                Bundle::containsKey,
                Bundle::getFloat,
                name
        )

@PublishedApi
internal inline fun getChar(
        receiver: Bundle,
        name: String,
) =
        receiver.readChar(
                Bundle::containsKey,
                Bundle::getChar,
                name
        )

@PublishedApi
internal inline fun getByte(
        receiver: Bundle,
        name: String,
) =
        receiver.readByte(
                Bundle::containsKey,
                Bundle::getByte,
                name
        )

@PublishedApi
internal inline fun putBoolean(
        receiver: Bundle,
        name: String,
        value: Boolean?,
) = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP_MR1) {
    receiver.putExtra(
            Bundle::remove,
            Bundle::putBoolean,
            name,
            value
    )
} else {
    receiver.putExtra(
            Bundle::remove,
            Bundle::putInt,
            name,
            if (value == true) 1 else 0
    )
}


@PublishedApi
internal inline fun putInt(
        receiver: Bundle,
        name: String,
        value: Int?,
) =
        receiver.putExtra(
                Bundle::remove,
                Bundle::putInt,
                name,
                value
        )

@PublishedApi
internal inline fun putLong(
        receiver: Bundle,
        name: String,
        value: Long?,
) =
        receiver.putExtra(
                Bundle::remove,
                Bundle::putLong,
                name,
                value
        )

@PublishedApi
internal inline fun putShort(
        receiver: Bundle,
        name: String,
        value: Short?,
) =
        receiver.putExtra(
                Bundle::remove,
                Bundle::putShort,
                name,
                value
        )

@PublishedApi
internal inline fun putDouble(
        receiver: Bundle,
        name: String,
        value: Double?,
) =
        receiver.putExtra(
                Bundle::remove,
                Bundle::putDouble,
                name,
                value
        )

@PublishedApi
internal inline fun putFloat(
        receiver: Bundle,
        name: String,
        value: Float?,
) =
        receiver.putExtra(
                Bundle::remove,
                Bundle::putFloat,
                name,
                value
        )

@PublishedApi
internal inline fun putChar(
        receiver: Bundle,
        name: String,
        value: Char?,
) =
        receiver.putExtra(
                Bundle::remove,
                Bundle::putChar,
                name,
                value
        )

@PublishedApi
internal inline fun putByte(
        receiver: Bundle,
        name: String,
        value: Byte?,
) =
        receiver.putExtra(
                Bundle::remove,
                Bundle::putByte,
                name,
                value
        )
