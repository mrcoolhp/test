package com.github.mrcoolhp.test.services

import com.intellij.openapi.project.Project
import com.github.mrcoolhp.test.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
