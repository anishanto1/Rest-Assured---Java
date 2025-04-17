package com.RestAssured.Non_BDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseBodyData;
import io.restassured.specification.RequestSpecification;

public class PutEmployee {



	//Create Method for PutEmployee
	@Test
	public void PutEmployee() {
		//Base URI
		RestAssured.baseURI = "https://reqres.in/api/";

		RequestSpecification requestSpecification = RestAssured.given().contentType("Application/Json").body("{\n"
				+ "    \"name\": \"morpheus\",\n"
				+ "    \"job\": \"zion resident\"\n"
				+ "}");
		Response resposne = requestSpecification.request(Method.PUT,"users/2");

		//Print Response as Pretty String
		System.out.println(resposne.asPrettyString());

		//Print Status line
		System.out.println(resposne.statusLine());
	}
}
