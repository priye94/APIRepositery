package org.testing.Runner;



import java.io.IOException;

import org.testing.TestScripts.DeleteRequest;
import org.testing.TestScripts.GetRequestTC;
import org.testing.TestScripts.GetRequestWithQueryParameters;
import org.testing.TestScripts.PostRequestTC;
import org.testing.TestScripts.PostRequestThankfulReplacement;
import org.testing.TestScripts.PutRequest;
import org.testing.TestScripts.ReadNUpdateJsonFile;

public class RunnerClass {
	
	public static void main(String[] args) throws IOException {
		
//		PostRequestTC post=new PostRequestTC();
//		post.TC1();
		
		/*
		 * GetRequestTC get=new GetRequestTC(); get.TC2();
		 * 
		 * GetRequestWithQueryParameters query=new GetRequestWithQueryParameters();
		 * query.TC3();
		 */
		
		/*
		 * PutRequest put=new PutRequest(); put.TC4();
		 */
		
		/*DeleteRequest delete=new DeleteRequest();
		delete.TC5();*/
		
		/*ReadNUpdateJsonFile rnu=new ReadNUpdateJsonFile();
		rnu.TC6();*/
		
		PostRequestThankfulReplacement replacement=new PostRequestThankfulReplacement();
		replacement.TC1();
		
		
	}

}
