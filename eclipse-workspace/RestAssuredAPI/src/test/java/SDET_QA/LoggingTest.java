package SDET_QA;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;
public class LoggingTest {

	@Test
	public void Verify_Loggings()
	{
		given()
		
		.when().get("https://reqres.in//api/users?page=2")

	.then().log().all();
	}
}
