package shammiJha;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
public class ValidateResponse {
@Test
	public void ValidateResponse()
	{
	RestAssured. baseURI = "https://demoqa.com/utilities/weather/city";
	RequestSpecification httpRequest = RestAssured.given () ;
	Response resp = httpRequest.get("/pune");
	System.out.println(resp.prettyPrint());


	// Retrieve the body of the response
	ResponseBody body = resp. getBody();
	System.out.println("Response Body : " + body.asString());
	
	// Validate city from response body
	String s = body.asString();
	Assert.assertEquals(s.contains ("pune"), true);
	System.out.println("Pune found in body");
	
	// Validate status code
	System.out.println(resp.statusCode());
	Assert.assertEquals(resp.statusCode(), 200);
	System.out.println("Status Code Verified");
	
	// Validate status line
	System.out.println(resp.statusLine());
	Assert.assertEquals(resp.statusLine(),"HTTP/1.1 200 OK");
	System.out.println("Status Line Verified");
	}
}
