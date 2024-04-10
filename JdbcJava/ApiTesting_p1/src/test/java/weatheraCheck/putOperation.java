package weatheraCheck;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFShape;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;import org.apache.xmlbeans.impl.schema.SchemaTypeSystemCompiler;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class putOperation {
	 int count=1;
	@Test(dataProvider = "data3",dataProviderClass = forDp.class)
	public void test1(String f1,String s1,String email,int age) throws Exception {
		//specify base url
		FileInputStream file =new FileInputStream("D:\\selenium\\excel\\data.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(file);
		XSSFSheet ws=wb.getSheet("Sheet1");
		
		RestAssured.baseURI="https://reqres.in/api";
		RequestSpecification httpRequest = RestAssured.given();
		JSONObject requestPara=new JSONObject();
		
		requestPara.put("first_name", f1);
		requestPara.put("last_name", s1);
		requestPara.put("email", email);
		requestPara.put("email", age);
	
		//add json to the body of the request
		httpRequest.header("Content-Type","application/json");
		//add header to stating the request is json 
		httpRequest.body(requestPara.toJSONString());
		
		//post request
		Response response = httpRequest.request(Method.POST,"/users");
		//capture the response body to perform validation
		String responceBody=response.getBody().asString();
		
		System.out.println(responceBody);
//		Assert.assertEquals(responceBody.contains("pavan"), true);
//		Assert.assertEquals(responceBody.contains("kumar"), true);

		
		int stsCode=response.statusCode();
		ws.getRow(count).createCell(4).setCellValue(stsCode);
		FileOutputStream fOut=new FileOutputStream("D:\\selenium\\excel\\data.xlsx");
		wb.write(fOut);
		wb.close();
		count++;
		Assert.assertEquals(stsCode, 201);
		Response response1=httpRequest.request(Method.GET,"/users");
		System.out.println(response1.asString());
		
		}
	
}
