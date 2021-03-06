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

package com.tle.core.notification.standard.indexer;

import com.tle.common.search.DefaultSearch;
import com.tle.common.searching.Field;
import com.tle.common.searching.SortField;
import com.tle.common.usermanagement.user.CurrentUser;
import java.util.List;

public class NotificationSearch extends DefaultSearch {
  private static final long serialVersionUID = 1L;

  @Override
  public String getSearchType() {
    return NotificationIndex.INDEXID;
  }

  @Override
  protected void addExtraMusts(List<List<Field>> musts) {
    musts.add(createFields(NotificationIndex.FIELD_USER, CurrentUser.getUserID()));
  }

  @Override
  public SortField[] getSortFields() {
    return new SortField[] {new SortField(NotificationIndex.FIELD_DATE, true)};
  }
}
