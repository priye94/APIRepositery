package org.testing.ResponseValidation;

import com.jayway.restassured.response.Response;

public class ResponseStatusCodeValidate {
	
	public static void responseStatusCode(Response res,int expectedStatusCode)
	{
		if(res.getStatusCode()==expectedStatusCode)
		{
			System.out.println("Status code is matching");
		}
		else
		{
			System.out.println("Status code is not matching");
		}
	}

}
