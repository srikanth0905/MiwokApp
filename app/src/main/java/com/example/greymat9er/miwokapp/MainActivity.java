package com.example.greymat9er.miwokapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find the view that shows numbers category
        TextView numbers = (TextView) findViewById(R.id.NumbersView);

        //set a click listener to that View
        numbers.setOnClickListener(new View.OnClickListener() {
            //This method will execute when numbers View is clicked
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(i);
            }
        });

        //Find the view that shows Colors category
        TextView colors = (TextView) findViewById(R.id.ColorsView);

        //set a click listener to that View
        colors.setOnClickListener(new View.OnClickListener() {
            //This method will execute when numbers View is clicked
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Colors.class);
                startActivity(i);
            }
        });

        //Find the view that shows Phrases category
        TextView phrases = (TextView) findViewById(R.id.PhrasesView);

        //set a click listener to that View
        phrases.setOnClickListener(new View.OnClickListener() {
            //This method will execute when numbers View is clicked
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Phrases.class);
                startActivity(i);
            }
        });

        //Find the view that shows Family category
        TextView family = (TextView) findViewById(R.id.FamilyView);

        //set a click listener to that View
        family.setOnClickListener(new View.OnClickListener() {
            //This method will execute when numbers View is clicked
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, FamilyMembers.class);
                startActivity(i);
            }
        });

    }
    /*
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
    */

}
