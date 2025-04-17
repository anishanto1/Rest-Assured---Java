package json_Schema_Validation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;

import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.networknt.schema.JsonSchema;
import com.networknt.schema.JsonSchemaFactory;
import com.networknt.schema.SpecVersion.VersionFlag;
import com.networknt.schema.ValidationMessage;

public class netWorkNTSchemaValidator {

	@Test
	public void validateJsonSchema() throws IOException {

		//Create Object for object Mapper class (Hover & confirm)
		ObjectMapper mapper = new ObjectMapper();

		//JsonSchemaFactory from networkNT
		//get instance 
		//Provide version flag & set the version
		JsonSchemaFactory factory =	JsonSchemaFactory.getInstance(VersionFlag.V7);

		//Provide Input json File to read

		File InputJson = new File("src/test/resources/input.json");

		//Mapper object
		//ReadTree for reading inputjson file  

		//Provide inputschema File to read
		InputStream inputschema = new FileInputStream("src/test/resources/schema.json");

		
		JsonNode jsonnode =	 mapper.readTree(InputJson); //File Type is JsonNode
		JsonSchema schema = factory.getSchema(jsonnode);
		Set< ValidationMessage> result =	schema.validate(jsonnode);
		
		if (result.isEmpty()) {
			System.out.println("No Validation Errors");
		}
		else {
			for (ValidationMessage Message : result) {
				System.out.println(Message);
			}
		}
	}


}
