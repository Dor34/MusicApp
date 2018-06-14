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
        final ArrayList<Song> songs = new ArrayList<Song>();
        songs.add (new Song ("Second Opinion", "LE$", R.raw.second_opinion));
        songs.add (new Song ("Billy Ocean", "Curren$y", R.raw.billy_ocean));
        songs.add (new Song ("Had to Make a Way", "Curren$y", R.raw.had_to_make_a_way));
        songs.add (new Song ("14 Packs", "Curren$y feat. Smoke Dza", R.raw.currensy_smoke_dza_14_packs));


        SongAdapter adapter = new SongAdapter(this, songs);
        ListView listView = (ListView) findViewById(R.id.song_list);
        listView.setAdapter(adapter);
    }
}