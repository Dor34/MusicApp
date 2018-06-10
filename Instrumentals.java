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
        final ArrayList<Song> songs = new ArrayList<Song>();
        songs.add (new Song ("Lucy Says High", "DJ Burn One", R.raw.dj_burn_one_lucy_says_high));
        songs.add (new Song ("Melodys Rapture", "DJ Burn One", R.raw.dj_burn_one_melodys_rapture));
        songs.add (new Song ("Boundless Boundaries", "Onra", R.raw.onra_boundless_boundaries));
        songs.add (new Song ("Cry Baby", "Spiller", R.raw.spiller_cry_baby));


        SongAdapter adapter = new SongAdapter(this, songs);
        ListView listView = (ListView) findViewById(R.id.song_list);
        listView.setAdapter(adapter);
    }
}