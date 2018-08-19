package com.example.greymat9er.miwokapp;

import android.app.Activity;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private static final String LOG_TAG = WordAdapter.class.getSimpleName();
    private Activity activityContext;
    /*
    * @param context: is the current context file. Used to inflate layout file.
    * @param words:   is list of english and Miwok translation
     */

    private int mcolorReferenceId;

    WordAdapter(Activity context, ArrayList<Word> words, int colorResourceId) {
        super(context, 0, words);
        activityContext = context;
        mcolorReferenceId = colorResourceId;
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
        final Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID numbersEng
        TextView engTextView = listItemView.findViewById(R.id.defaultTranslation);
        // Get the default translation from the current Word object and
        // set this text on the name engTextView
        engTextView.setText(currentWord.getDefaultTranslation());

        // Find the TextView in the list_item.xml layout with the ID numbersMiwok
        TextView miwokTextView = listItemView.findViewById(R.id.miwokTranslation);
        // Get the miwok translation from the current Word object and
        // set this text on the name miwokTextView
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


        //Get the audio reference file
        final int audio = currentWord.getmAudioResource();



        //Set theme color for the list item
        View textcontainer = listItemView.findViewById(R.id.text_container);
        //Find the color that resource Id maps to
        int color = ContextCompat.getColor(getContext(), mcolorReferenceId);
        //set the background color of the text container View
        textcontainer.setBackgroundColor(color);


        //Get id of LinearLayout in list item to check for onClickListeners
        //Media playback
        //Create a MediaPlayer object


        return listItemView;
    }
}
