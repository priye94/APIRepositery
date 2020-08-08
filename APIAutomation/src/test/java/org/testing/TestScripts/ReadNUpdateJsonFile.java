package org.testing.TestScripts;

import java.io.FileNotFoundException;

import org.json.JSONObject;
import org.testing.utilities.JsonFileRead;
import org.testing.utilities.jsonHandling;
import org.testng.annotations.Test;

public class ReadNUpdateJsonFile {
	
	@Test
	public void TC6() throws FileNotFoundException
	{
	    JSONObject data=new JSONObject();
	    data.put("3", "Ranjan");
	    
	    String body=JsonFileRead.bodyDataRead("../APIAutomation/src/test/java/org/testing/PayloadData/dummyData.json");
	    System.out.println("Data in json file is ");
	    System.out.println(body.toString());
	    
	    jsonHandling js=new jsonHandling();
	    js.jsonHandler(body, "options", data.toString());
	
	
	}

}
