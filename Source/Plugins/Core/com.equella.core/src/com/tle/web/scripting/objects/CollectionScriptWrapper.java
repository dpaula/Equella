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

package com.tle.web.scripting.objects;

import com.google.common.collect.Lists;
import com.tle.beans.entity.itemdef.ItemDefinition;
import com.tle.common.scripting.objects.CollectionScriptObject;
import com.tle.common.scripting.types.CollectionScriptType;
import com.tle.core.collection.service.ItemDefinitionService;
import com.tle.core.guice.Bind;
import com.tle.web.scripting.ScriptTypeFactory;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;

@Bind(CollectionScriptObject.class)
@Singleton
public class CollectionScriptWrapper extends AbstractScriptWrapper
    implements CollectionScriptObject {
  @Inject private ScriptTypeFactory scriptTypeFactory;

  @Inject private ItemDefinitionService collectionService;

  @Override
  public CollectionScriptType getFromUuid(String uuid) {
    ItemDefinition collection = collectionService.getByUuid(uuid);
    if (collection != null) {
      return scriptTypeFactory.createCollection(collection);
    }
    return null;
  }

  @Override
  public List<CollectionScriptType> listCollections() {
    return Lists.transform(
        collectionService.enumerateEnabled(), c -> scriptTypeFactory.createCollection(c));
  }
}
