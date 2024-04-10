package api1;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class test1 {
  @Test
  public void f() {
	 
	  Response resp=RestAssured.get("https://reqres.in/api/users?page=2");
	 System.out.println(resp.getStatusCode()); 
	  System.out.println(resp.getTime());
	  System.out.println(resp.toString());
	  System.out.println(resp.getBody().asString());
	  System.out.println(resp.getStatusLine());
	  System.out.println(resp.getHeader("content-type"));
	  int stsCode=resp.getStatusCode();
	  Assert.assertEquals(stsCode, 400);
  }
  public void testM1() {
	  RestAssured.baseURI="https://reqres.in/api/users?page=2";
	RestAssured.given();  
}
}
