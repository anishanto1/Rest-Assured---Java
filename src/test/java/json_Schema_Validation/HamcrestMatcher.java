package json_Schema_Validation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.hamcrest.MatcherAssert;
import org.testng.annotations.Test;

import io.restassured.module.jsv.JsonSchemaValidator;

public class HamcrestMatcher {

	@Test
	public void HamcrestMatcher() throws IOException {

		//Files Paths to select
		File InputJson = new File("src/test/resources/input.json");

		//Convert InputJson file into String for to make it to acceptable by MatcherAssert	
		//FileUtils by Apache commons-io
		String Jsoncontent =FileUtils.readFileToString(InputJson);


		File inputschema = new File("src/test/resources/schema.json");



		//MatcherAssert class 
		//Assert
		MatcherAssert.assertThat(Jsoncontent, JsonSchemaValidator.matchesJsonSchema(inputschema));

	}
}
