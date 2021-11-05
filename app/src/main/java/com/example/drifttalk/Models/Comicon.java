package com.example.drifttalk.Models;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import com.example.drifttalk.R;

public class Comicon extends AppCompatActivity {
    ImageView dc,marvelbg,anime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comicon);
        dc = findViewById(R.id.dc);
        marvelbg = findViewById(R.id.marvel);
        anime= findViewById(R.id.anime);
        dc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Comicon.this,DC.class);
                startActivity(intent);
            }

        });
        marvelbg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Comicon.this,MARVEL.class);
                startActivity(intent);
            }

        });
        anime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Comicon.this,ANIME.class);
                startActivity(intent);
            }

        });
    }
}