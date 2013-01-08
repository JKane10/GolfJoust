package com.vpm.golfjoust.util;

import com.vpm.golfjoust.models.User;

public class ApplicationGlobals {
	
	private static User loggedUser;
	
	public static void setLoggedUser (User newUser)
	{
		
		loggedUser = newUser;
		
	}
	
	public static User getLoggedUser ()
	{
		
		return loggedUser;
		
	}
	
}
