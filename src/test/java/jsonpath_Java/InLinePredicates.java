package jsonpath_Java;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.jayway.jsonpath.JsonPath;

public class InLinePredicates {

	//Json path with condition is called Predicates 
	// When providing predicates at where the jsonpath is there

	//Input JsonFile
	File Jsonfile = new File("src/test/resources/Books.json");

	//create a method for inlinePredicates

	public void InlinePredicates() throws IOException {

		//Inline predicate

		List<Object> result= JsonPath.parse(Jsonfile).read("$.books.[?@.pages<500]");

		System.out.println(result);
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		InLinePredicates predicates = new InLinePredicates();
		predicates.InlinePredicates();



	}

}
