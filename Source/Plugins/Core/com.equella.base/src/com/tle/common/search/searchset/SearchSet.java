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

package com.tle.common.search.searchset;

import com.tle.beans.ItemDefinitionScript;
import com.tle.beans.SchemaScript;
import java.util.List;

public interface SearchSet {
  String getFreetextQuery();

  void setFreetextQuery(String query);

  List<ItemDefinitionScript> getItemDefs();

  void setItemDefs(List<ItemDefinitionScript> itemDefs);

  List<SchemaScript> getSchemas();

  void setSchemas(List<SchemaScript> schemas);

  // // The following are for hierarchical SearchSets ///////////////////////

  String getId();

  SearchSet getParent();

  boolean isInheritFreetext();

  void setInheritFreetext(boolean inheritFreetext);

  List<SchemaScript> getInheritedSchemas();

  void setInheritedSchemas(List<SchemaScript> schemas);

  List<ItemDefinitionScript> getInheritedItemDefs();

  void setInheritedItemDefs(List<ItemDefinitionScript> itemDefs);

  // // The following are for set virtualisation ////////////////////////////

  String getVirtualiserPluginId();

  void setVirtualiserPluginId(String pluginId);

  String getVirtualisationPath();

  void setVirtualisationPath(String path);

  // // Generic config storage //////////////////////////////////////////////

  String getAttribute(String key);

  void setAttribute(String key, String value);

  void removeAttribute(String key);
}
