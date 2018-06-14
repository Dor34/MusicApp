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
        final ArrayList<Song> songs = new ArrayList<> ();
        songs.add (new Song ("Settle For My Love", "Patrice Rushen", R.raw.patrice_rushen_settle_for_my_love));
        songs.add (new Song ("Sands Of Time", "The SOS Band", R.raw.the_sos_band_sands_of_time));
        songs.add (new Song ("Payback Is A Dog", "The Stylistics", R.raw.the_stylistics_payback_is_a_dog));
        songs.add (new Song ("Morning Sunrise", "Weldon Irvine", R.raw.weldon_irvine_morning_sunrise));


        SongAdapter adapter = new SongAdapter(this, songs);
        ListView listView = (ListView) findViewById(R.id.song_list);
        listView.setAdapter(adapter);
    }
}