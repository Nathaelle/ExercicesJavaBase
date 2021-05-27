package models;

public class Contact {

	String name;
	String firstname;
	String email;
	String telephone;
	
	String showCard() {
		return "Je m'appelle " + this.firstname + ".";
	}

	public String toString() {
		return "Contact [\n\tname = " + name + ", \n\tfirstname = " + firstname + ", \n\temail = " + email + ", \n\ttelephone = " + telephone
				+ "\n]";
	}
	
	
	
	
	
	
}
