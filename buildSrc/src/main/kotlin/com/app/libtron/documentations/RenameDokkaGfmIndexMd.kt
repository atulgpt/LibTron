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

import org.gradle.api.DefaultTask
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.TaskAction
import java.io.File
import java.nio.file.Files
import java.nio.file.Paths
import java.nio.file.StandardCopyOption
import java.util.*

abstract class RenameDokkaGfmIndexMd : DefaultTask() {
    @get:Input
    abstract val newName: Property<String>

    @get:Input
    abstract val dokkaOutputFile: Property<File>

    init {
        group = "documentation"
        description = "Rename index.md to provided name"
        newName.convention("README.md")
    }

    @TaskAction
    fun run() {
        println("Going to create for name ${newName.get()} at path ${dokkaOutputFile.get().absolutePath}")
        Files.walk(Paths.get(dokkaOutputFile.get().absolutePath))
            .filter { it.fileName.toString().toLowerCase(Locale.ENGLISH) == "index.md" }
            .forEach {
                try {
                    Files.copy(
                        it,
                        it.resolveSibling("README.md"),
                        StandardCopyOption.REPLACE_EXISTING
                    )
                } catch (e: Throwable) {
                    throw RuntimeException("Exception in RenameDokkaGfmIndexMd", e)
                }
            }
    }
}