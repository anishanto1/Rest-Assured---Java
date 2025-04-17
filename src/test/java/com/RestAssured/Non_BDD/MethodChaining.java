package com.RestAssured.Non_BDD;

import java.io.PrintStream;

import org.testng.annotations.Test;

public class MethodChaining {

	//Method Chainning for Output Statement

	@Test
	public void outputLine() {

		//System.out.println("Tester");

		PrintStream out =System.out;
		out.println("Tester");
	}

}
