package httpsRequests;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import org.testng.annotations.Test;
public class HTTPS_Requests 

{
	int id;
	@Test	
	public void getUsers()

	{
		given()

		.when()

		.get("https://reqres.in/api/users?page=2")


		.then()
		.statusCode(200)
		.body("page",equalTo(2))
		.log().all();// its used to print all the data using log().all


	}
	@Test
	public void createUser()
	{

		HashMap data=new HashMap();
		data.put("name","Akshay");
		data.put("job", "QA");
		data.put("Company", "Accenture");

		id=given()
		.contentType("application/json")
		.body(data)

		.when()
		.post("https://reqres.in/api/users")
		.jsonPath().getInt("id");

	}
	
	@Test(dependsOnMethods = "createUser")
	public void updateUser()
	{
		HashMap data=new HashMap();
		data.put("name","Akshay");
		data.put("job", "QA");
		data.put("Company", "Capgemini");

		given()
		.contentType("application/json")
		.body(data)
		
		.when()
		.put("https://reqres.in/api/users/"+id)
		
		.then()
		.statusCode(200)
		.log().all();
	}
	@Test(dependsOnMethods = "updateUser")
	public void deleteUser()
	{
		given()
		
		
		.when()
		.delete("https://reqres.in/api/users/"+id)
		
		.then()
		.statusCode(204)
		.log().all();
		
		
	}


}
