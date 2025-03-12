package validate_HTTP_Response_Status;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class CheckValidationUsingBDDStyle {
	
	@Test
	public void VerifyResponse()
	{
		given()
		.when()
		  .get("https://reqres.in/api/users/2")
		.then()
		.statusCode(200)
		.statusLine("HTTP/1.1 200 OK");
	}

}
