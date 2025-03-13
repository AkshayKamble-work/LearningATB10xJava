package codeStudio;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class BearerTokenTest 
{

	@SuppressWarnings("unchecked")
	@Test
	public void verifyBearerToken() {
		// Base URL
		RestAssured.baseURI = "https://gorest.co.in/public/v2/users";

		// Authentication Token
		String authToken = "Bearer 4b5d31d54cca06d7106cf541e479ee53d7b09c669552b0da0354bb697d847ae4";

		// Create JSON Payload
		org.json.simple.JSONObject payload = new JSONObject();
		payload.put("name", "Prachi Kamble");
		payload.put("gender", "female");  // Use "male" or "female"
		payload.put("email", "prachikamble123@test.com");  // Email is required
		payload.put("status", "active");  // Required field in GoRest API

		// Request Specification
		RequestSpecification requestSpec = RestAssured.given();
		requestSpec
		.header("Authorization", authToken)
		.contentType(ContentType.JSON)
		.body(payload.toString());

		// Send POST request
		Response response = requestSpec.post();

		// Print Response
		System.out.println("Response Status Code: " + response.getStatusCode());
		System.out.println("Response Body: " + response.getBody().asString());

		// Assertion Example (if using TestNG)
		assert response.getStatusCode() == 201 : "User creation failed!";
	}
}


