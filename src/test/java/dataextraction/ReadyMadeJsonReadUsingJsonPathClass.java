package dataextraction;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class ReadyMadeJsonReadUsingJsonPathClass {
	
	@Test
	public void creationOfUser()
	{
	
		String json = "{\r\n"
				+ "    \"code\": 200,\r\n"
				+ "    \"type\": \"unknown\",\r\n"
				+ "    \"message\": \"9223372036854775807\"\r\n"
				+ "}";
		
		
	
	JsonPath jp = new JsonPath(json);
	
	String messageValue = jp.getString("message");
	
	System.out.println(messageValue);
	
	int codeValue = jp.getInt("code");
	
	System.out.println(codeValue);
	
	
	
		
		
		
		
	}

}
