package com.example.pos1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MTrouser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mtrouser);

        ImageButton btn_mformaltrousers = (ImageButton)findViewById(R.id.btn_mformaltrousers);
        ImageButton btn_mdenims = (ImageButton)findViewById(R.id.btn_mdenims);
        ImageButton btn_mshorts = (ImageButton)findViewById(R.id.btn_mshorts);
        ImageButton btn_mbottoms = (ImageButton)findViewById(R.id.btn_mbottoms);


        btn_mformaltrousers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent amformaltrouser = new Intent(MTrouser.this, MFormalTrouser.class);
                startActivity(amformaltrouser);
            }
        });


        btn_mdenims.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent amdenims = new Intent(MTrouser.this, MDenim.class);
                startActivity(amdenims);
            }
        });


        btn_mshorts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent amshorts = new Intent(MTrouser.this, MShorts.class);
                startActivity(amshorts);
            }
        });


        btn_mbottoms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ambottoms = new Intent(MTrouser.this, MBottoms.class);
                startActivity(ambottoms);
            }
        });
    }
}