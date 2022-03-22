package com.example.pos1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Fskirts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fskirts);

        ImageButton btn_flongskirts = (ImageButton)findViewById(R.id.btn_flongskirts);
        ImageButton btn_fshortskirts = (ImageButton)findViewById(R.id.btn_fshortskirts);


        btn_flongskirts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent aflongskirts = new Intent(Fskirts.this, FLongSkirts.class);
                startActivity(aflongskirts);
            }
        });
        btn_fshortskirts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  afshortskirts = new Intent(Fskirts.this, FShortSkirts.class);
                startActivity(afshortskirts);
            }
        });



    }
}