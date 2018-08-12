package com.example.greymat9er.miwokapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void numbersList(View view){
        Intent i = new Intent(this, NumbersActivity.class);
        startActivity(i);
    }

    public void colorsList(View view){
        Intent i = new Intent(this, Colors.class);
        startActivity(i);
    }

    public void phrasesList(View view){
        Intent i = new Intent(this, Phrases.class);
        startActivity(i);
    }

    public void familyList(View view){
        Intent i = new Intent(this, FamilyMembers.class);
        startActivity(i);
    }

}
