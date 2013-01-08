package com.vpm.golfjoust.activities;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockActivity;
import com.vpm.golfjoust.R;

public class LoginActivity extends SherlockActivity {

	ProgressDialog progressDialog;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        
        setContentView(R.layout.activity_login);
        
        // Get our login button.
        
       // later Button loginButton = (Button) findViewById(R.id.login_button);
        Button guestButton = (Button) findViewById(R.id.login_as_guest_button);
        Button registrationButton = (Button) findViewById(R.id.register_button);
        
        // Set the login listener...later
        
       //loginButton.setOnClickListener(new LoginClickListener(this));
        
        guestButton.setOnClickListener(
              new OnClickListener()
              {
                 public void onClick(View v)
                 {
                	 //warning popup needs to be put here
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                 }
              });    
        
        registrationButton.setOnClickListener(
                new OnClickListener()
                {
                   public void onClick(View v)
                   {
                  	 //warning popup needs to be put here
                      startActivity(new Intent(getApplicationContext(), MainActivity.class));
                   }
                });   
        
    }
}
    /*

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_login, menu);
        return true;
    }
    
	private boolean validateInputFields() {
		
		// Initialize result zero.
		
		int result = 0;
		
		//Initialize the Email Matching Pattern.
		
		Pattern EMAIL_ADDRESS_PATTERN = Pattern.compile(
		          "[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}" +
		          "\\@" +
		          "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" +
		          "(" +
		          "\\." +
		          "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25}" +
		          ")+"
		          );

		 Trim the email.
		
		EditText emailAddress = (EditText) findViewById(R.id.login_email_input);
		emailAddress.setText(emailAddress.getText().toString().trim());
		
		// Trim the password.
		
		EditText password = (EditText) findViewById(R.id.login_password_input);
		password.setText(password.getText().toString().trim());

		 
		// Check the email
		
		if (emailAddress.getText().toString().equals("") || 
				!EMAIL_ADDRESS_PATTERN.matcher(emailAddress.getText().toString()).matches()) 
		{
			result++;
		} 
		
		// Check the password.
		
		else if (password.getText().toString().equals("") || 
				password.getText().toString().length() < 6) 
		{
			result++;
		} 

		// Did our inputs have a problem?
		
		if (result != 0) {
			emailAddress.setSelected(true);
			DialogUtil.CreateErrorDialog(this, "Invalid Email Address or Password");
		}
		
		// Return true if no errors, false otherwise.
		
		return result == 0 ? true : false;
		
	}
	
	private  void initializeNewLogin(User user) {
		ApplicationGlobals.setLoggedUser(user);
		//GolfJoustApplication.checkedInCourse = null;
		//GolfJoustApplication.holeScoresStatusArray.clearScores();
		//GolfJoustApplication.currentGame = null;
	}
    
//////////////////// Embedded Class - LoginClickListener ////////////////////
	
    private class LoginClickListener implements View.OnClickListener {
		
    	Activity activity;
    	
    	LoginClickListener(Activity parentActivity)
    	{
    		
    		// Store the parent activity for the progress dialog.
    		
    		activity = parentActivity;
    		
    	}
    	
		public void onClick(View v) {
			
			// Did our email and password inputs make sense?
			
			if (validateInputFields())
			{

				// Show a progress dialog while signing in.

				DialogUtil.ShowProgressDialog(activity, "Please wait", "Signing In");
				
				// Pass the credentials to the AsyncTask.
				
				Object[] params = new Object[2];
				
				params[0] = ((EditText) findViewById(R.id.login_email_input)).getText().toString().trim();
				
				params[1] = ((EditText) findViewById(R.id.login_password_input)).getText().toString().trim();
				
				// Start the AsyncTask.
				
				LoginTask signInTask = new LoginTask(activity);
				signInTask.execute(params);
				
			}
			
		}
	};
	
//////////////////// Embedded Class - SignInTask ////////////////////
	
	private class LoginTask extends AsyncTask<Object, Integer, User> {
		
		Activity activity;
		WebServiceUtil webServeUtil = WebServiceUtil.getInstance();
		
		public LoginTask (Activity parentActivity)
		{
			
			activity = parentActivity;
			
		}
		
		@Override
		protected User doInBackground(Object... params) {
			
			return webServeUtil.signIn(
					(String) params[0], (String) params[1], 1);
		}
		
		@Override
		protected void onPostExecute(User result) {
			
			//progressDialog.dismiss();
			DialogUtil.HideProgressDialog();
			
			// Did we get a valid user?
			
			if ((result != null))
			{
				//if (GolfJoustApplication.gjWebService.errorCode == WebServiceErrorCodes.NoError)
					
				// Successful sign in
				initializeNewLogin(result);	
				
				// Start the Dashboard Activity with the signedIn flag.
				
				Intent intent = new Intent(activity, ProfileTabFragment.class);
				intent.putExtra("signIn", true);
				startActivity(intent);
				
			} 
			
			// We had an error on log in.
			
			else
			{
				
				DialogUtil.CreateErrorDialog(activity, "Invalid Email Address or Password");
				
			}
		}
	}
	
}
*/
