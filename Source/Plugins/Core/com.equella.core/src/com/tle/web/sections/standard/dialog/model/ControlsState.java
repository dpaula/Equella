/*
 * Copyright 2017 Apereo
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.tle.web.sections.standard.dialog.model;

import com.tle.web.sections.standard.RendererConstants;
import com.tle.web.sections.standard.model.HtmlComponentState;
import java.util.List;

public class ControlsState extends HtmlComponentState {
  private List<DialogControl> controls;

  public ControlsState() {
    super(RendererConstants.CONTROLS);
  }

  public List<DialogControl> getControls() {
    return controls;
  }

  public void setControls(List<DialogControl> controls) {
    this.controls = controls;
  }
}
