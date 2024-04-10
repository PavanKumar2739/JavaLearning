package weatheraCheck;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class weatherApi {
	@Test
	public void test1() {
		//specify base uri
		RestAssured.baseURI="https://reqres.in/api";
		
		//request Object
		RequestSpecification httpRequest=RestAssured.given();
		//response object
		Response response = httpRequest.request(Method.GET,"/users?page=2");
		//print the responce in console
		String responseBody=response.getBody().asString();
		System.out.println(responseBody);
		
		//status code
		int stsCode=response.statusCode();
		System.out.println("status code : "+stsCode);
		//verify status code
		Assert.assertEquals(stsCode, 200);
		
		//status line verification 
		String stsLine=response.statusLine();
		System.out.println("Status line : "+stsLine );
		Assert.assertEquals(stsLine, "HTTP/1.1 200 OK");
		
		String content=response.getContentType();
		System.out.println("content type : "+content);
		
		String Id=response.getSessionId();
		System.out.println("session id : "+Id);
		

	}
}
