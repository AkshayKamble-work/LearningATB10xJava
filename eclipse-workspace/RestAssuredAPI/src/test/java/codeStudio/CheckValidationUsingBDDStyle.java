package codeStudio;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class CheckValidationUsingBDDStyle {

	
	@Test
	public void VerifyResponse()
	{
		given()
		.when()
		  .get("https://reqres.in/api/users/2")
		.then()
		.statusCode(200)
		.statusLine("HTTP/1.1 200 OK");
	}

}
