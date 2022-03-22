package com.example.pos1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Fblouse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fblouse);

        ImageButton btn_fcasualblouses = (ImageButton)findViewById(R.id.btn_fcasualblouses);
        ImageButton btn_ftanktop = (ImageButton)findViewById(R.id.btn_ftanktop);
        ImageButton btn_fhoodies = (ImageButton)findViewById(R.id.btn_fhoodies);
        ImageButton btn_ftshirt = (ImageButton)findViewById(R.id.btn_ftshirt);


        btn_fcasualblouses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Intent afcasualblouse = new Intent(Fblouse.this, FBlouseBlouse.class);
                startActivity(afcasualblouse);*/
                Intent afcasualnew = new Intent(Fblouse.this, DisplayItems.class);
                afcasualnew.putExtra("title","casual blouse");
                startActivity(afcasualnew);
            }
        });
        btn_ftanktop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Intent  aftanktop = new Intent(Fblouse.this, FTankTops.class);
                startActivity(aftanktop);*/
                Intent afcasualnew = new Intent(Fblouse.this, DisplayItems.class);
                afcasualnew.putExtra("title","tank top");
                startActivity(afcasualnew);
            }
        });
        btn_fhoodies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  afhoodies = new Intent(Fblouse.this, FHoodies.class);
                startActivity(afhoodies);
            }
        });
        btn_ftshirt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  aftshirt = new Intent(Fblouse.this, FTShirts.class);
                startActivity(aftshirt);
            }
        });


    }
}