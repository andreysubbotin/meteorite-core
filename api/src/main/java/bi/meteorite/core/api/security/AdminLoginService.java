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

package bi.meteorite.core.api.security;

import java.util.List;

import javax.security.auth.login.LoginContext;

/**
 * Admin Api Interface for user management.
 */
public interface AdminLoginService {

  boolean login(String username, String password);

  boolean logout(String username);

  String getUsername();

  List<String> getRoles();

  /**
   * Set the JaaS realm.
   * @param realm
   */
  void setRealm(String realm);

  void setLoginContext(LoginContext loginContext);

}
