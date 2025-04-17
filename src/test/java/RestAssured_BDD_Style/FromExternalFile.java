package RestAssured_BDD_Style;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class FromExternalFile {

	//Create a Method for CreateUser
		@Test
		public void CreateUser() {

			// File Path declaration
			File jsonfile = new File("Post Data.json"); 
			
			RestAssured.
			given().
			baseUri("https://reqres.in/api/").
			header("Content-Type","application/json").
			
			//Pass the file name to body 
			body(jsonfile). 

			when().
			post("users").
			prettyPrint();

}}
