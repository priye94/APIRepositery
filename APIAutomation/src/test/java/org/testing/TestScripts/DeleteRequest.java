package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.ResponseValidation.ResponseStatusCodeValidate;
import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.PropertiesFileLoad;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class DeleteRequest {
	
	@Test
	public void TC5() throws IOException
	{
		Properties pr=PropertiesFileLoad.propertiesFile();
		HTTPMethods http=new HTTPMethods(pr);
		Response res=http.deleteRequest("QA_URI", PostRequestTC.id);
		System.out.println("Deleted Data is ");
		System.out.println(res.asString());
		
		ResponseStatusCodeValidate.responseStatusCode(res, 200);
	}
	
	
	
	
	
	

}
