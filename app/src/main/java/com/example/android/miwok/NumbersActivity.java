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

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.ViewGroup;
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


        /*Create array for storing list of words
        String[] words = new String[10];
         words[0] = "one";
        words[1] = "two";
        words[2] = "three";
        words[3] = "four";
        words[4] = "five";
        words[5] = "six";
        words[6] = "seven";
        words[7] = "eight";
        words[8] = "nine";
        words[9] = "ten";

         */

        ArrayList<String> words = new ArrayList<>();
        words.add( "one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

        //casting object for finding the view
        //LinearLayout rootView= (LinearLayout)findViewById(R.id.rootView);

        //int index = 0;

        //while (index <10)
        /*
         for (int index =0; index< words.size(); index++){
            TextView wordView = new TextView(this); //this refers to NumbersActivity that considered as context
            wordView.setText(words.get(index));
            rootView.addView(wordView);

            //index ++;

        } */

        /*checking errors
        Log.v("NumbersActivity","Word at index 0: " +words[0]);
        Log.v("NumbersActivity","Word at index 1: " +words[1]);
        Log.v("NumbersActivity","Word at index 2: " +words[2]);
        Log.v("NumbersActivity","Word at index 3: " +words[3]);
        Log.v("NumbersActivity","Word at index 4: " +words[4]);
        Log.v("NumbersActivity","Word at index 5: " +words[5]);
        Log.v("NumbersActivity","Word at index 6: " +words[6]);
        Log.v("NumbersActivity","Word at index 7: " +words[7]);
        Log.v("NumbersActivity","Word at index 8: " +words[8]);
        Log.v("NumbersActivity","Word at index 9: " +words[9]);

        */

    }



}
