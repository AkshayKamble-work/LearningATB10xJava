package ATB10xRestAssured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class Patch {

	
	@Test
	public void VerifyPatch()
	{
	    String token = "1bbd1e9ad6f5221";
	    String bookingid = "6051";

	    String payloadPatch = "{\n" +
	            "    \"firstname\" : \"Pramod\",\n" +
	            "    \"lastname\" : \"bhaidada\"\n" +
	            "}";


	    RequestSpecification requestSpecification = RestAssured.given();
	    requestSpecification.baseUri("https://restful-booker.herokuapp.com/");
	    requestSpecification.basePath("/booking/" + bookingid);
	    requestSpecification.contentType(ContentType.JSON);
	    requestSpecification.cookie("token", token);

	    requestSpecification.body(payloadPatch).log().all();

	    Response response = requestSpecification.when().patch();

	    ValidatableResponse validatableResponse = response.then().log().all();

	    validatableResponse.statusCode(200);
	}
}
