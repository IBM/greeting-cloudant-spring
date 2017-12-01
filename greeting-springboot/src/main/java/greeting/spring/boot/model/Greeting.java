/*
 * Copyright © 2017 IBM Corp. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */

package greeting.spring.boot.model;

public class Greeting {

    private String _rev;
    private String _id;
    private String content;

    public String get_id() {
    return _id;
    }
    public void set_id(String id) {
    this._id = id;
    }

    public String get_rev() {
    return _rev;
    }
    public void set_rev(String rev) {
    this._rev = rev;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}