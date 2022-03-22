package com.example.pos1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Mshirts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mshirts);

        ImageButton btn_mlongsleeves = (ImageButton)findViewById(R.id.btn_mlongsleeves);
        ImageButton btn_mshortsleeves= (ImageButton)findViewById(R.id.btn_mshortsleeves);
        ImageButton btn_mtshirts = (ImageButton)findViewById(R.id.btn_mtshirts);
        ImageButton btn_mtanktops = (ImageButton)findViewById(R.id.btn_mtanktops);
        ImageButton btn_mhoodies = (ImageButton)findViewById(R.id.btn_mhoodies);

        btn_mlongsleeves.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent amlongsleeves = new Intent(Mshirts.this, MLongSleeves.class);
                startActivity(amlongsleeves);
            }
        });
        btn_mshortsleeves.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  amshortsleeves = new Intent(Mshirts.this, MShortSleeves.class);
                startActivity(amshortsleeves);
            }
        });
        btn_mtshirts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  amtshirts = new Intent(Mshirts.this, MTShirts.class);
                startActivity(amtshirts);
            }
        });


        btn_mtanktops.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  amtanktops = new Intent(Mshirts.this, MTankTops.class);
                startActivity(amtanktops);
            }
        });
        btn_mhoodies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  amhoodies = new Intent(Mshirts.this, MHoodies.class);
                startActivity(amhoodies);
            }
        });





    }
}