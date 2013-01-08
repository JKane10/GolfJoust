package com.vpm.golfjoust.fragments;

import java.util.ArrayList;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ToggleButton;

import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockFragment;
import com.vpm.golfjoust.R;

public class CourseSearchFragment extends SherlockFragment {

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle SavedInstanceState) {
		return inflater.inflate(R.layout.fragment_course_search, container, false);
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        
	        //need to figure out how to do this in a fragment
	        //Spinner spinner = (Spinner) getView().findViewById(R.id.RatingSpinner);
	        
	        ArrayList<String> dummyList = new ArrayList<String>();

	        dummyList.add("Select Rating");
	        dummyList.add("5");
	        dummyList.add("4");
	        dummyList.add("3");
	        dummyList.add("2");
	        dummyList.add("1");
	        
	        //ArrayAdapter<String> ratingAdapter = new ArrayAdapter<String>(this,
	        //		android.R.layout.simple_spinner_item, dummyList);
	        
	        //ratingAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	        
	        //spinner.setAdapter(ratingAdapter);
	        		
	}	
	
	public void onCourseToggle(View view) {
		boolean on = ((ToggleButton) view).isChecked();
		
		if (on) {
			
		}
		else {
			
		}
	}
	
	public void onCityToggle(View view) {
		boolean on = ((ToggleButton) view).isChecked();
		
		if (on) {
			
		}
		else {
			
		}
	}
	
	public void onStateToggle(View view) {
		boolean on = ((ToggleButton) view).isChecked();
		
		if (on) {
			
		}
		else {
			
		}
	}
	
	public void onRatingToggle(View view) {
		boolean on = ((ToggleButton) view).isChecked();
		
		if (on) {
			
		}
		else {
			
		}
	}
	
}
