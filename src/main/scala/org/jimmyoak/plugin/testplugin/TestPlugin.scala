package org.jimmyoak.plugin.testplugin

import org.gradle.api.DefaultTask
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.tasks.TaskAction

class TestPlugin extends Plugin[Project] {
  def apply(project: Project) = project.getTasks.create("something", classOf[TestPluginTask])
}

class TestPluginTask extends DefaultTask {
  @TaskAction
  def doSomething(): Unit = println("something")
}

