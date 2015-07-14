package com.silmood.thefirstclient.io;

import android.net.Uri;

/**
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * <p>
 * Created by Pedro Hernández on 07/2015.
 */
public class ApiConstants {

    public static final String URL_BASE = "http://ws.audioscrobbler.com";

    public static final String PATH_VERSION = "/2.0";

    public static final String PARAM_KEY = "api_key";
    public static final String PARAM_METHOD = "method";
    public static final String PARAM_FORMAT = "format";

    public static final String VALUE_TOP_TRACKS = "gettoptracks";
    public static final String VALUE_JSON = "json";

    public static final String URL_TOP_TRACKS = PATH_VERSION + "?" + PARAM_METHOD + "=" + VALUE_TOP_TRACKS
            + PARAM_FORMAT + "=" + VALUE_JSON;

}
