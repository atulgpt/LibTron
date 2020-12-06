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

@file:Suppress("NOTHING_TO_INLINE", "unused")

package com.app.propertydelegates

import android.app.Activity
import android.content.Context
import android.content.Intent
import kotlin.reflect.KClass

private abstract class SimpleActivityCompanion(kClass: KClass<out Activity>) {
    val javaClass = kClass.java

    inline fun intent(context: Context) = Intent(context, javaClass)

    inline fun start(context: Context) {
        context.startActivity(intent(context))
    }
}

private abstract class ActivityCompanion<out IntentOptions>(
    val intentOptions: IntentOptions,
    kClass: KClass<out Activity>,
) : SimpleActivityCompanion(kClass) {

    inline fun intent(context: Context, configure: IntentOptions.(Intent) -> Unit): Intent =
        intent(context).apply { intentOptions.configure(this) }

    inline fun start(context: Context, configure: IntentOptions.(Intent) -> Unit) {
        context.startActivity(intent(context, configure))
    }

    inline fun <T> Intent.options(block: IntentOptions.(Intent) -> T): T =
        intentOptions.block(this)
}

private abstract class SelfActivityCompanion(
    kClass: KClass<out Activity>,
) : SimpleActivityCompanion(kClass) {

    inline fun intent(context: Context, configure: (Intent) -> Unit): Intent =
        intent(context).apply { configure(this) }

    inline fun start(context: Context, configure: (Intent) -> Unit) {
        context.startActivity(intent(context, configure))
    }
}
