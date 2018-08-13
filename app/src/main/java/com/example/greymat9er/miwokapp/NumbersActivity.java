package com.example.greymat9er.miwokapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //Creating ArrayList for Numbers
        ArrayList<Word> words = new ArrayList<>();

        //adding the words to ArrayList
        words.add(new Word("one", "lutti", R.drawable.number_one));
        words.add(new Word("two", "otiiko", R.drawable.number_two));
        words.add(new Word("three", "tolookosu", R.drawable.number_three));
        words.add(new Word("four", "oyyisa", R.drawable.number_four));
        words.add(new Word("five", "massokka", R.drawable.number_five));
        words.add(new Word("six", "temmokka", R.drawable.number_six));
        words.add(new Word("seven", "kenekaku", R.drawable.number_seven));
        words.add(new Word("eight", "kawinta", R.drawable.number_eight));
        words.add(new Word("nine", "wo’e", R.drawable.number_nine));
        words.add(new Word("ten", "na’aacha", R.drawable.number_ten));

        //LinearLayout rootView = findViewById(R.id.rootView);

        /*
        TextView wordView = new TextView(this);
        wordView.setText(englishWords.get(0));
        rootView.addView(wordView);
        */

        WordAdapter adapter = new WordAdapter(this, words, R.color.number);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);

    }

}
