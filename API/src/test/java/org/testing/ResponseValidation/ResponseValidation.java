package org.testing.ResponseValidation;

import org.testing.utilities.jsonParsing;

import com.jayway.restassured.response.Response;

public class ResponseValidation 
{
  public static void statusCodeValidate(int expectedStatusCode,Response res)
  {
	  if(expectedStatusCode==res.getStatusCode())
	  {
		  System.out.println("Status Code is matching "+res.getStatusCode());
	  }
	  else
	  {
		  System.out.println("Status code is not matching ");
	  }
  }
  public static void DataValidate(String expectedData,Response res,String jsonPath)
  {
	  String actualData=jsonParsing.jsonParsingUsingJsonPath(jsonPath, res);
	  
	  if(actualData.equals(expectedData))
	  {
		  System.out.println("actual and expected data is matching");
	  }
	  else
	  {
		  System.out.println("actual and expected data is not matching");
	  }
  }
}
