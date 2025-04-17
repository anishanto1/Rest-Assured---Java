package jsonpath_Java;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.jayway.jsonpath.JsonPath;

public class ReadingAJsonDoc {

	
	//Read a Json  file 
	public static void ReadAJosn() throws IOException {
	
		//Input file name
		File jsonfile = new File("src/test/resources/Books.json");
		
		//Configure Jway jsonpath class to read the jsonfile
	List<Object> TitleList = 	JsonPath.read(jsonfile, "$..title");
	
	for (Object Titles : TitleList) {
		
		System.out.println(Titles);
	}
	
	}
	
	public static void main(String[] args) throws IOException {
		//Call by function
		ReadAJosn();
	}
}
