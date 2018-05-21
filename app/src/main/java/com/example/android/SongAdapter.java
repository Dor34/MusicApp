package com.example.android.musicapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Dorian 5/15/2018
 */

public class SongAdapter extends ArrayAdapter<Song> {

    public SongAdapter(Activity context, ArrayList<Song> androidSongs){
        super(context, 0, androidSongs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View listItemView = convertView;
        if(listItemView==null){
            listItemView = LayoutInflater.from(getContext ()).inflate(
                    R.layout.list_item, parent, false);
        }

        Song currentSong = getItem (position);

        //Name of song
        TextView songName = (TextView) listItemView.findViewById (R.id.song_name);
        songName.setText (currentSong.getSongName());

        //Name of artist
        TextView artistName = (TextView) listItemView.findViewById (R.id.artist_name);
        artistName.setText (currentSong.getmArtistName());

        return listItemView;
    }
}
