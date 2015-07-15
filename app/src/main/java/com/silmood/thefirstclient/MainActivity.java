package com.silmood.thefirstclient;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.silmood.thefirstclient.domain.Artist;
import com.silmood.thefirstclient.domain.Track;
import com.silmood.thefirstclient.io.LastFMApiClient;
import com.silmood.thefirstclient.io.LastFMApiService;
import com.silmood.thefirstclient.io.model.TopArtistsResponse;
import com.silmood.thefirstclient.io.model.TopTracksResponse;

import java.util.ArrayList;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class MainActivity extends AppCompatActivity implements Callback<TopTracksResponse> {

    public static final String LOG_TAG = MainActivity.class.getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    protected void onResume() {
        super.onResume();
        //LastFMApiClient.getInstance()
        //        .getTopTracks(BuildConfig.LAST_FM_API_KEY_DEBUG, this);

        LastFMApiClient.getInstance()
                .getTopArtists(BuildConfig.LAST_FM_API_KEY_DEBUG, new Callback<TopArtistsResponse>() {
                            @Override
                            public void success(TopArtistsResponse topArtistsResponse, Response response) {
                                ArrayList<Artist> artists = topArtistsResponse.getArtists();

                                for(Artist artist : artists){
                                    Log.i(LOG_TAG, artist.toString());
                                }
                            }

                            @Override
                            public void failure(RetrofitError error) {
                                error.printStackTrace();
                            }
                        });
    }

    @Override
    public void success(TopTracksResponse topTracksResponse, Response response) {
        ArrayList<Track> topTracks = topTracksResponse.getTrackData().getTracks();

       for (Track track : topTracks){
           Log.i(LOG_TAG, track.toString());
       }
    }

    @Override
    public void failure(RetrofitError error) {
        error.printStackTrace();
    }
}
