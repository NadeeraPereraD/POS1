package com.example.pos1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Ftrousers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ftrousers);

        ImageButton btn_fformaltrousers = (ImageButton)findViewById(R.id.btn_fformaltrousers);
        ImageButton btn_fjeans = (ImageButton)findViewById(R.id.btn_fjeans);
        ImageButton btn_fthreequarter = (ImageButton)findViewById(R.id.btn_fthreequarter);
        ImageButton btn_fbottoms = (ImageButton)findViewById(R.id.btn_fbottoms);


        btn_fformaltrousers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent afformaltrouser = new Intent(Ftrousers.this, FFormalTrouser.class);
                startActivity(afformaltrouser);
            }
        });
        btn_fjeans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  afjeans = new Intent(Ftrousers.this, FDenim.class);
                startActivity(afjeans);
            }
        });
        btn_fthreequarter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  afthreequater = new Intent(Ftrousers.this, FThreeQuater.class);
                startActivity(afthreequater);
            }
        });
        btn_fbottoms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  afunderpants = new Intent(Ftrousers.this, FUnderPants.class);
                startActivity(afunderpants);
            }
        });







    }
}