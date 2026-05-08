package ecommerce;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class LoginToApp extends BaseData {
	

	
	@Test
	public void loginToApplication()
	{
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		
Response resp = RestAssured.given()

		.body("{\r\n"
				+ "   \"userEmail\": \"att28marchevening@gmail.com\", \r\n"
				+ "   \"userPassword\": \"Test@1234\"\r\n"
				+ "}")
		.header("Content-Type", "application/json")
		
		.when()
		
		.post("api/ecom/auth/login")
		
		.then()
		
		.extract()
		
		.response();
		
		String strResponse = resp.asPrettyString();
		
		System.out.println(strResponse);
		
		
		JsonPath jp = resp.jsonPath();
		
		
	 tokenValue = jp.getString("token");
	
	 userId = jp.getString("userId");
	
	
		
		
	}

}
