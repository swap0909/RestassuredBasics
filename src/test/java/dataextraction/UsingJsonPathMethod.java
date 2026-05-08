package dataextraction;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class UsingJsonPathMethod {
	
	@Test
	public void creationOfUser()
	{
		baseURI = "https://petstore.swagger.io/v2";
		
	Response resp = given()
		
		.header("Content-Type", "application/json")
		
		.body("{\r\n"
				+ "  \"id\": 0,\r\n"
				+ "  \"username\": \"evening_user\",\r\n"
				+ "  \"firstName\": \"Kher\",\r\n"
				+ "  \"lastName\": \"johnson\",\r\n"
				+ "  \"email\": \"kher.johnson@gmail.com\",\r\n"
				+ "  \"password\": \"Test@1234\",\r\n"
				+ "  \"phone\": \"9876543210\",\r\n"
				+ "  \"userStatus\": 0\r\n"
				+ "}")
		
		.when()
		
		.post("user")
		
		.then()
		
		.extract()
		
		.response();
	
	
	String strResp = resp.asPrettyString();
	
	System.out.println(strResp);
	
	JsonPath jp = resp.jsonPath();
	
	String messageValue = jp.getString("message");
	
	System.out.println(messageValue);
	
	int codeValue = jp.getInt("code");
	
	System.out.println(codeValue);
	
	
	
		
		
		
		
	}

}
