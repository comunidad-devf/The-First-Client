package com.silmood.thefirstclient.domain;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * <p/>
 * Created by Pedro Hernández on 07/2015.
 */
public class Artist {

    @SerializedName("name")
    String name;

    @SerializedName("playcount")
    String playCount;

    @SerializedName("listeners")
    String listeners;

    @SerializedName("image")
    ArrayList<Image> images;

    private class Image {

        @SerializedName("#text")
        String urlImage;

        @SerializedName("size")
        String size;

        @Override
        public String toString() {
            return "Image{" +
                    "urlImage='" + urlImage + '\'' +
                    ", size='" + size + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Artist{" +
                "name='" + name + '\'' +
                ", playCount='" + playCount + '\'' +
                ", listeners='" + listeners + '\'' +
                ", images=" + images.toString() +
                '}';
    }
}
