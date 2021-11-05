package com.example.drifttalk.Models;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.example.drifttalk.R;
import com.github.barteksc.pdfviewer.PDFView;

public class DC_HOME extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_dc_home);
        pdfView = findViewById(R.id.pdfView);


        int story_position=getIntent().getIntExtra("key_position",0);

        if(story_position==0){
            pdfView.fromAsset("Arkham_City _The _Order _of _the _World.pdf.pdf").load();
        }
        else if (story_position==1){
            pdfView.fromAsset("Batman _The Adventures_Continue_Son_of_Ultron_Empire.pdf.pdf").load();

        }
        else if (story_position==2){
            pdfView.fromAsset("Batman_114_2021_Digital_Zone-Empire.pdf.pdf").load();

        }
        else if (story_position==3){
            pdfView.fromAsset("Crush_Lobo_05_of_08_2021_digital_Son_of_Ultron_Empire.pdf.pdf").load();

        }
        else if (story_position==4){
            pdfView.fromAsset("DC_Horror_Presents_Soul_Plumber_01_of_06_2021_digital_Son_of_Ultron_Empire.pdf.pdf").load();

        }
        else if (story_position==5){
            pdfView.fromAsset("DC_Horror_Presents_The_Conjuring_he Lover_05_of_05_2021_digital_Son_of_Ultron_Empire.pdf.pdf").load();

        }
        else if (story_position==6){
            pdfView.fromAsset("Justice_League_Infinity.pdf.pdf").load();

        }
        else if (story_position==7){
            pdfView.fromAsset("The_Joker_Presents_A_Puzzlebox_Director's_Cut_009_2021_digital_Son_of_Ultron_Empire.pdf.pdf").load();

        }
        else if (story_position==8){
            pdfView.fromAsset("The_Nice_House_on_the_Lake_2021_Digital_Zone_Empire.pdf.pdf").load();

        }
        else if (story_position==9){
            pdfView.fromAsset("The_Swamp_Thing_2021_digital_Son_of_Ultron_Empire.pdf.pdf").load();

        }

    }
}