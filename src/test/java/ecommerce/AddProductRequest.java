package ecommerce;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class AddProductRequest extends BaseData {
	
	@Test
	public void addProductToSite()
	{
		String imagePath = System.getProperty("user.dir")+"//Formal_trousers.png";
	
		File file = new File(imagePath);
		
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		
		
		
	Response resp = RestAssured.given()
		
		.param("productName", "Trousers")
		.param("productAddedBy", userId)
		.param("productCategory", "Fashion")
		.param("productSubCategory", "Trouser")
		.param("productPrice", "2000")
		.param("productDescription", "formal Trouser")
		.param("productFor", "Women")
		.multiPart("productImage", file)
		
		.header("Authorization", tokenValue)
		
		.when()
		
		.post("api/ecom/product/add-product")
		
		.then()
		
		.extract()
		
		.response();
		
	
	String strResp = resp.asPrettyString();
	
	System.out.println(strResp);
	
	
	JsonPath jp = resp.jsonPath();
	
	 prdId = jp.getString("productId");
	}

}
