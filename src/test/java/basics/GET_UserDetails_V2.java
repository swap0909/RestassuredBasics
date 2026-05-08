package basics;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GET_UserDetails_V2 {

	
	@Test
	public void getUserInfo()
	{
		RestAssured.baseURI = "https://reqres.in";
		
Response resp = RestAssured.given()
		
		.header("x-api-key","free_user_3D83pgYmETQsWxY83GQschxkTJL")
		
		.when()
		
		.get("/api/users/1")
		
		.then()
		
		.extract()
		
		.response();
		
		String strResponse = resp.asPrettyString();
		
		System.out.println(strResponse);
		
		
	}
	
	
	@Test
	public void getUserInfo2()
	{
		RestAssured.baseURI = "https://reqres.in";
		
Response resp = RestAssured.given()
		
		.when()
		
		.get("/api/users")
		
		.then()
		
		.extract()
		
		.response();
		
		String strResponse = resp.asPrettyString();
		
		System.out.println(strResponse);
		
		
	}
}
