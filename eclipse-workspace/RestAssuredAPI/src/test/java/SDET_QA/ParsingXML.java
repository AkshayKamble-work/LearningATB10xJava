package SDET_QA;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;
public class ParsingXML {

	@Test
	public void Verify_Parsing()
	{
		//Approach1
		/*given ()
		•when ()
		•get ("http://restapi.adequateshop.com/api/Traveler?page=1")
		.then ().statusCode (200).header ("Content-Type", "application/xml; charset=utf-8")
		•body ("TravelerinformationResponse.page", equalTo ("1" ))
		. body ("TravelerinformationResponse. travelers. Travelerinformation[0]","");
		*/
		
		
	}
}
