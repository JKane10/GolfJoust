package com.vpm.golfjoust.fragments;

import java.util.ArrayList;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.actionbarsherlock.app.SherlockFragment;
import com.vpm.golfjoust.R;


public class DealsTabFragment extends SherlockFragment
{

	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		
		//ListView dealList = (ListView) findViewById(R.id.deal_list);
		
		ArrayList<String> dummyList = new ArrayList<String>();
		
		dummyList.add("deal1");
        dummyList.add("deal2");
        dummyList.add("deal3");
        dummyList.add("deal4");
        dummyList.add("deal1");
        dummyList.add("deal2");
        dummyList.add("deal3");
        dummyList.add("deal4");
        dummyList.add("deal1");
        dummyList.add("deal2");
        dummyList.add("deal3");
        dummyList.add("deal4");
        dummyList.add("deal1");
        dummyList.add("deal2");
        dummyList.add("deal3");
        dummyList.add("deal4");
		
        
        //ArrayAdapter<String> courseListAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dummyList);
        
       // dealList.setAdapter(courseListAdapter);
	}
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle SavedInstanceState) {
		return inflater.inflate(R.layout.fragment_course_tab, container, false);
	}
}
