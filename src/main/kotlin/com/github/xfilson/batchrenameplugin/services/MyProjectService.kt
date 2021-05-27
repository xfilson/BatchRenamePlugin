package com.github.xfilson.batchrenameplugin.services

import com.github.xfilson.batchrenameplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
