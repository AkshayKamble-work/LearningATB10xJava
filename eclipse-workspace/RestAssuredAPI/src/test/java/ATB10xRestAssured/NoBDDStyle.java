package ATB10xRestAssured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class NoBDDStyle {
	
	 RequestSpecification requestSepec;
	    Response response;
	    ValidatableResponse validatableResponse;

	    @Test
	    public void VerifyRequest() {
	        String pincode = "413512";
	        requestSepec = RestAssured.given();
	        requestSepec.baseUri("https://api.zippopotam.us");
	        requestSepec.basePath("IN/" + pincode);

	        response = requestSepec.when().log().all().get();

	        validatableResponse = response.then().log().all().statusCode(200);

	    }

	    @Test
	    public void VerifyGetRequest() {
	        String pincode = "413512";
	        requestSepec = RestAssured.given();
	        requestSepec.baseUri("https://api.zippopotam.us");
	        requestSepec.basePath("IN/" + pincode);

	        response = requestSepec.when().log().all().get();

	        validatableResponse = response.then().log().all().statusCode(200);

	    }

}
