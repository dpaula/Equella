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

package com.tle.core.item.serializer.where;

import com.tle.beans.item.ItemKey;
import com.tle.core.item.serializer.ItemSerializerState;
import com.tle.core.item.serializer.ItemSerializerWhere;
import org.hibernate.criterion.Restrictions;

@SuppressWarnings("nls")
public class SingleItemWhereClause implements ItemSerializerWhere {
  private ItemKey itemKey;

  public SingleItemWhereClause(ItemKey itemKey) {
    this.itemKey = itemKey;
  }

  @Override
  public void addWhere(ItemSerializerState state) {
    state
        .getItemQuery()
        .add(
            Restrictions.and(
                Restrictions.eq("uuid", itemKey.getUuid()),
                Restrictions.eq("version", itemKey.getVersion())));
  }
}
