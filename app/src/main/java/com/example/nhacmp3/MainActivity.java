package com.example.nhacmp3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void theloai(View view) {
        Intent intent=new Intent(this,TypeActivity.class);
        startActivity(intent);
    }

    public void top20cs(View view) {
        Intent intent=new Intent(this,Top20CSActivity.class);
        startActivity(intent);
    }

    public void topbaihat(View view) {
        Intent intent=new Intent(this,Top20baihatActivity.class);
        startActivity(intent);
    }

    public void play(View view) {
        Intent intent=new Intent(this,PlayActivity.class);
        startActivity(intent);
    }

    public void PlayList(View view) {
        Intent intent=new Intent(this,PlaylistActivity.class);
        startActivity(intent);
    }
}
