/*
 * Copyright 2012-present Facebook, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.facebook.buck.shell;

import com.google.common.collect.ImmutableList;

import java.util.List;

public class DefaultShellCommand extends ShellCommand {

  private ImmutableList<String> args;

  public DefaultShellCommand(String... args) {
    this(ImmutableList.copyOf(args));
  }

  public DefaultShellCommand(List<String> args) {
    this.args = ImmutableList.copyOf(args);
  }

  @Override
  public String getShortName(ExecutionContext context) {
    return args.get(0);
  }

  @Override
  protected ImmutableList<String> getShellCommandInternal(
      ExecutionContext context) {
    return args;
  }

}
