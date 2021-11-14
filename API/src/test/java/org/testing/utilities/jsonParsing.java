package org.testing.utilities;

import com.jayway.restassured.response.Response;

public class jsonParsing 
{
  public static String jsonParsingUsingJsonPath(String jsonPath,Response res)
  {
	 return res.jsonPath().get(jsonPath).toString();
  }
}
