package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that asks for VariousRap music
        TextView variousRap = (TextView) findViewById(R.id.Various_Rap);

        /* Set a click listener on this View so that when the View is clicked on, the corresponding
        activity gets opened.*/
        variousRap.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open
                Intent variousRapIntent = new Intent(MainActivity.this, VariousRap.class);

                // Start the new activity
                startActivity(variousRapIntent);
            }
        });

        // Find the View that asks for Old School RnB music
        TextView oldSchoolRnB = (TextView) findViewById(R.id.OldSchoolRnB);

        /* Set a click listener on this View so that when the View is clicked on, the corresponding
        activity gets opened.*/
        oldSchoolRnB.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open
                Intent oldSchoolRnBIntent = new Intent(MainActivity.this, OldSchoolRnB.class);

                // Start the new activity
                startActivity(oldSchoolRnBIntent);
            }
        });

        // Find the View that asks for Instrumentals music
        TextView instrumentals = (TextView) findViewById(R.id.Instrumentals);

        /* Set a click listener on this View so that when the View is clicked on, the corresponding
        activity gets opened.*/
        instrumentals.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open
                Intent instrumentalsIntent = new Intent(MainActivity.this, Instrumentals.class);

                // Start the new activity
                startActivity(instrumentalsIntent);
            }
        });

        // Find the View that asks for Southern VariousRap music
        TextView southern_rap = (TextView) findViewById(R.id.SouthernRap);

        /* Set a click listener on this View so that when the View is clicked on, the corresponding
        activity gets opened.*/
        southern_rap.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent southernRapIntent = new Intent(MainActivity.this, SouthernRap.class);

                // Start the new activity
                startActivity(southernRapIntent);
            }
        });
    }
}