package com.example.nhacmp3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Top20CSActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Top 20 Ca Sĩ");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.activity_top20_cs);
    }

    public void play(View view) {
        Intent intent=new Intent(this,PlayActivity.class);
        startActivity(intent);
    }
}
