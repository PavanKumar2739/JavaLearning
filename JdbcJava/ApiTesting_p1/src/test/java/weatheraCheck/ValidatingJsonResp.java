package weatheraCheck;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ValidatingJsonResp {
	@Test
	public void test1(){
		RestAssured.baseURI="https://reqres.in/api";
		RequestSpecification httpReq=RestAssured.given();
		Response response = httpReq.request(Method.GET,"/users?page=2");
		
		String data=response.getBody().asString();
		System.out.println(data);
		Assert.assertEquals(data.contains("email"), false);
		
		
	}
}
