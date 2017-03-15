/*
 * Copyright 2012-2013 Hippo B.V. (http://www.onehippo.com)
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

package org.onehippo.simpleocm.model;

import org.onehippo.simpleocm.JcrNodeType;
import org.onehippo.simpleocm.JcrPath;

import java.io.Serializable;

/**
 * @version $Id: Preference.java 133 2013-01-15 10:09:42Z mdenburger $
 */
@JcrNodeType(value = "jcrmockup:preference")
public class Preference implements Serializable {

    private static final long serialVersionUID = 7863440501653001598L;

    @JcrPath(value = "jcrmockup:key")
    private String key;

    @JcrPath(value = "jcrmockup:value")
    private String value;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
