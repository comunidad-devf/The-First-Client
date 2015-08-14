package com.silmood.thefirstclient.io;

import com.silmood.thefirstclient.domain.User;
import com.silmood.thefirstclient.io.model.TopArtistsResponse;
import com.silmood.thefirstclient.io.model.TopTracksResponse;

import retrofit.Callback;
import retrofit.client.Response;
import retrofit.http.Body;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.Query;

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
public interface LastFMApiService {

    @GET(ApiConstants.URL_TOP_TRACKS)
    void getTopTracks(@Query(ApiConstants.PARAM_KEY) String apiKey, Callback<TopTracksResponse> serverCallback);

    @GET(ApiConstants.URL_TOP_ARTISTS)
    void getTopArtists(@Query(ApiConstants.PARAM_KEY) String apiKey, Callback<TopArtistsResponse> serverCallback);

    @POST("/v2/5185415ba171ea3a00704eed")
    void login(@Body User user, Callback<Response> responseCallback);

    /*@FormUrlEncoded
    @POST("/v2/5185415ba171ea3a00704eed")
    void login(@Field("user")String user, Callback<Response> responseCallback);*/
}
