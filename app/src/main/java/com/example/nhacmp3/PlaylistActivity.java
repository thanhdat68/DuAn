package com.example.nhacmp3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class PlaylistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("PlayList");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.activity_playlist);
    }
}
