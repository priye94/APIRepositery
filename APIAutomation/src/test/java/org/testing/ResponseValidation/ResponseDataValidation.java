package org.testing.ResponseValidation;

import com.jayway.restassured.response.Response;

public class ResponseDataValidation {
	
	public static void responseData(Response res,String expectedData,String jsonPath)
	{
		String actualData=res.jsonPath().get(jsonPath);
		if(actualData.equals(expectedData))
		{
			System.out.println("Data is matching");
		}
		
		else
		{
			System.out.println("Data is not matching");
		}
	}

}
