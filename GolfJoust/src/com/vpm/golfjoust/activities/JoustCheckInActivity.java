package com.vpm.golfjoust.activities;

import com.vpm.golfjoust.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;
import android.view.View.OnClickListener;


public class JoustCheckInActivity extends Activity
{

	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		  setContentView(R.layout.activity_joust_course_check_in);
		  
		  //course picture
		  
		  //course name
		  
		  //list of pictures for side scroll
		//  ArrayList pictureList = new ArrayList();
		  
		  //check in button
	         final Button checkInButton = (Button) findViewById(R.id.button1);
	         checkInButton.setOnClickListener(
	               new OnClickListener()
	               {
	                  public void onClick(View v)
	                  {
	                	  checkInButton.setText("Checked In!");
	                  }
	               });
	         
	}
	
}
