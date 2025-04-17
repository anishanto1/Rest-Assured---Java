package json_Schema_Validation;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;

public class Schema_Validation {

	@Test
	public void Schema_Validation() {


		File inputjson = new File("src/test/resources/input.json");
		//File Schemajson = new File("src/test/resources/schema.json");

		RestAssured.
		given().
		baseUri("https://reqres.in/api/").
		header("Content-Type","application/json").
		body(inputjson).
		when().
		post("users").
		then().
		body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schema.json"));		

	}
}
