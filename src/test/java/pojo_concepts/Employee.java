package pojo_concepts;

import java.util.List;

public class Employee {

	//Creating UI Elements name 
	
	private String FisrtName;
	private String LastName;
	private String Email;
	private List Skillset;

	//Applied Getters & setter --> By RightClick + Source + Generate Getter & Setters

	public String getFisrtName() {
		return FisrtName;
	}
	public void setFisrtName(String fisrtName) {
		FisrtName = fisrtName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public List getSkillset() {
		return Skillset;
	}
	public void setSkillset(List skillset) {
		Skillset = skillset;
	}



}


