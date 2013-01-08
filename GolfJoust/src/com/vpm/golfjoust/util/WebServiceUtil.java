package com.vpm.golfjoust.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutionException;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.Gson;

import com.vpm.golfjoust.models.Course;
import com.vpm.golfjoust.models.User;

public class WebServiceUtil extends JsonWebService {
	
	
	private static WebServiceUtil instance;
	
	private WebServiceUtil(String endpoint) 
	{
		//super(endpoint);
		
		// Set our endpoint to the Golf Joust server.
		
		super("http://golfjoust.com/services/Middleware/GolfJoustMiddleware.asmx");
		
	}
	
	public static WebServiceUtil getInstance()
	{
		
		// Lazy instantiation.
		
		if (instance == null)
		{
			
			instance = new WebServiceUtil("");
			
		}
		
		return instance;
				
	}

	private Object execute(String method, HashMap<String, String> parameters) {
		
		// call the web service
		JSONObject wsResult = super.invokeWebService(method, parameters);
		
		Object result = null;
		try {
			// The result is stored in the JSON key "d".
			// The result can be a JSONObject or an int or boolean ...

			// The result is JSONObject
			if (method.equals(WebServiceMethods.jsonGetAcceptedDeals)
					|| method.equals(WebServiceMethods.jsonGetCourseInfo)
					|| method.equals(WebServiceMethods.jsonGetGolferInfo)
					|| method.equals(WebServiceMethods.jsonGetGolferInfoShort)
					|| method.equals(WebServiceMethods.jsonGetNearCourses)
					|| method.equals(WebServiceMethods.jsonGetNearCoursesDetailed)
					|| method.equals(WebServiceMethods.jsonGolferSignIn)
					|| method.equals(WebServiceMethods.jsonGolferSignInFacebook)
					|| method.equals(WebServiceMethods.jsonGolferSignInLinkedIn)
					|| method.equals(WebServiceMethods.jsonAndroidGolferSignInTwitter)
					|| method.equals(WebServiceMethods.jsonIndividualGame_CreateOrJoin)
					|| method.equals(WebServiceMethods.jsonIndividualGame_GetGolferInGameScore)
					|| method.equals(WebServiceMethods.jsonIndividualGame_GetGolferStatsPerGolfCourse)
					|| method.equals(WebServiceMethods.jsonIndividualGame_GetGolferStatsTotal)
					|| method.equals(WebServiceMethods.jsonIndividualGame_GetGolferStatsPerGame)
					|| method.equals(WebServiceMethods.jsonIndividualGame_GetOpponentId)
					|| method.equals(WebServiceMethods.jsonCheckIn)
					|| method.equals(WebServiceMethods.jsonGetPlayedGames)
					|| method.equals(WebServiceMethods.jsonGetUnfinishedGame)
					|| method.equals(WebServiceMethods.jsonGetUnfinishedGameById)
					|| method.equals(WebServiceMethods.jsonGetTeesForGolfCourse)
					|| method.equals(WebServiceMethods.jsonGetGolfCourseHoleInfo)){
				result = wsResult.getJSONObject("d");
			} else if (method.equals(WebServiceMethods.jsonGetDealDetails)
					|| method.equals(WebServiceMethods.jsonGetDealsForGolfCourse)) {
				// for results containing escape strings (dates, urls....) which need extra processing pass the raw JSON result
				result = wsResult;
			} else if (method.equals(WebServiceMethods.jsonCheckOut)
					|| method.equals(WebServiceMethods.jsonDealAccept)
					|| method.equals(WebServiceMethods.jsonGolferSignUp)
					|| method.equals(WebServiceMethods.jsonIndividualGame_UploadHoleScoreDetailed)
					|| method.equals(WebServiceMethods.jsonInviteFriend)
					|| method.equals(WebServiceMethods.jsonAndroidGolferTwitterConnect)
					|| method.equals(WebServiceMethods.jsonGolferFacebookConnect)
					|| method.equals(WebServiceMethods.jsonGolferLinkedInConnect)
					|| method.equals(WebServiceMethods.jsonSetHomeCourse)
					|| method.equals(WebServiceMethods.jsonIndividualGame_CancelUnfinisgedGame)
					|| method.equals(WebServiceMethods.jsonIndividualGame_CancelUnfinishedGames)){
				// The result is Integer
				result = Integer.valueOf(wsResult.getInt("d"));
			} else if (method.equals(WebServiceMethods.jsonRateCourse)
					|| method.equals(WebServiceMethods.jsonUpdateGolferLevel)){
				// The result is boolean
				result = Boolean.valueOf(wsResult.getBoolean("d"));
			} else if (method.equals(WebServiceMethods.jsonSayHello)) {
				// The result is a String
				result = wsResult.getString("d");
			}
		} catch (JSONException e) {
			// if the reading of "d" fails, generate an error with the full
			// error message from the json and the JSONExeception
			super.setSystemException(new ExecutionException(wsResult.toString(), e));
		}
		return result;
	}
	
