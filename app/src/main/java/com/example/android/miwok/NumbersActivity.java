/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.word_list);

        //Create an ArrayList of words
        ArrayList<Word> wordArrayList = new ArrayList<>();
        wordArrayList.add(new Word("one", "lutti"));
        wordArrayList.add(new Word("two", "otiiko"));
        wordArrayList.add(new Word("three", "tolookosu"));
        wordArrayList.add(new Word("four", "oyyisa"));
        wordArrayList.add(new Word("five", "massokka"));
        wordArrayList.add(new Word("six", "temmokka"));
        wordArrayList.add(new Word("seven", "kenekaku"));
        wordArrayList.add(new Word("eight", "kawinta"));
        wordArrayList.add(new Word("nine", "wo'e"));
        wordArrayList.add(new Word("ten", "na'aacha"));


        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // list_item.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        WordAdapter adapter = new WordAdapter(this, wordArrayList);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        assert listView != null;
        listView.setAdapter(adapter);
    }

}



