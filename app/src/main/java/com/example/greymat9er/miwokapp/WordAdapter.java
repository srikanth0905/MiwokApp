package com.example.greymat9er.miwokapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private static final String LOG_TAG = WordAdapter.class.getSimpleName();

    /*
    * @param context: is the current context file. Used to inflate layout file.
    * @param words:   is list of english and Miwok translation
    * */
    public WordAdapter(Activity context, ArrayList<Word> words){
        super(context, 0, words);
    }

    /*
    * Provides a view for an AdapterView(ListView, GridView etc)
    * @param position:    The position in the list of data that should be diaplayed in the ListItem view
    * @param convertView: The recycled view to repopulate
    * @param parent:      The parent ViewGroup used for inflation
    * @return:            The View for the position in the AdapterView
    *
    * */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        //check if the existing view is reused, otherwise infalte the view
        View listItemView = convertView;
        if (listItemView == null)
            listItemView = LayoutInflater.from(getContext()).
                    inflate(R.layout.list_item,parent,false);

        // Get the {@link Word} object located at this position in the list
        Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID numbersEng
        TextView engTextView = listItemView.findViewById(R.id.defaultTranslation);
        // Get the default translation from the current Word object and
        // set this text on the name TextView
        engTextView.setText(currentWord.getDefaultTranslation());

        // Find the TextView in the list_item.xml layout with the ID numbersMiwok
        TextView miwokTextView = listItemView.findViewById(R.id.miwokTranslation);
        // Get the miwok translation from the current Word object and
        // set this text on the name TextView
        miwokTextView.setText(currentWord.getMiwokTranslation());

        //Find the ImageView in the list_item.xml with ID image
        ImageView imageView = listItemView.findViewById(R.id.image);

        //check if there is any image present for current word
        if (currentWord.hasImage()) {
            //set the ImageView to the image resource specified in the current word
            imageView.setImageResource(currentWord.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        } else
            //set the image visibility to GONE, so that it doesnt take up any space
            imageView.setVisibility(View.GONE);

        return listItemView;
    }
}
