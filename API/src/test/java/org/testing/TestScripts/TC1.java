package org.testing.TestScripts;

import static com.jayway.restassured.RestAssured.*;

import org.testing.ResponseValidation.ResponseValidation;
import org.testing.utilities.jsonParsing;
import org.testng.annotations.Test;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class TC1
{
 @Test	
 public void testCase1()
 {
   Response res=
	 given()
	 .contentType(ContentType.JSON)
	 .when()
	 .post("  ");
   
  String type=jsonParsing.jsonParsingUsingJsonPath("phoneNumbers[0].type", res);
   ResponseValidation.statusCodeValidate(201, res);
   
   ResponseValidation.DataValidate("Rahul", res,"firstname");
   
 }
}
