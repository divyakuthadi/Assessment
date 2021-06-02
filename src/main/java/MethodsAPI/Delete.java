package MethodsAPI;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Delete {
	@Test
	public void DeletingResponse() {
		RestAssured.baseURI="http://dummy.restapiexample.com";
		RequestSpecification httprequest =RestAssured.given();
		Response response = httprequest.request(Method.DELETE, "/api/v1/delete/2");
		String REsponseJson=response.body().asString();
		System.out.println("the fetched Response is: " +REsponseJson);
		
	//when i try to run the script in postman, it showing the error "{"message":"Error Occured! Page Not found, contact rstapi2example@gmail.com"}".	

	
	}
}
