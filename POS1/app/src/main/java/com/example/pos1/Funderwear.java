package com.example.pos1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Funderwear extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_funderwear);


        ImageButton btn_fvest = (ImageButton)findViewById(R.id.btn_fvest);
        ImageButton btn_fpants = (ImageButton)findViewById(R.id.btn_fpants);
        ImageButton btn_fbras = (ImageButton)findViewById(R.id.btn_fbras);


        btn_fvest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent afvest = new Intent(Funderwear.this, FVest.class);
                startActivity(afvest);
            }
        });
        btn_fpants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  afpants = new Intent(Funderwear.this, FUnderPants.class);
                startActivity(afpants);
            }
        });
        btn_fbras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  afbra = new Intent(Funderwear.this, FBra.class);
                startActivity(afbra);
            }
        });



    }
}