package SDET_QA;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class HeaderHandling {
	
	
@Test
	public void Verify_Headers()
	{
		//RestAssured.baseURI="https://rahulshettyacademy.com/maps/api/place/add/json?key=qaclick123";
		given()
		.when().get("https://reqres.in//api/users?page=2")
		.then().header("content-Type", "text/html; charset=utf-8")
		.header("Server", "cloudflare").header("Connection", "keep-alive").log().all();
		
	}
}
