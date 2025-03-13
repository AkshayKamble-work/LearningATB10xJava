package shammiJha;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PutPostMethod {

	
	@Test
	public void Verify_Post()
	{
		RestAssured. baseURI = "https://reqres.in/";
		RequestSpecification httpRequest = RestAssured.given ();
		// JSONObject is a class that represents a simple JSON.
		// We can add key value pair using put/post method
		JSONObject requestParams = new JSONObject() ;
		requestParams. put ("userId", "Akshay");
		requestParams.put("profile", "java Devloper");
		requestParams.put("salary", "100k");
		requestParams.put("Company", "Capgemini");
		
		
		// Add a header stating the request body is ison httpRequest. header ("Content-Type", "application/json"); // Add the ison to the body of the request
		httpRequest.body(requestParams.toString()); // Post the request and check the response
		Response resp = httpRequest.post("/api/users");
		System.out.println("The status received : " + resp.statusCode());
		System.out.println("The status line code : "+resp.statusLine());
		System.out.println("The Response body : "+resp.getBody().asPrettyString());
	}
}
