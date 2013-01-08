package com.vpm.golfjoust.activities;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.vpm.golfjoust.R;

public class JoustCourseSelectActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joust_course_select);
        
        /*
        //buttons - bottom bar
        Button back = (Button)findViewById(R.id.ProfileButton);
        
        profile.setOnClickListener(new View.OnClickListener() {
	 
			public void onClick(View v) {
				Intent intent = new Intent(JoustCourseSelectActivity.this, ???);
				startActivity(intent);
			}
		});
        
        progress.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				Intent intent = new Intent(HomeProfileActivity.this, HomeProgressActivity.class);
				startActivity(intent);
			}
		});
		*/
        
        
        ListView courseList = (ListView) findViewById(R.id.joust_course_list);
        
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
        
        ArrayAdapter<String> courseListAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dummyList);
        
        courseList.setAdapter(courseListAdapter);
        		
    }

}
