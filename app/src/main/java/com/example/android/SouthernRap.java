package com.example.android.musicapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Songs added 05/2018 by Dorian
 */

public class SouthernRap extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView (R.layout.song_list);

        //Creates songs ArrayList
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add (new Song ("Second Opinion", "LE$"));
        songs.add (new Song ("Billy Ocean", "Curren$y"));
        songs.add (new Song ("Had to Make a Way", "Curren$y"));


        SongAdapter adapter = new SongAdapter(this, songs);
        ListView listView = (ListView) findViewById(R.id.song_list);
        listView.setAdapter(adapter);
    }
}
