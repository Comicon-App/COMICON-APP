package com.example.drifttalk.Models;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.example.drifttalk.R;
import com.github.barteksc.pdfviewer.PDFView;

public class MARVEL_HOME extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_marvel_home);
        pdfView = findViewById(R.id.pdfView);

        int story_position=getIntent().getIntExtra("key_position",0);

        if(story_position==0){
            pdfView.fromAsset("Avengers Tech On Avengers 2021 Digital Zone Empire.pdf").load();
        }
        else if (story_position==1){
            pdfView.fromAsset("Captain Marvel Digital Zone Empire.pdf").load();

        }
        else if (story_position==2){
            pdfView.fromAsset("Dark Ages 002 2021 Digital Zone Empire.pdf").load();

        }
        else if (story_position==3){
            pdfView.fromAsset("Deadpool Infinity Comic.pdf").load();

        }
        else if (story_position==4){
            pdfView.fromAsset("Eternals Celestia.pdf").load();

        }
        else if (story_position==5){
            pdfView.fromAsset("Excalibur 2021 Digital  Zone Empire.pdf").load();

        }
        else if (story_position==6){
            pdfView.fromAsset("Hellions  2021 Digital Zone Empire.pdf").load();

        }
        else if (story_position==7){
            pdfView.fromAsset("New Mutants  2021 Digital  Zone Empire.pdf").load();

        }
        else if (story_position==8){
            pdfView.fromAsset("Savage Avengers 2021 Digital Zone-Empire.pdf").load();

        }
        else if (story_position==9){
            pdfView.fromAsset("Spiderman Comic.pdf").load();

        }

    }
}