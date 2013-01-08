package com.vpm.golfjoust.fragments;

import java.util.ArrayList;
import java.util.List;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockFragment;
import com.vpm.golfjoust.R;
import com.vpm.golfjoust.models.Course;
import com.vpm.golfjoust.util.ApplicationGlobals;
import com.vpm.golfjoust.util.DialogUtil;
import com.vpm.golfjoust.util.WebServiceUtil;

public class CourseNearbyFragment extends SherlockFragment {
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle SavedInstanceState) {
		return inflater.inflate(R.layout.fragment_course_nearby, container, false);
	}


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       /* 
		Object[] params = new Object[5];
		
		params[0] = ApplicationGlobals.getLoggedUser().getToken();
		params[1] = "";
		params[2] = 32.59815876087672;
		params[3] = -85.48023104667664;
		params[4] = 50.0;
		
        
        // Start the AsyncTask.
		
		//GetNearbyCoursesTask nearbyCourseTask = new GetNearbyCoursesTask(this);
		//nearbyCourseTask.execute(params);
		
		*/
        
    }

	////////////////////Embedded Class - GetNearbyCoursesTask ////////////////////
	private class GetNearbyCoursesTask extends AsyncTask<Object, Integer, List<Course>> {

		SherlockFragment fragment;
		WebServiceUtil webServeUtil = WebServiceUtil.getInstance();
		
		public GetNearbyCoursesTask (SherlockFragment parent)
		{
			
			fragment = parent;
			
		}
		
		@Override
		protected List<Course> doInBackground(Object... params) {

			String token = (String) params[0];
			String filter = (String) params[1];
			Double latitude = (Double) params[2];
			Double longitude = (Double) params[3];
			Double radius = (Double) params[4];
			
			return webServeUtil.getNearCourses(token, filter, latitude, longitude, radius);
			
		}
		
		@Override
		protected void onPostExecute(List<Course> result) {
			
			//progressDialog.dismiss();
			DialogUtil.HideProgressDialog();
			
			// Did we get a valid list of courses?
			
			if ((result != null))
			{	
				
				// Populate the Course List.
				
				ArrayList<String> nameList = new ArrayList<String>();
				
				for (int i = 0; i < result.size(); i++)
				{
					
					nameList.add(((Course) result.get(i)).getCourseName());
					
				}

		        ListView courseList = (ListView) getView().findViewById(R.id.course_list);
		        
		        //adapt for fragments
		        //ArrayAdapter<String> courseListAdapter = new ArrayAdapter<String>(activity, android.R.layout.simple_list_item_1, nameList);
		        
		        //courseList.setAdapter(courseListAdapter);
				
			} 
			
			// We had an error on retrieval.
			
			else
			{
				//adapt for fragments
				//DialogUtil.CreateErrorDialog(activity, "There was a problem finding nearby courses.");
				
			}
		}
	}
	
}
