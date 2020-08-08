package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;
import org.testing.ResponseValidation.ResponseDataValidation;
import org.testing.ResponseValidation.ResponseStatusCodeValidate;
import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.JsonFileRead;
import org.testing.utilities.JsonVariableReplacement;
import org.testing.utilities.PropertiesFileLoad;
import org.testing.utilities.ResponseExtractionUsingJsonPath;

import com.jayway.restassured.response.Response;

public class PostRequestThankfulReplacement {
	
	static String purchase_id;
	public void TC1() throws IOException {
		
		String body=JsonFileRead.bodyDataRead("../APIAutomation/src/test/java/org/testing/PayloadData/ThankfulReplacement.json");
		body=JsonVariableReplacement.jsonVariable(body, "purchase_id", "77097086");
		
		Properties pr=PropertiesFileLoad.propertiesFile();
		
		HTTPMethods http=new HTTPMethods(pr);
		Response res=http.PostRequest(body, "QA_URIN");
		System.out.println("Post Request response Data");
		System.out.println(res.asString());
		
		ResponseStatusCodeValidate.responseStatusCode(res, 201);
		ResponseDataValidation.responseData(res, "purchase_id", "77097086");
		
		purchase_id=ResponseExtractionUsingJsonPath.responseExtract("purchase_id",res);
	}

}

