package org.jimmyoak.plugin.testplugin

import org.gradle.api.DefaultTask
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.tasks.TaskAction

open class TestPlugin : Plugin<Project> {
  override fun apply(project: Project) {
    project.tasks.create("something", TestPluginTask::class.java)
  }
}

open class TestPluginTask : DefaultTask() {
  @TaskAction
  fun doSomething() {
    println("something")
  }
}
