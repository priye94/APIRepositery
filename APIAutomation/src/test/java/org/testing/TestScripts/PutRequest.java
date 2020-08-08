package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.json.JSONObject;
import org.testing.ResponseValidation.ResponseDataValidation;
import org.testing.ResponseValidation.ResponseStatusCodeValidate;
import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.PropertiesFileLoad;

import com.jayway.restassured.response.Response;

public class PutRequest {

	public void TC4() throws IOException {
		
		JSONObject data=new JSONObject();
		data.put("firstname", "Test");
		data.put("lastname", "API1");
		data.put("degination", "Team lead");
		data.put("id", "testid1");
		
		Properties pr=PropertiesFileLoad.propertiesFile();
		HTTPMethods http=new HTTPMethods(pr);
		Response res=http.PutRequest(data.toString(), "QA_URI", PostRequestTC.id);
		System.out.println("Put Request response Data");
		System.out.println(res.asString());
		ResponseStatusCodeValidate.responseStatusCode(res, 200);
		ResponseDataValidation.responseData(res, "Test", "firstname");

	}

}
