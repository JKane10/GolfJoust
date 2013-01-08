package com.vpm.golfjoust.activities;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.vpm.golfjoust.R;

public class HomeWinsActivity extends Activity {

    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_wins);
                
        //listview of wins
        ListView winsList = (ListView) findViewById(R.id.wins_list);
        
        ArrayList<String> dummyList = new ArrayList<String>();

        dummyList.add("Win1");
        dummyList.add("Win2");
        dummyList.add("Win3");
        dummyList.add("Win14");
        dummyList.add("Win1");
        dummyList.add("Win2");
        dummyList.add("Win3");
        dummyList.add("Win14");
        dummyList.add("Win1");
        dummyList.add("Win2");
        dummyList.add("Win3");
        dummyList.add("Win14");
        dummyList.add("Win1");
        dummyList.add("Win2");
        dummyList.add("Win3");
        dummyList.add("Win14");
        
        ArrayAdapter<String> winsListAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dummyList);
        
        winsList.setAdapter(winsListAdapter);
        
    }
    
    
}