	public User signIn(final String email, final String password, Integer preSignIn) {
		HashMap<String, String> parameters = new HashMap<String, String>();
		parameters.put("email", email);
		parameters.put("password", password);
		parameters.put("presignin", preSignIn.toString());
		JSONObject jsonResult = (JSONObject) execute(
				WebServiceMethods.jsonGolferSignIn, parameters);

		if (jsonResult == null) {
			return null;
		}
		
		Gson gson = new Gson();
		
		String jsonstr = jsonResult.toString();
		User returnUser = gson.fromJson(jsonstr, User.class);
		
		return returnUser;		
	}
	
	// jsonGetNearCourses
	/**
	 * Calls the GetNearCourses web service method and returns the result
	 * 
	 * @param token
	 *            User token
	 * @param filter
	 *            ?
	 * @param latitude
	 *            Latitude
	 * @param longitude
	 *            Longitude
	 * @param radius
	 *            Radius around the point (latitude, longitude)
	 * @return
	 */
	public List<Course> getNearCourses(final String token, final String filter,
			final Double latitude, final Double longitude, final Double radius)
	{
		HashMap<String, String> parameters = new HashMap<String, String>();
		parameters.put("token", token);
		parameters.put("filter", filter);
		parameters.put("latitude", Double.toString(latitude));
		parameters.put("longitude", Double.toString(longitude));
		parameters.put("radius", Double.toString(radius));
		JSONObject jsonResult = (JSONObject) execute(WebServiceMethods.jsonGetNearCourses, parameters);

		if (jsonResult == null) 
		{
			return null;
		}

		List<Course> courseList = new ArrayList<Course>();
		Gson gson = new Gson();
		

		try 
		{
			super.errorCode = jsonResult.getInt("ErrorCode");

			JSONArray content = jsonResult.getJSONArray("Content");

			for (int i = 0; i < content.length(); i++)
			{
				String jsonstr = content.getString(i);
				Course newCourse = gson.fromJson(jsonstr, Course.class);
				courseList.add(newCourse);
			}

		} 
		catch (JSONException e) 
		{
				super.systemException = e;
				return null;
		}

		if (courseList.size() > 0) 
		{
				return courseList;
		} 
		else 
		{
				return null;
		}
	}
	
	// jsonGetGolferInfo
	public User getGolferInfo(final String token, final Long golferId) {
		HashMap<String, String> parameters = new HashMap<String, String>();
		parameters.put("token", token);
		parameters.put("golferId", Long.toString(golferId));
		JSONObject jsonResult = (JSONObject) execute(WebServiceMethods.jsonGetGolferInfo, parameters);

		if (jsonResult == null) {
			return null;
		}

		Gson gson = new Gson();
		
		try {
			super.errorCode = jsonResult.getInt("ErrorCode");
			String jsonstr = jsonResult.toString();
			User newUser = gson.fromJson(jsonstr, User.class);
			return newUser;
		} 
		catch (Exception e) {
			super.systemException = e;
			return null;
		}
		
	}

	// jsonGetGolferInfoShort
	public User getGolferInfoShort(final String token, final Long golferId) {
		HashMap<String, String> parameters = new HashMap<String, String>();
		parameters.put("token", token);
		parameters.put("golferId", Long.toString(golferId));
		JSONObject jsonResult = (JSONObject) execute(WebServiceMethods.jsonGetGolferInfoShort,
				parameters);

		if (jsonResult == null) {
			return null;
		}

		try {
			super.errorCode = jsonResult.getInt("ErrorCode");

			User user = new User();
			user.setId(jsonResult.getLong("Id"));
			user.setFirstName(jsonResult.getString("FirstName"));
			user.setLastName(jsonResult.getString("LastName"));
			user.setCurrentHandicap(Double.valueOf(jsonResult.getDouble("Handicap")));
			user.setGolferLevelId(Integer.valueOf(jsonResult
					.getInt("GolferLevelId")));

			return user;
		} catch (Exception e) {
			super.systemException = e;
			return null;
		}
	}
}
