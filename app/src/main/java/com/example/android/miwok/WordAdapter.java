package com.example.android.miwok;

import android.app.Activity;
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

public class WordAdapter extends ArrayAdapter {

    private int mColorResourceId;

    public WordAdapter(Activity context, ArrayList<Word> words, int colorResourceId) {
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }

    @NonNull
    @Override

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {

            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Word currentWord = (Word) getItem(position);

        //find the ImageView in the list_item.xml layout with the ID version_name
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.image_placeholder);

        if (currentWord.hasImage()) {
            //Set the ImageView to the image resource specified in the current Word
            iconView.setImageResource(currentWord.getImageResourceId());
            //Make sure the view is visible
            iconView.setVisibility(View.VISIBLE);
        } else {
            // otherwise hide the ImageView (set visibility to GONE)
            iconView.setVisibility(View.GONE);
        }
        // Find the TextView in the list_item.xml layout with the ID text_view1
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.text_view1);
        // Get the version name from the current N object and
        // set this text on the name TextView
        miwokTextView.setText(currentWord.getmMiwokTranslation());

        // Find the TextView in the list_item.xml layout with the ID version_number
        android.widget.TextView defaultTextView = (TextView) listItemView.findViewById(R.id.text_view2);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        defaultTextView.setText(currentWord.getmDefaultTranslation());

        // set the theme colour for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the colour that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background colour of the text container View
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }

}
