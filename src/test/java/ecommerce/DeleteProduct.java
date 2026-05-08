package ecommerce;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteProduct extends BaseData {

	
	@Test
	public void deleteProduct()
	{
		baseURI = "https://rahulshettyacademy.com";
		
		Response resp = given()
			
				.header("Authorization", tokenValue	)
				
				.when()
				
				.delete("api/ecom/product/delete-product/"+prdId)
				
				.then()
				
				.extract()
				
				.response();

		String strResp = resp.asPrettyString();

		System.out.println(strResp);
	}
}
