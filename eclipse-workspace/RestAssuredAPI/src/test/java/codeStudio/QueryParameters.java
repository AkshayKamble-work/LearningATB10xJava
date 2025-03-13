package codeStudio;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
public class QueryParameters {
	@Test
	public void VerifyFilterData()
	{
		
		RequestSpecification requestSpecific=RestAssured.given();
		requestSpecific.baseUri("https://reqres.in/");
		requestSpecific.basePath("api/users");
		requestSpecific.queryParams("page", 2).queryParam("id", 10);
		
		
		// perform get operation
		
		Response response=requestSpecific.get();
		String body=response.getBody().prettyPrint();
		System.out.println();
		System.out.println("Response Body ::-> "+body);
		
		JsonPath jsonpathView=response.jsonPath();
		String firstName=jsonpathView.get("data.first_name");
		Assert.assertEquals(firstName, "Byron","Checking Element in body as Byron");
	}

}
