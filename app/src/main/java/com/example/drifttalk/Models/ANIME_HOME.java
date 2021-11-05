package com.example.drifttalk.Models;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.example.drifttalk.R;
import com.github.barteksc.pdfviewer.PDFView;

public class ANIME_HOME extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_anime_home);

        pdfView = findViewById(R.id.pdfView);

        int story_position=getIntent().getIntExtra("key_position",0);

        if(story_position==0){
            pdfView.fromAsset("Ao-no-Exorcist-vol.1.pdf").load();
        }
        else if (story_position==1){
            pdfView.fromAsset("BOKU_DAKE_GA_INAI_MACHI.pdf").load();

        }
        else if (story_position==2){
            pdfView.fromAsset("CODE_GEASS.pdf").load();

        }
        else if (story_position==3){
            pdfView.fromAsset("DR_STONE.pdf").load();

        }
        else if (story_position==4){
            pdfView.fromAsset("HUNTER_X_HUNTER.pdf").load();

        }
        else if (story_position==5){
            pdfView.fromAsset("KIMETSU_NO_YAIBA.pdf").load();

        }
        else if (story_position==6){
            pdfView.fromAsset("MY_HERO_ACADEMIA.pdf").load();

        }
        else if (story_position==7){
            pdfView.fromAsset("Naruto_-Sakura_s-Story-Naruto-Novels.pdf").load();

        }
        else if (story_position==8){
            pdfView.fromAsset("Re_ZERO-Starting-Life-in-Another-World-Vol.-1.pdf").load();

        }
        else if (story_position==9){
            pdfView.fromAsset("SHAMAN_KING.pdf").load();

        }
        else if (story_position==10){
            pdfView.fromAsset("SHINGEKI_NO_KYOJIN.pdf").load();

        }
        else if (story_position==11){
            pdfView.fromAsset("the_promised_neverland_1_1-converted.pdf").load();

        }

    }
}