package ATB10xRestAssured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class PostRequest {

	
	RequestSpecification requestSepec;
    Response response;
    ValidatableResponse validatableResponse;

   @Test
    public void VerifyPostRequest()
    {
        System.out.println("---Step 1---");
        String payload = "{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";
        requestSepec = RestAssured.given();
        RestAssured.baseURI = "https://restful-booker.herokuapp.com";
        requestSepec.basePath("/auth");
        requestSepec.contentType(ContentType.JSON);
        requestSepec.body(payload).log().all();
        System.out.println("---Step 2---");
        response = requestSepec.when().log().all().post();
        System.out.println("---Step 3---");

        response.then().log().all().statusCode(200);

}
}
