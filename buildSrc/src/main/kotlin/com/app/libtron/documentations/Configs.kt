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

package com.app.libtron.documentations

import org.gradle.api.Task
import org.gradle.api.provider.Property
import org.gradle.api.tasks.TaskContainer
import java.io.File

fun TaskContainer.configureDokka(outputDirectoryFile: File) {
    val dokkaGfm = named("dokkaGfm") {
        this.dokkaOutputDirectory.set(outputDirectoryFile)
    }

    register("readMeCreation", RenameDokkaGfmIndexMd::class.java) {
        dokkaOutputFile.set(dokkaGfm.get().dokkaOutputDirectory)
    }
}

private inline val Task.dokkaOutputDirectory: Property<File>
    get() {
        val property = this.property("outputDirectory")
        property ?: error("$TAG There is not any property outputDirectory")
        @Suppress("UNCHECKED_CAST")
        property as Property<File>
        return property
    }

private const val TAG = "ConfigureDokka"