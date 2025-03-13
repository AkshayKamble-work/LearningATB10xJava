package codeStudio;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class RestAssuredRequests {
	
	@Test
	public void Requests()
	{
		Response response=RestAssured.get("https://reqres.in/api/users?page=2");
		
		System.out.println("Response Code  :: "+response.getStatusCode());// Status code is getting
		System.out.println("Response Body  ::"+response.getBody().asString());// body will displayed
		System.out.println("Response time  :: "+response.getTime());
		System.out.println("Response Header :: "+response.getHeader("content-type"));
		
		// validation 
		int expectedStatusCode=response.getStatusCode();
		int actualStatusCode=200;
		//AssertJUnit.assertEquals(expectedStatusCode, actualStatusCode,"Test Case failed");
		
		
	}
	@Test
	public void BDDStyleRequest()
	{
		RestAssured.baseURI="https://reqres.in/api/users";
		RestAssured.given().queryParam("page", "2")
		.when().get()
		.then().statusCode(200);
	}

}
