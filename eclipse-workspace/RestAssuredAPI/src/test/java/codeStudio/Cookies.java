package codeStudio;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.Map;
public class Cookies {

	@Test(enabled = false)
	public void VerifyCoockie()
	
	{
		given()
		
		
		.when()
		.get("https://google.com")
		
		.then()
		.cookie("AEC")
		.statusCode(200).
		log().all();
		
	}
	
	@Test
	public void GetCoockies()
	{
		Response response = given()
		.get("https://google.com");
		Map<String, String> CoockieValue = response.getCookies();
		
		for(String cookies:CoockieValue.keySet())
		{
			String allcookies=response.getCookie(cookies);
			System.out.println(cookies+"  "+allcookies);
		}
	}
}
