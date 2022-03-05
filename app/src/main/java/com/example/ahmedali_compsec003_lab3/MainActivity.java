package com.example.ahmedali_compsec003_lab3;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {
    //Declare string array
    String[] exercises;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView lstView = getListView();

        lstView.setChoiceMode(ListView.CHOICE_MODE_NONE);
        lstView.setTextFilterEnabled(true);
        //populate the array activities
        exercises = getResources().getStringArray(R.array.exercises);
        //set the adapter to array activities
        //binds the array with the list view
        setListAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, exercises));
    }
    //list item event handler
    public void onListItemClick(ListView parent, View v, int position, long id)
    {
        //When you select an item from the list the color is set to dark blue
        getListView().setSelector(android.R.color.holo_blue_dark);

        Intent i=null;
        switch (position)
        {
            case 0:
                i = new Intent(this, Exercise_01.class);
                break;
            case 1:
                i = new Intent(this, Exercise_02.class);
                break;
            case 2:
                i = new Intent(this, Exercise_03.class);
                break;
        }
        startActivity(i);
    } // end method
} // end class
