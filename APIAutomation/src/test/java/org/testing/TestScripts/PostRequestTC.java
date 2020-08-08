package org.testing.TestScripts;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.testing.ResponseValidation.ResponseDataValidation;
import org.testing.ResponseValidation.ResponseStatusCodeValidate;
import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.JsonFileRead;
import org.testing.utilities.JsonVariableReplacement;
import org.testing.utilities.PropertiesFileLoad;
import org.testing.utilities.ResponseExtractionUsingJsonPath;

import com.jayway.restassured.response.Response;

public class PostRequestTC {
	
	static String id;
	static String firstname;
	public void TC1() throws IOException {
		
		String body=JsonFileRead.bodyDataRead("../APIAutomation/src/test/java/org/testing/PayloadData/body.json");
		Random r=new Random();
		Integer v=r.nextInt();
		body=JsonVariableReplacement.jsonVariable(body, "id", v.toString());
		body=JsonVariableReplacement.jsonVariable(body, "firstname", "Abhi");
		
		Properties pr=PropertiesFileLoad.propertiesFile();
		
		HTTPMethods http=new HTTPMethods(pr);
		Response res=http.PostRequest(body, "QA_URI");
		System.out.println("Post Request response Data");
		System.out.println(res.asString());
		
		ResponseStatusCodeValidate.responseStatusCode(res, 201);
		ResponseDataValidation.responseData(res, "Abhi", "firstname");
		
		id=ResponseExtractionUsingJsonPath.responseExtract("id",res);
		firstname=ResponseExtractionUsingJsonPath.responseExtract("firstname", res);
	}

}
