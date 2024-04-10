package weatheraCheck;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class validatingJsonData {
	@Test
	public void test1(){
		RestAssured.baseURI="https://reqres.in/api/users";
		RequestSpecification httpReq=RestAssured.given();
		Response response = httpReq.request(Method.GET,"/2");
		
		String data=response.getBody().asString();
		//System.out.println(data);
		 //it will stores to help nodes to be stored and by that we call key value
		JsonPath jp=response.jsonPath();
		System.out.println(jp);
		
		System.out.println(jp.get("support"));
		System.out.println(jp.get("data"));
		 
	}

}
