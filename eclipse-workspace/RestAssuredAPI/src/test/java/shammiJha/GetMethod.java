package shammiJha;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class GetMethod {

	@Test
	public void VerifyGetMethod()
	{
		RestAssured. baseURI = "https://reqres.in/";
		RequestSpecification httpRequest = RestAssured.given () ;
		Response resp = httpRequest. request (Method. GET, "");
		System.out.println(resp.getStatusCode());
		System.out.println(resp.getStatusLine());
		System.out.println(resp.prettyPrint()); // Response will generate in pretty format
		ResponseBody body = resp.getBody ();
		System.out.println(body.asString()); // Response will generate in normal string format System.out.println(body.kD);
		
	}
}
