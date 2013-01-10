package com.vpm.golfjoust.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.SpinnerAdapter;

import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.ActionBar.OnNavigationListener;
import com.actionbarsherlock.app.SherlockFragment;
import com.vpm.golfjoust.R;

public class CourseTabFragment extends SherlockFragment{
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		ActionBar actionBar = getSherlockActivity().getSupportActionBar();
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_LIST);
		actionBar.setDisplayShowTitleEnabled(false);
		
        OnNavigationListener mOnNavigationListener;
        
        //very important, actually
        Context context = actionBar.getThemedContext();

        SpinnerAdapter mSpinnerAdapter = ArrayAdapter
        		.createFromResource(context, R.array.course_tabs, R.layout.sherlock_spinner_dropdown_item);
        mOnNavigationListener = new OnNavigationListener() {
        	
        	String[] strings = getResources().getStringArray(R.array.course_tabs);
        	
        	
            public boolean onNavigationItemSelected(int itemPosition, long itemId) {
            	FragmentTransaction transaction = getFragmentManager().beginTransaction();
                switch (itemPosition) {
                case 0:
                    transaction.replace(R.id.course_fragment_container, new CourseNearbyFragment(), strings[itemPosition]);
                    transaction.commit();
                    break;
                case 1:
                	transaction.replace(R.id.course_fragment_container, new CourseHomeFragment(), strings[itemPosition]);
                    transaction.commit();
                    break;
                case 2:
                	transaction.replace(R.id.course_fragment_container, new CourseSearchFragment(), strings[itemPosition]);
                    transaction.commit();
                    break;
                }
                // return super.onOptionsItemSelected(itemPosition);
                return true;
            }
        };
        actionBar.setListNavigationCallbacks(mSpinnerAdapter, mOnNavigationListener);
    
		
		//set view
		return inflater.inflate(R.layout.fragment_course_tab, container, false);
	}
}
