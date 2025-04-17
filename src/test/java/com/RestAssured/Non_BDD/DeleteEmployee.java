package com.RestAssured.Non_BDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DeleteEmployee {

	//Create Method for DeleteEmployee

	@Test
	public void DeleteEmployee() {

		//URI Path 		
		RestAssured.baseURI = "https://reqres.in/api/";

		//Request specification		
		RequestSpecification request = RestAssured.given();

		//Print Status line
		Response response = request.request(Method.DELETE,"users/2");

		//Print Response as Pretty String
		System.out.println(response.asPrettyString());

		//Print Status line
		System.out.println(response.statusLine());

	}
}
