package com.example.firebaseloginsignup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FacultyPanel extends AppCompatActivity implements View.OnClickListener {

    Button button1;
    Button button2;
    Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty_panel);

        button1 = findViewById(R.id.buttonAddFaculty);
        button2 = findViewById(R.id.buttonViewFaculty);
        button3 = findViewById(R.id.buttonFindFaculty);


        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v==button1){

            Intent i = new Intent(getApplicationContext(), addFaculty.class);
            startActivity(i);
        }
        if (v==button2){

            Intent i = new Intent(getApplicationContext(), ViewFaculty.class);
            startActivity(i);
        }
        if (v==button3){
            Intent i = new Intent(getApplicationContext(), FindFaculty.class);
            startActivity(i);
        }


    }
}
