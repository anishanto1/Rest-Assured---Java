package jsonpath_Java;

import java.io.File;

import com.jayway.jsonpath.Criteria;
import com.jayway.jsonpath.Filter;

public class Filterpredicates {

	//File location
	File jsonFile = new File("src/test/resources/Books.json");	

	public void FilterAPIpredicates() {

		Filter 	pagesLessthan300 = Filter.filter(Criteria.where("pages").lt(300)) ;
	}



	public static void main(String[] args) {




	}

}
