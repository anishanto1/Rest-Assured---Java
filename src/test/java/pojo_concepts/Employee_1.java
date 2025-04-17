package pojo_concepts;

import java.util.Arrays;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer;

public class Employee_1 {

	public static void main(String[] args) throws JsonProcessingException {

		//Assigning  values to employee_1(child class) from Employee (Parent Class)
		Employee employee_1 = new Employee();

		//Setting values for UI Elements
		//The mentioned below values are only the User going to provide from the UI
		employee_1.setFisrtName("Tester");
		employee_1.setLastName("QA");
		employee_1.setEmail("Email");

		//Providing skill set values on UI
		//Skillset is an Array

		employee_1.setSkillset(Arrays.asList("java","selenium"));

		//Print the employee_1 values 

		System.out.println(employee_1.getFisrtName());
		System.out.println(employee_1.getLastName());
		System.out.println(employee_1.getEmail());
		System.out.println(employee_1.getSkillset());


		//Serializing the json response
		//Object Mapper from Jackson binding

		ObjectMapper mapper = new ObjectMapper();

		//writerWithDefaultPrettyPrinter
		//writeValueAsString --> Passing employee_1's value
		String jsonemployee = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(employee_1);

		//print the values

		System.out.println(jsonemployee);

	}

}
