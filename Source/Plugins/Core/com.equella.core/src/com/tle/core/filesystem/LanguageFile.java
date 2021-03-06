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

package com.tle.core.filesystem;

import com.tle.annotation.NonNullByDefault;
import com.tle.common.PathUtils;
import com.tle.common.i18n.LocaleUtils;
import java.util.Locale;

@SuppressWarnings("nls")
@NonNullByDefault
public class LanguageFile extends LanguagesFile {
  private static final long serialVersionUID = 1L;

  public static final String ROOT_FILENAME = "ROOT";

  private final String path;

  public LanguageFile(Locale locale) {
    path = getFilename(locale);
  }

  private String getFilename(Locale locale) {
    return Locale.ROOT.equals(locale) ? ROOT_FILENAME : locale.toString();
  }

  @Override
  protected String createAbsolutePath() {
    return PathUtils.filePath(super.createAbsolutePath(), path);
  }

  public static Locale parseLocale(String filename) {
    return ROOT_FILENAME.equals(filename) ? Locale.ROOT : LocaleUtils.parseLocale(filename);
  }
}
