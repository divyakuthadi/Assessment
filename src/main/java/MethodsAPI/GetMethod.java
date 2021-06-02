package MethodsAPI;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetMethod {
	@Test
	public void GettingResponse() {
		RestAssured.baseURI="http:http://dummy.restapiexample.com";
		RequestSpecification httprequest =RestAssured.given();
		Response response = httprequest.request(Method.GET, "/api/v1/employees");
		String REsponseJson=response.body().asString();
		System.out.println("the fetched Response is: " +REsponseJson);
		
		int statuscode=response.statusCode();
		System.out.println("the status code is: " +statuscode);
		Assert.assertEquals("200 ok", statuscode);

	
	}
	
	//fetching one record
	@Test
	public void GettingOneRecordResponse() {
		RestAssured.baseURI="http:http://dummy.restapiexample.com";
		RequestSpecification httprequest =RestAssured.given();
		Response response = httprequest.request(Method.GET, "/api/v1/employees/6");
		String REsponseJson=response.body().asString();
		System.out.println("the fetched Response is: " +REsponseJson);
		
		int statuscode=response.statusCode();
		System.out.println("the status code is: " +statuscode);
		Assert.assertEquals("404 page not found", statuscode);

	
	}
	
}
