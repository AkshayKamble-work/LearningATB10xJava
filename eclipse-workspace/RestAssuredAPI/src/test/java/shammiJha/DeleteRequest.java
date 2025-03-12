package shammiJha;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
public class DeleteRequest {
	@Test
	public void Verify_Delete()
	{
		int id=87;
		RestAssured. baseURI = "https://reqres.in/api/users/2";
		RequestSpecification httpRequest = RestAssured.given ();
		// JSONObject is a class that represents a simple JSON.
		// We can add key value pair using put/post method
		JSONObject requestParams = new JSONObject();
		requestParams.put ("name", "Shamm");
		requestParams. put ("age","34");
		requestParams.put("salary", "3300");
		// Add a header stating the request body is ison
		httpRequest. header ("Content-Type","application/json"); // Add the json to the body of the request
		Response resp = httpRequest.delete("/delete/" + id);
		System.out.println("The status received : " + resp.statusCode());
		System.out.println("The status line received : " + resp.statusLine());
	}

}
