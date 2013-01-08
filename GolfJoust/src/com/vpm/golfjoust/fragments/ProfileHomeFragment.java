package com.vpm.golfjoust.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.actionbarsherlock.app.SherlockFragment;
import com.vpm.golfjoust.R;

public class ProfileHomeFragment extends SherlockFragment {
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle SavedInstanceState) {
		return inflater.inflate(R.layout.fragment_profile_home, container, false);
	}


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

}