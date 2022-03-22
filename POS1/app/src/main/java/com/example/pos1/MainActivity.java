package com.example.pos1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton btn_trouser = (ImageButton)findViewById(R.id.btn_trouser);
        ImageButton btn_shirt = (ImageButton)findViewById(R.id.btn_shirt);
        ImageButton btn_underwear = (ImageButton)findViewById(R.id.btn_underwear);

        ImageButton btn_f_trouser = (ImageButton)findViewById(R.id.btn_f_trouser);
        ImageButton btn_skirt = (ImageButton)findViewById(R.id.btn_skirt);
        ImageButton btn_blouse = (ImageButton)findViewById(R.id.btn_blouse);
        ImageButton btn_f_underwear = (ImageButton)findViewById(R.id.btn_f_underwear);


        btn_trouser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  amtrouser = new Intent(MainActivity.this, MTrouser.class);
                startActivity(amtrouser);
            }
        });
        btn_shirt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  ashirt = new Intent(MainActivity.this, Mshirts.class);
                startActivity(ashirt);
            }
        });
        btn_underwear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  amunderwear = new Intent(MainActivity.this, Munderwears.class);
                startActivity(amunderwear);
            }
        });





        btn_f_trouser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  af_trouser = new Intent(MainActivity.this, Ftrousers.class);
                startActivity(af_trouser);
            }
        });
        btn_skirt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  askirt = new Intent(MainActivity.this, Fskirts.class);
                startActivity(askirt);
            }
        });
        btn_blouse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  ablouse = new Intent(MainActivity.this, Fblouse.class);
                startActivity(ablouse);
            }
        });
        btn_f_underwear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  aunderwear = new Intent(MainActivity.this, Funderwear.class);
                startActivity(aunderwear);
            }
        });

    }
}