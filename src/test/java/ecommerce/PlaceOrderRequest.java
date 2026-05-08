package ecommerce;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class PlaceOrderRequest extends BaseData {
	
	@Test
	public void placeOrder()
	{
		baseURI = "https://rahulshettyacademy.com";
		
Response resp = given()
		
		.body("{\"orders\": [\r\n"
				+ "        {\r\n"
				+ "        \"country\": \"India\", \r\n"
				+ "        \"productOrderedId\" : \""+prdId+"\"\r\n"
				+ "        }\r\n"
				+ "    ]\r\n"
				+ "}")
		
		.header("Content-Type", "application/json")
		.header("Authorization", tokenValue)
		
		.when()
		
		.post("api/ecom/order/create-order")
		
		.then()
		
		.extract()
		
		.response();

String strResp = resp.asPrettyString();

System.out.println(strResp);
		
		
		
		
		
	}

}
