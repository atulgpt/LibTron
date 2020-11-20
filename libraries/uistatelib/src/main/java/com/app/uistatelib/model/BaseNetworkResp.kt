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

@file:Suppress("unused")

package com.app.uistatelib.model

public class BaseNetworkResp<M>(
        public val httpCode: Int?,
        public val data: M,
        public val message: String?,
        public val displayMessage: String?,
        // We need nullable here as we are using Gson
        // We can remove it until we use some other deserialization tool that properly support Kotlin types
        public val errors: List<String>? = emptyList(),
)