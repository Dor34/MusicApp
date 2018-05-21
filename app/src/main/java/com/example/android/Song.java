package com.example.android.musicapp;

/**
 * Created by Dorian 5/15/2018
 */

public class Song {
    private String mSongName;
    private String mArtistName;

    public Song(String songName, String artistName){
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
