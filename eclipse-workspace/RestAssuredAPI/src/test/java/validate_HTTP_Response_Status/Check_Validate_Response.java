package validate_HTTP_Response_Status;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class Check_Validate_Response
{
	@Test
	public void checkValidateResponse()
	{
		RestAssured.baseURI="https://reqres.in/api/users/2";
	RequestSpecification RequestSepec=RestAssured.given();
	
		Response response = RequestSepec.get();// call Get method
		
		int statusCode = response.getStatusCode();// get Status Response Code
		
		Assert.assertEquals(statusCode, 200,"Correct status Code"); //validate status code
		
		String statuslineCode = response.getStatusLine();
		//RequestSepec.out.println(statuslineCode);
		
		Assert.assertEquals(statuslineCode, "HTTP/1.1 200 OK","Status line code is incorrect");
		
	
	}
	
	
}
