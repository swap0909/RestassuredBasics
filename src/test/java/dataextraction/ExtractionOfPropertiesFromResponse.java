package dataextraction;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

import io.restassured.http.Headers;
import io.restassured.response.Response;

public class ExtractionOfPropertiesFromResponse {
	
	@Test
	public void getUserInfo()
	{
		baseURI = "https://reqres.in";
		
Response resp = given()
		
		.header("x-api-key","free_user_3D83pgYmETQsWxY83GQschxkTJL")
		
		.when()
		
		.get("/api/users/1")
		
		.then()
		
		.extract()
		
		.response();
		
		String strResponse = resp.asPrettyString();// body
		
		System.out.println(strResponse);
		
		int stsCode = resp.statusCode();// to get the status code
		
		System.out.println(stsCode);
		
		String stsLine = resp.statusLine();// to get the status line- message along with status code
		
		System.out.println(stsLine);
		
		long responseTime = resp.getTime();
		
		
		System.out.println(responseTime);
		
		
		long responseTimeInSec = resp.timeIn(TimeUnit.SECONDS);
		
		System.out.println(responseTimeInSec);
		
		Headers allResponseHeader = resp.headers();
		
		System.out.println(allResponseHeader);
		
		String dateHeaderValue = resp.getHeader("Date");
		
		System.out.println(dateHeaderValue);
		
		
	}


}
