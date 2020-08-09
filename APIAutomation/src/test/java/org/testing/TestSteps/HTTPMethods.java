package org.testing.TestSteps;

import java.util.Properties;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.*;

public class HTTPMethods {
	
	Properties pr;
	public HTTPMethods(Properties pr)
	{
		this.pr=pr;
	}
	
	
	public Response PostRequest(String bodyData, String uriKey)
	{
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(bodyData)
		.when()
		.post(pr.getProperty(uriKey));
		return res;
	}
	
	public Response GetRequest(String uriKey, String EndPoint)
	{
		String uri=pr.getProperty(uriKey)+"/"+EndPoint;
		System.out.println("URI is = "+uri);
		Response res=
		given()
		.contentType(ContentType.JSON)
		.when()
		.get(uri);
		
		return res;
	}
	
	public Response GetRequestWithQuery(String uriKey,String QueryParameter, String QueryValue)
	{
		String uri=pr.getProperty(uriKey)+"?"+QueryParameter+"="+QueryValue;
		System.out.println("URI is"+uri);
		Response res=
		given()
		.contentType(ContentType.JSON)
		.when()
		.get(uri);
		
		return res;
	}
	
	public Response PutRequest(String bodyData, String uriKey,String ParameterValue)
	{
		String uri=pr.getProperty(uriKey)+"/"+ParameterValue;
		System.out.println("URI for Put request is : "+uri);
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(bodyData)
		.when()
		.put(uri);
		
		return res;
	}
	
	public Response deleteRequest(String uriKey, String ParameterValue)
	{
		String uri=pr.getProperty(uriKey)+"/"+ParameterValue;
		System.out.println("URI for Delete request is : "+uri);
		Response res=
		given()
		.contentType(ContentType.JSON)
		.when()
		.delete(uri);
		
		return res;
	}
	
	public Response PatchRequest(String bodyData, String uriKey,String ParameterValue)
	{
		String uri=pr.getProperty(uriKey)+"/"+ParameterValue;
		System.out.println("URI for Put request is : "+uri);
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(bodyData)
		.when()
		.patch(uri);
		
		return res;
	}

}
