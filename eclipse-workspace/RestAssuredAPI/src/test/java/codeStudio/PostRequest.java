package codeStudio;




import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;

@Test
public class PostRequest {



	@Test
	public void VerifyPost() {
		// Create JSON Object for Request Body
		JSONObject data = new JSONObject();
		data.put("Name", "Akshay");
		data.put("Job", "QA");

		// Set Base URI
		RestAssured.baseURI = "https://reqres.in/api/";

		// Perform POST Request and Validate the Response
		RestAssured.given()
		.header("Content-Type", "application/json") // Corrected header case
		.contentType(ContentType.JSON)            // Ensures correct content type
		.body(data.toJSONString())                // Attach the JSON payload
		.when()
		.post("user")                            // Added missing endpoint
		.then()
		.statusCode(201)                         // Validate HTTP status code
		.log().all();   // Log the response for debugging
	}


}
