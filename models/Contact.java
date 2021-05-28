package models;

public class Contact {

	private String name;
	private String firstname;
	private String email;
	private String telephone;
	
	
	public Contact(String name, String firstname, String email, String telephone) {
		this.name = name;
		this.firstname = firstname;
		this.email = email;
		this.telephone = telephone;
	}

	private String showCard() {
		return "Je m'appelle " + this.firstname + " " + this.name + ".";
	}

	public String toString() {
		return showCard();
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	
	
	
	
	
}
