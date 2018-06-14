package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class SongPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate (savedInstanceState);
        setContentView (R.layout.song_playing);

        /*Intent extras*/
        String song_playing = getIntent().getStringExtra ("Title");
        String artist_name = getIntent().getStringExtra ("Artist");

        /*XML layout*/
        TextView playingTitleTextView = findViewById(R.id.song_name);
        playingTitleTextView.setText(song_playing);

        TextView playingArtistTextView = findViewById(R.id.artist_name);
        playingArtistTextView.setText(artist_name);
    }

    /**
     * when back button is pressed return to home screen
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case android.R.id.list_container:
                Intent intent = new Intent (SongPlayingActivity.this, SongAdapter.class);
                intent.putExtra ("ARTIST_NAME", getIntent().getStringExtra("ARTIST"));
                startActivity (intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
