package com.vpm.golfjoust.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.zip.GZIPInputStream;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONObject;

/**
 * JSON Web Service Invocation Class
 */
public class JsonWebService {
	
	private String endpoint;
	private  HttpClient httpclient;
	public int errorCode;
	public Exception systemException;

	
	public JsonWebService(String endpoint) {
		setEndpoint(endpoint);
		httpclient = new DefaultHttpClient();
	}

	/**
	* Invokes a web service method
	* @param method The method to be invoked
	* @param parameters Key - Value list of the parameter names and values
	* @return JSONObject containing the web service result or null in case of error
	*/
	protected JSONObject invokeWebService(String method, 
			HashMap<String, String> parameters) {
		try {
			
			// clear the error
			errorCode = WebServiceErrorCodes.NoError;
			systemException = null;
			
			StringEntity se = null;
			
			// fill the JSON object which should be sent
			if (parameters != null) {
				JSONObject jsonObject = new JSONObject();
				Iterator<String> iterator = parameters.keySet().iterator();
				while (iterator.hasNext()) {
					String key = (String) iterator.next();
					jsonObject.put(key, (String) parameters.get(key));
				}

				// generate StringEntity from the JSON object to be sent
				se = new StringEntity(jsonObject.toString());
			}		
			// build the web service url
			StringBuffer url = new StringBuffer();
			url.append(endpoint);
			url.append("/");
			url.append(method);

			// prepare the post request
			HttpPost httpPostRequest = new HttpPost(url.toString());
			httpPostRequest.setHeader("Content-Type", "application/json; charset=utf-8");
			httpPostRequest.setHeader("Accept", "application/json");
			if (se != null) {
				httpPostRequest.setEntity(se);
			}
			
			// call the web service 
			HttpResponse response = (HttpResponse) httpclient.execute(httpPostRequest);
			
			// process the response
			HttpEntity entity = response.getEntity();
			
			if (entity == null) {
				errorCode = WebServiceErrorCodes.EmptyResponseBody; 
				return null;
			}
			
			// Read the content stream
			InputStream instream = entity.getContent();
			Header contentEncoding = response.getFirstHeader("Content-Encoding");
			if (contentEncoding != null && contentEncoding.getValue().equalsIgnoreCase("gzip")) {
				instream = new GZIPInputStream(instream);
			}
			
			// convert content stream to a String
			String resultString = convertStreamToString(instream);
			instream.close();
			
			// Transform the String into a JSONObject
			return new JSONObject(resultString); 
						
		} catch (Exception e) {
			systemException = e;
			return null;
		}
		
	}
	
	/**
	 * Converts InputStream to String
	 * @param is InputStream to be converted
	 * @return Resulting string
	 * @throws IOException
	 */
	private static String convertStreamToString(InputStream is) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(is));
		StringBuilder sb = new StringBuilder();
		String line = null;
		while ((line = reader.readLine()) != null) {
			sb.append(line + "\n");
		}
	
		is.close();
		return sb.toString();
	}

	protected void setEndpoint(String newEndpoint) {
		endpoint = newEndpoint;
	}

	protected String getEndpoint() {
		return endpoint;
	}

	protected Exception getSystemException()
	{
		
		return systemException;
		
	}
	
	protected void setSystemException(Exception newSystemException)
	{
		
		systemException = newSystemException;
		
	}

	protected HttpClient getHttpclient() {
		return httpclient;
	}

	protected void setHttpclient(HttpClient newHttpclient) {
		httpclient = newHttpclient;
	}
}
