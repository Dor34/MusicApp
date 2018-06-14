package com.example.android.musicapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Songs added 05/2018 by Dorian
 */

public class VariousRap extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView (R.layout.song_list);

        //Creates songs ArrayList
        final ArrayList<Song> songs = new ArrayList<Song>();
        songs.add (new Song ("Its On You", "Pete Rock and CL Smooth", R.raw.its_on_you));
        songs.add (new Song ("Fantastic Four", "Jay Worthy, Mitchy Slick, Iamsu!", R.raw.jay_worthy_mitchy_slick_dj_fresh_iamsu_fantastic_four));
        songs.add (new Song ("Mail Long", "Payroll Giovanni feat. E-40", R.raw.mail_long_feat_e_40));

        SongAdapter adapter = new SongAdapter(this, songs);
        ListView listView = (ListView) findViewById(R.id.song_list);
        listView.setAdapter(adapter);
    }
}