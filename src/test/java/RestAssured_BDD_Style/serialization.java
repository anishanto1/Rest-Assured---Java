package RestAssured_BDD_Style;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class serialization {

	//Creating Method for Serialization
	@Test	
	public void serialization() {

		//Creating Hasnmap for jsonBody
		Map<String, Object> jsonbody = new HashMap<String, Object>();

		//Adding Skills using ArrayList

		List<String> skills = new ArrayList<String>();

		//Adding Skills
		skills.add("Manual");
		skills.add("Automation");

		//Provding Keys & Values to Json Body		
		//Using put method to providng Key & Value
		jsonbody.put("fisrt Name", "Tester");
		jsonbody.put("Last Name", "QA");
		jsonbody.put("Email", "TesterQA@125.com");

		//Adding Skills to jsonbody
		jsonbody.put("skills", skills);

		//Printing Jsonbody

		System.out.println(jsonbody);
		
		//--------------------------------------
		
		//Checking The above Response by sending post Request
		
		RestAssured.given().
		baseUri("https://reqres.in/api/").
		header("content-type","application/json").
		body(jsonbody).
		log().
		all().
		when().
		post("users").
		then().
		log().
		all();
		
	

	}
}
