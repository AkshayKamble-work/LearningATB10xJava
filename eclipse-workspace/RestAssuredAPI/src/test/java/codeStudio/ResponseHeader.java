package codeStudio;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ResponseHeader {
	@Test
	public void VerifyHeader()
	{
		// get Request Specification
		RequestSpecification requestSpeci=RestAssured.given();

		// Specific path
		requestSpeci.baseUri("https://reqres.in");
		requestSpeci.basePath("/api/users/2");

		Response response =requestSpeci.get();// create get header request

		//validate response header
		String headerContains =response.header("Content-Type");
		System.out.println("Content-Type:: "+headerContains);


		String connection =response.getHeader("connection"); // second way
		System.out.println("connection-Type:: "+connection);

		Headers HeaderLists = response.getHeaders(); // 3rd way

		for (Header header : HeaderLists) 
		{
			System.out.println("Header Name::"+header.getName()+"Header Value "+header.getValue());
		}


	}

}
