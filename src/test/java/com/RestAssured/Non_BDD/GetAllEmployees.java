package com.RestAssured.Non_BDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetAllEmployees {
	
	//Create Method for GetAllEmployees
	
	@Test
	public void GetAllEmployess() {

		//Define Base URL
		RestAssured.baseURI = "https://reqres.in/api/" ;

		//Request Specification		
		RequestSpecification requestSpecification= RestAssured.given();

		//Response
		Response response = requestSpecification.request(Method.GET,"users?page=2");

		//Printing as PrettyString
		System.out.println(response.asPrettyString());
        
		//Printing Status Line
		System.out.println(response.getStatusLine());



	}
}
