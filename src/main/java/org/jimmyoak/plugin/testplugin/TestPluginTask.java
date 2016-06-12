package org.jimmyoak.plugin.testplugin;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

public class TestPluginTask extends DefaultTask {
  @TaskAction
  public void doSomething() {
    System.out.println("something");
  }
}
