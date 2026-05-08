package dataextraction;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class UsingJsonPathMethod2 {
	
	
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
	
	JsonPath jp = resp.jsonPath();
	
	int pageValue = jp.getInt("page");
	
	System.out.println(pageValue);//2
		
	int totalPagesValue = jp.getInt("total_pages");
	
	System.out.println(totalPagesValue);//2
	
	
	
String textValue = jp.getString("support.text");

System.out.println(textValue);
	

String urlValue = jp.getString("_meta.cta.url");

System.out.println(urlValue);

String emailValue = jp.getString("data[1].email");

System.out.println(emailValue);

int sizeOfArray = jp.getInt("data.size()");

System.out.println("Size of Array is :"+ sizeOfArray);





		
	}

}
