package com.example.programmingebooks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class MainActivity2 extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        pdfView=findViewById(R.id.pdfView);

        int story_position=getIntent().getIntExtra("key_position",0);
        if (story_position==0){
            pdfView.fromAsset("a.pdf").load();
        }

        else if (story_position==1){
            pdfView.fromAsset("b.pdf").load();
        }

        else if (story_position==2){
            pdfView.fromAsset("c.pdf").load();
        }

        else if (story_position==3){
            pdfView.fromAsset("d.pdf").load();
        }
        else if (story_position==4){
            pdfView.fromAsset("e.pdf").load();
        }

        else if (story_position==5){
            pdfView.fromAsset("f.pdf").load();
        }
        else if (story_position==6){
            pdfView.fromAsset("g.pdf").load();
        }

        else if (story_position==7){
            pdfView.fromAsset("h.pdf").load();
        }

    }
}