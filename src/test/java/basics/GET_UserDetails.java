package basics;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GET_UserDetails {
	
	@Test
	public void getUserInfo()
	{
		RestAssured.baseURI = "https://reqres.in";
		
		RequestSpecification req = RestAssured.given();
		
		RequestSpecification reqs = req.header("x-api-key","free_user_3D83pgYmETQsWxY83GQschxkTJL");
		
		RequestSpecification reqq = reqs.when();
		
		Response resp = reqq.get("/api/users/1");
		
		String strResponse = resp.asPrettyString();
		
		System.out.println(strResponse);
		
		
	}
	
	
	

}
