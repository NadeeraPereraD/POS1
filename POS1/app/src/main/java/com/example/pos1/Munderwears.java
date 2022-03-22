package com.example.pos1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Munderwears extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_munderwears);


        ImageButton btn_mvests = (ImageButton)findViewById(R.id.btn_mvests);
        ImageButton btn_munderpants= (ImageButton)findViewById(R.id.btn_munderpants);
        ImageButton btn_msocks = (ImageButton)findViewById(R.id.btn_msocks);


        btn_mvests.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent amvests = new Intent(Munderwears.this, MVests.class);
                startActivity(amvests);
            }
        });
        btn_munderpants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  amunderpants = new Intent(Munderwears.this, MUnderPants.class);
                startActivity(amunderpants);
            }
        });
        btn_msocks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  amsocks = new Intent(Munderwears.this, MSocks.class);
                startActivity(amsocks);
            }
        });



    }
}