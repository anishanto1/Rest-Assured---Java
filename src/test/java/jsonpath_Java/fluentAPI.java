package jsonpath_Java;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;

public class fluentAPI {

	public static void fluentAPI() throws IOException
	{
		//File location
		File jsonFile = new File("src/test/resources/Books.json");

		//Add Jway Json path'
		//Parse  directly & provide file location
		// Type is DocumentContext
		DocumentContext  context =	JsonPath.parse(jsonFile);

		List<Object> categoryList =	context.read("$..books");

		for (Object Category : categoryList) {
			System.out.println(Category);
		}

		//An another way
		//Configuration.defaultConfiguration()	
		Configuration config = Configuration.defaultConfiguration();

		//Jway Json path 
		//using config
		//parse the input jsosn
		//read the file element
		List<Object> list =	JsonPath.using(config).parse(jsonFile).read("$..author");

		System.out.println(list);

	}


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		fluentAPI();


	}

}
