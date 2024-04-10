package weatheraCheck;

import java.util.Iterator;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetCode2 {
	@Test
	public void test1(){
		RestAssured.baseURI="https://reqres.in/api";
		RequestSpecification httpReq=RestAssured.given();
		Response response = httpReq.request(Method.GET,"/users?page=2");
		
		Headers hed=response.getHeaders();
		for(Header i:hed) {
			System.out.println(i.getName()+"  "+i.getValue());
		}
		
	}

}
