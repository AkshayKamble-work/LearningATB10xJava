package codeStudio;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class Basic_Authentication_Digest_Authentication {
	/*
 Authentication ensures that only authorized users or systems can access sensitive resources.
	With the rise of automation testing tools,
	incorporating authentication handling into your test cases becomes essential for end-to-end testing.
	
	Authorization prevents unauthorized users from accessing sensitive data or performing restricted actions
	attempting to access administrative data using regular user credentials would result in an unauthorized status
	*/
	@Test
	public void VerifyBasicAuthen()
	{
		RequestSpecification requestsepec=RestAssured.given();
		requestsepec.baseUri("https://postman-echo.com");
		requestsepec.basePath("/basic-auth");
		// non preemptive authentication :-> minimum two request response required to process call
		Response response=requestsepec.auth().basic("postman", "password").get();// 
		System.out.println("Response status line code :--> "+response.statusLine());
		System.out.println("Response body :--> "+response.body().prettyPrint());
		
	}
	
	@Test
	public void VerifyPreemptiveAuthen()
	{
		RequestSpecification requestsepec=RestAssured.given();
		requestsepec.baseUri("https://postman-echo.com");
		requestsepec.basePath("/basic-auth");
		// in preventive we are pass the credential to server before ask.  
		Response response=requestsepec.auth().preemptive().basic("postman", "password").get();// 
		System.out.println("Response status line code :--> "+response.statusLine());
		System.out.println("Response body :--> "+response.body().prettyPrint());
		
	}

	@Test
	public void VerifyDigestAuthen()
	{
		RequestSpecification requestsepec=RestAssured.given();
		requestsepec.baseUri("https://httpbin.org");
		requestsepec.basePath("/digest-auth/undefined/akshay/akshay");
		  
		Response response=requestsepec.auth().digest("akshay", "akshay").get();// 
		System.out.println("Response status line code :--> "+response.statusLine());
		System.out.println("Response body :--> "+response.body().prettyPrint());
	}
}
