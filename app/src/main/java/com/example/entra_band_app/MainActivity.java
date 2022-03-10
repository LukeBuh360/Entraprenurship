package com.example.entra_band_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button btnLogin = (Button) findViewById(R.id.btnLogin);
Button btnSignup = (Button) findViewById(R.id.btnSignup);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //login button to go to login page
        btnLogin.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

            }
        });
        //signup button to go to signup page
        btnSignup.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

            }
        });
    }
}