package httpsRequests;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Post_Request_Payloads 
{
//Post Request body
	
	@Test
	public void VerifyRequestPayload() {
		// Create JSON Object for Request Body
		JSONObject data = new JSONObject();
		data.put("Name", "Ashwini");
		data.put("Job", "Senior QA");

		// Set Base URI
		RestAssured.baseURI = "https://reqres.in/api/users/662";

		// Perform POST Request and Validate the Response
		RestAssured.given()
		.header("Content-Type", "application/json") // Corrected header case
		.contentType(ContentType.JSON)            // Ensures correct content type
		.body(data.toJSONString())                // Attach the JSON payload
		.when()
		.patch()                            // Added missing endpoint
		.then()
		.statusCode(200)                         // Validate HTTP status code
		.log().all();   // Log the response for debugging
	}
	
}
