package org.testing.utilities;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.json.JSONObject;

public class jsonHandling {
	
	public void jsonHandler(String bodyData,String KeyName,String insertValue)
	{
		JSONObject mainobject=new JSONObject(bodyData);
		
		JSONObject options=mainobject.getJSONObject("options");
		List<String> allkey = new ArrayList<String>(options.keySet());
		System.out.println("All keys in this json are"+allkey);
		
		for(String s: allkey)
		{
			if(s.contains(KeyName))
			{
				String key=options.getString(s);
				System.out.println(key.replace(KeyName, insertValue));
			}
		}
	}
	

}
