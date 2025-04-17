package com.RestAssured.Non_BDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateEmployee_Post {

	//Method for CreateEmployee
	
	@Test
	public void CreateEmployee() {

		//Base URI
		RestAssured.baseURI = "https://reqres.in/api/";


		//Request Specification
		//Body

		RequestSpecification requestSpecification = RestAssured.given().contentType("Application/Json").
				body("{\n"
				+ "    \"name\": \"morpheus\",\n"
				+ "    \"job\": \"leader\"\n"
				+ "}");

		//Response 
		Response response =	requestSpecification.request(Method.POST,"users");

		//Print Response as Pretty String
		System.out.println(response.asPrettyString());

		//Print Status line
		System.out.println(response.statusLine());

	}

}
