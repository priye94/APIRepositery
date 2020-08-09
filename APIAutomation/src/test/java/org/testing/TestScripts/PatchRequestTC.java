package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.json.JSONObject;
import org.testing.ResponseValidation.ResponseDataValidation;
import org.testing.ResponseValidation.ResponseStatusCodeValidate;
import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.PropertiesFileLoad;

import com.jayway.restassured.response.Response;

public class PatchRequestTC {
	
	public void TC5() throws IOException
	{
		JSONObject patchdata=new JSONObject();
		String body=patchdata.put("firstname", "Patch1").toString();
		Properties pr=PropertiesFileLoad.propertiesFile();
		HTTPMethods http=new HTTPMethods(pr);
		Response res=http.PatchRequest(body,"QA_URI", "1422722349");
		ResponseStatusCodeValidate.responseStatusCode(res, 200);
		ResponseDataValidation.responseData(res, "Patch", "firstname");
		System.out.println("Response is "+res.asString());
	}

}
