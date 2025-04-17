package RestAssured_BDD_Style;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GetAllUsers {

	//Create a Method for GetAllUsers
	
	@Test
	public void GetAllUsers() {
		
		//BDD is about Given , When , Then concept 
		
		RestAssured.
		given().
		baseUri("https://reqres.in/api/").
		when().
		get("users?page=2"). //GetRequest
		prettyPrint();


	}
}
