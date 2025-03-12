package codeStudio;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class API_KeyAuthentication {
	@Test
	public void Verify_APIKey()
	{
        // Base URL
        RestAssured.baseURI = "https://api.openweathermap.org/data/2.5/weather";

        // Request Specification
        RequestSpecification requestSpec = RestAssured.given();

        // Query Parameters (Corrected API Key Parameter Name)
        requestSpec.queryParam("q", "latur")  // City name
                   .queryParam("appid", "fd30a1fd023342a1899543f19b4d71a5");  // Corrected appid parameter

        // Send GET request
        Response response = requestSpec.when().get();

        // Print Response
        System.out.println("Response Status Code: " + response.getStatusCode());
        System.out.println("Response Body: " + response.getBody().asString());

       

	}

}
