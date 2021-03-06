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

package com.tle.web.sections.js.generic.expression;

import com.tle.annotation.NonNullByDefault;
import com.tle.annotation.Nullable;
import com.tle.web.sections.SectionUtils;
import com.tle.web.sections.events.PreRenderContext;
import com.tle.web.sections.events.RenderContext;
import com.tle.web.sections.js.JSExpression;
import com.tle.web.sections.js.JSPropertyExpression;

@NonNullByDefault
public class CombinedPropertyExpression extends AbstractExpression implements JSPropertyExpression {
  private final JSExpression first;
  private final JSExpression second;

  public CombinedPropertyExpression(JSExpression first, JSExpression second) {
    this.first = first;
    this.second = second;
  }

  @Override
  public String getExpression(@Nullable RenderContext info) {
    return first.getExpression(info) + second.getExpression(info);
  }

  @Override
  public void preRender(PreRenderContext info) {
    SectionUtils.preRender(info, first, second);
  }
}
