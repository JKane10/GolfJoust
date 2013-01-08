package com.vpm.golfjoust.activities;

import com.vpm.golfjoust.R;
import com.vpm.golfjoust.fragments.CourseNearbyFragment;
import com.vpm.golfjoust.fragments.ProfileTabFragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;

public class DealDetailActivity extends Activity
{

	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		  setContentView(R.layout.activity_deal_detail);

		    //joust button
	         Button joustButton = (Button) findViewById(R.id.JoustButton);
	        joustButton.setOnClickListener(
	              new OnClickListener()
	              {
	                 public void onClick(View v)
	                 {
	                 startActivity(new Intent(getApplicationContext(), JoustCourseSelectActivity.class));
	                 }
	              });
	       
	       //deals button
	         Button dealsButton = (Button) findViewById(R.id.DealsButton);
	        dealsButton.setOnClickListener(
	              new OnClickListener()
	              {
	                 public void onClick(View v)
	                 {
	                    startActivity(new Intent(getApplicationContext(), DealDetailActivity.class));
	                 }
	              });
	       
	       //golf ball button
	         Button galleryButton = (Button) findViewById(R.id.GalleryButton);
	        galleryButton.setOnClickListener(
	              new OnClickListener()
	              {
	                 public void onClick(View v)
	                 {
	                 //*!startActivity(new Intent(getApplicationContext(), whatactivity?.class));
	                 }
	              });
	       
	       //course button
	         Button exploreButton = (Button) findViewById(R.id.ExploreButton);
	        exploreButton.setOnClickListener(
	              new OnClickListener()
	              {
	                 public void onClick(View v)
	                 {
	                    startActivity(new Intent(getApplicationContext(), CourseNearbyFragment.class));
	                 }
	              });
	       
	       //home button
	         Button homeButton = (Button) findViewById(R.id.HomeButton);
	        homeButton.setOnClickListener(
	              new OnClickListener()
	              {
	                 public void onClick(View v)
	                 {
	                    startActivity(new Intent(getApplicationContext(), ProfileTabFragment.class));
	                 }
	              });
		  
		  
	}
	
}

