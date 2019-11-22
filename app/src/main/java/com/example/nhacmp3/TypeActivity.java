package com.example.nhacmp3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class TypeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle("Thể Loại");
    }
}
