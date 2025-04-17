package jsonpath_Java;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;

import io.restassured.config.Config;

public class ReadMultipleTimes {


	public static void ReadAjsoN() throws IOException {

		//Specify Input File location & save it into an Object by InputStream
		InputStream file = new FileInputStream("src/test/resources/Books.json");

		//Configuration class - Jway Json path
		//Select Default Configuration
		//JsonProvider

		Object ParsedJson =  Configuration.defaultConfiguration().jsonProvider().parse(file.readAllBytes());

		List<Object> categoryList = 	JsonPath.read(file, "$..title");
		
		for (Object GetcategoryList : categoryList) {
			System.out.println(GetcategoryList);

		}
	}

	public static void main(String[] args) throws IOException {

		ReadAjsoN();
	}
}
