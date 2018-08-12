package com.example.greymat9er.miwokapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        //Creating ArrayList for Numbers
        ArrayList<String> englishWords = new ArrayList<>();

        //adding the words to ArrayList
        englishWords.add("one");
        englishWords.add("two");
        englishWords.add("three");
        englishWords.add("four");
        englishWords.add("five");
        englishWords.add("six");
        englishWords.add("seven");
        englishWords.add("eight");
        englishWords.add("nine");
        englishWords.add("ten");

        //log messages to check if the worsd are getting added in ArrayList
        logMessage(englishWords);
    }

    private void logMessage(ArrayList word) {
        for (int i = 0; i < word.size(); i++) {
            Log.v("Numbers Activity", "Word at index " + i + " " + word.get(i));
        }
    }
}
