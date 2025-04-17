package RestAssured_BDD_Style;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;

public class CreateUser {

	//Create a Method for CreateUser
	@Test
	public void CreateUser() {

		RestAssured.
		given().
		baseUri("https://reqres.in/api/").
		header("Content-Type","application/json").
		body("{\n"
				+ "    \"name\": \"morpheus\",\n"
				+ "    \"job\": \"leader\"\n"
				+ "}").

		when().
		post("users").
		prettyPrint();

	}
}
