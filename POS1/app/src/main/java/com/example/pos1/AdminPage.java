package com.example.pos1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdminPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_page);


        Button btn_add = findViewById(R.id.btn_add);
        Button btn_remove = findViewById(R.id.btn_remove);
        Button btn_edit = findViewById(R.id.btn_edit);
        Button btn_profit = findViewById(R.id.btn_profit);
        Button btn_stocklist = findViewById(R.id.btn_stocklist);


        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent add = new Intent(AdminPage.this, AddItems.class );
                startActivity(add);
            }
        });

        btn_edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent edit = new Intent(AdminPage.this, EditItems.class);
                startActivity(edit);
            }
        });

        btn_remove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent remove = new Intent(AdminPage.this, RemoveItems.class);
                startActivity(remove);
            }
        });

        btn_profit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent profit = new Intent(AdminPage.this, Profit.class);
                startActivity(profit);
            }
        });



    }
}