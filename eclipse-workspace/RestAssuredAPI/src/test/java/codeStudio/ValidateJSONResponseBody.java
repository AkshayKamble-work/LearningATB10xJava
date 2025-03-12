package codeStudio;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
public class ValidateJSONResponseBody {
	
	@Test(enabled = true)
public void VerifyResponseBody()
{
	
		RequestSpecification requestSpec=RestAssured.given();
		
		// specifies baseURI and Base path
		requestSpec.baseUri("https://reqres.in/");
		requestSpec.basePath("/api/users?page=2");
		
		//read response body
		Response response=requestSpec.get();
		ResponseBody responseBody = response.getBody();
		
		// print body response
		System.out.println("Response body:: "+responseBody.prettyPrint());
		String body=responseBody.asString();
		
		// checking element is present in body or not
		Assert.assertEquals(body.contains("George"),true,"Checking the George element is prasent");
}
	@Test
	public void VerifyJsonpath()
	{
RequestSpecification requestSpec=RestAssured.given();
		
		// specifies baseURI and Base path
		requestSpec.baseUri("https://reqres.in/");
		requestSpec.basePath("/api/users?page=2");
		
		//read response body
		Response response=requestSpec.get();
		ResponseBody responseBody = response.getBody();
		//System.out.println(responseBody.asPrettyString());
		JsonPath jsonpathView=responseBody.jsonPath();
		
		String firstName = jsonpathView.get("data[5].first_name");
		System.out.println("First Name :: "+firstName);
		Assert.assertEquals(firstName, "Tracey","Checking first Name as Tracey");
		
	}
}
