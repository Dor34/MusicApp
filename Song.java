package com.example.android.musicapp;

/**
 * Created by Dorian 5/2018
 */

public class Song {
    private String mSongName;
    private String mArtistName;

    public Song(String songName, String artistName, int dj_burn_one_lucy_says_high){
        mSongName = songName;
        mArtistName = artistName;
    }

    public String getSongName(){

        return mSongName;
    }

    public String getmArtistName(){

        return mArtistName;
    }
}
