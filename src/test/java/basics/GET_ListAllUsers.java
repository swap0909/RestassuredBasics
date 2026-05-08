package basics;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class GET_ListAllUsers {
	
	@Test
	public void getAllUserDetails()
	{
		
		baseURI = "https://reqres.in";
		
		
	Response resp = given()
		
		.header("x-api-key", "free_user_3D83pgYmETQsWxY83GQschxkTJL")
		
		.when()
		
		.get("api/users?page=2")
		
		.then()
		
		.extract()
		
		.response();
	
	String strResponse = resp.asPrettyString();
	
	System.out.println(strResponse);
		
		
	}

}
