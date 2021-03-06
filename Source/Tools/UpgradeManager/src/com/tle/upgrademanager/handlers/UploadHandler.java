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

package com.tle.upgrademanager.handlers;

import com.google.common.io.Files;
import com.sun.net.httpserver.HttpExchange;
import com.tle.common.Pair;
import com.tle.upgrademanager.ManagerConfig;
import com.tle.upgrademanager.Utils;
import java.io.File;
import java.io.IOException;
import java.util.Map;

public class UploadHandler extends PostDispatchHandler {
  private final ManagerConfig config;

  public UploadHandler(ManagerConfig config) {
    this.config = config;
  }

  public void upload(HttpExchange exchange) throws IOException {
    final Map<String, Pair<String, File>> streams = getMultipartStreams(exchange);
    final Pair<String, File> file = streams.get("file"); // $NON-NLS-1$
    if (file != null) {
      String filename = file.getFirst();
      if (Utils.VERSION_EXTRACT.matcher(filename).matches()) {
        File vf = config.getUpdatesDir();
        Files.move(file.getSecond(), new File(vf, filename));
      }
    }
    HttpExchangeUtils.respondRedirect(exchange, "/pages/"); // $NON-NLS-1$
  }
}
