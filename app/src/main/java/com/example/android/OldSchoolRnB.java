package com.example.android.musicapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Songs added 05/2018 by Dorian
 */

public class OldSchoolRnB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView (R.layout.song_list);

        //Creates songs ArrayList
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add (new Song ("Settle For My Love", "Patrice Rushen"));
        songs.add (new Song ("Sands Of Time", "The SOS Band"));
        songs.add (new Song ("Payback Is A Dog", "The Stylistics"));


        SongAdapter adapter = new SongAdapter(this, songs);
        ListView listView = (ListView) findViewById(R.id.song_list);
        listView.setAdapter(adapter);
    }
}