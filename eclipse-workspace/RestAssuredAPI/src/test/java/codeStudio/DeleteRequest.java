package codeStudio;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class DeleteRequest {

	@Test
	public void VerifyDelete()
	{
		RestAssured.baseURI="https://reqres.in/api/users/2";
		RestAssured.given()
		.when()
		
		.delete()
		   .then()
		.statusCode(204)
		.log().all();
	}
}
