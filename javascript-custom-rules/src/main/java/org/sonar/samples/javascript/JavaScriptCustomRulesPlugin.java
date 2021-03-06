/*
 * Copyright (C) 2009-2013 SonarSource SA
 * All rights reserved
 * mailto:contact AT sonarsource DOT com
 */
package org.sonar.samples.javascript;

import org.sonar.api.Plugin;

/**
 * Define a SonarQube Plugin.
 */
public class JavaScriptCustomRulesPlugin implements Plugin {

  @Override
  public void define(Context context) {
    context.addExtension(JavaScriptCustomRulesDefinition.class);
  }

}
