/*
 * Copyright 2015 OSBI Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package bi.meteorite.core.api.security.tokenprovider;

import java.util.Map;

/**
 * An authentication token.
 */
public interface IToken {
  String getToken();

  void setToken(String token);

  String getTokenSecret();

  void setTokenSecret(String tokenSecret);

  long getTimestamp();

  void setTimestamp(long timestamp);

  Map<String, String> getProperties();

  String getProperty(String key);

  void setProperties(Map<String, String> properties);

  void setProperty(String key, String value);

  boolean isExpired(long validityDuration);
}
