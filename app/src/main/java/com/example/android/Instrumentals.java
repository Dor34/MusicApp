package com.example.android.musicapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Songs added 05/2018 by Dorian
 */

public class Instrumentals extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView (R.layout.song_list);

        //Creates songs ArrayList
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add (new Song ("Lucy Says High", "DJ Burn One"));
        songs.add (new Song ("Melodys Rapture", "DJ Burn One"));
        songs.add (new Song ("Boundless Boundaries", "Onra"));


        SongAdapter adapter = new SongAdapter(this, songs);
        ListView listView = (ListView) findViewById(R.id.song_list);
        listView.setAdapter(adapter);
    }
}
