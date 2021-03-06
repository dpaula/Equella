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

package com.tle.web.sections.result.util;

import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.collect.Collections2;
import com.tle.web.sections.SectionUtils;
import com.tle.web.sections.render.Label;
import java.io.Serializable;
import java.util.Collection;

public class ListLabel implements Label, Serializable {
  private static final long serialVersionUID = 1L;

  private final String text;

  public ListLabel(Collection<String> list, String separator) {
    text =
        Joiner.on(separator)
            .join(
                Collections2.transform(
                    list,
                    new Function<String, String>() {
                      @Override
                      public String apply(String input) {
                        return SectionUtils.ent(input);
                      }
                    }));
  }

  @Override
  public String getText() {
    return text;
  }

  @Override
  public boolean isHtml() {
    return true;
  }
}
