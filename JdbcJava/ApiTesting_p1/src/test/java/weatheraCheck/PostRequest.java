package weatheraCheck;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class PostRequest {
	@Test
	public void test1() {
		//specify base url
		RestAssured.baseURI="https://reqres.in/api";
		RequestSpecification httpRequest = RestAssured.given();
		
		JSONObject requestPara=new JSONObject();
		requestPara.put("id","10");
		requestPara.put("first_name", "pavan");
		requestPara.put("last_name", "kumar");
		requestPara.put("email", "pavan@gmail.com");
		
		httpRequest.header("Content-Type","application/json");
		httpRequest.body(requestPara.toJSONString());//attached above data to the request
		
		//response obj 
		Response response = httpRequest.request(Method.POST,"d");
		
		//print response 
		System.out.println(response.getBody().asString());
		
		int StatusCode=response.getStatusCode();
		System.out.println(StatusCode);
		Assert.assertEquals(StatusCode, 201);
		
		
		String successCode=response.jsonPath().get("SuccessCode");
		
		System.out.println("success code : "+successCode);
		
		
	}
}
