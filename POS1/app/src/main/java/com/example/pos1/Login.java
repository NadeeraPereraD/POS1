package com.example.pos1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    private String adminusername = "Admin";
    private String adminpassword = "admin";

    private String cashierusername = "Cashier";
    private String cashierpassword = "cashier";

    private String cusername;
    private String cpassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);

        EditText et_username = findViewById(R.id.et_username);
        EditText et_password = findViewById(R.id.et_password);

        Button btn_login = findViewById(R.id.btn_login);


        et_username.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                cusername = et_username.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable editable) {



            }
        });

        et_password.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                cpassword = et_password.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });



        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(cashierusername.compareTo(cusername)==0 && cashierpassword.compareTo(cpassword)==0){

                    Intent  cashier = new Intent(Login.this, MainActivity.class);
                    startActivity(cashier);
                }

                else if(adminusername.compareTo(cusername)==0 && adminpassword.compareTo(cpassword)==0){

                    Intent  cashier = new Intent(Login.this, AdminPage.class);
                    startActivity(cashier);
                }

                else {
                    Toast.makeText(getApplicationContext(),"Please enter correct User Name & Password", Toast.LENGTH_LONG).show();
                }


            }
        });









    }
}