package com.example.greymat9er.miwokapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

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

        LinearLayout rootView = findViewById(R.id.rootView);

        /*
        TextView wordView = new TextView(this);
        wordView.setText(englishWords.get(0));
        rootView.addView(wordView);
        */

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, englishWords);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

    }

}
