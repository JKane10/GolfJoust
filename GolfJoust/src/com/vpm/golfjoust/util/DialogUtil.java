package com.vpm.golfjoust.util;

import com.vpm.golfjoust.R;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;

public class DialogUtil {

	static ProgressDialog progressDialog;
	
	public static void CreateErrorDialog (Context context, String errorMessage)
	{

		// Get an AlertDialog.
		
		AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(context);
		
		dlgAlert.setMessage(errorMessage);
		
		dlgAlert.setTitle(context.getString(R.string.app_name));
		
		// Ok button with no explicit listener.
		
		dlgAlert.setPositiveButton("Ok", null);
		
		dlgAlert.create().show();
		
	}
	
	public static void ShowProgressDialog (Context context, String waitMessage, String operationMessage)
	{
		
		// Does our progress dialog exist?
		
		if (progressDialog == null)
		{
			
			// Create it anew.
			
			progressDialog = ProgressDialog.show(context, waitMessage, operationMessage);
			
		}
		
		// Is our progress dialog hidden?
		
		if (!progressDialog.isShowing())
		{
			
			// Show the new message.
			
			progressDialog = ProgressDialog.show(context, waitMessage, operationMessage);
			
		}
		
		// Otherwise, the progress dialog is currently showing.
		
		else
		{
			
			// Dismiss the dialog, alter the message, and show again.
			
			progressDialog.dismiss();
			progressDialog = ProgressDialog.show(context, waitMessage, operationMessage);
			
		}
		
	}
	
	public static void HideProgressDialog ()
	{
		
		progressDialog.dismiss();
		
	}
	
}
