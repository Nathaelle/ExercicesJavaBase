package contacts;

public class Contact {
	
	private String name;
	private String firstName;
	private String email;
	private String phone;

	public Contact() {
		
	}
	
	public Contact(String name, String firstName, String phone) {
		super();
		this.name = name;
		this.firstName = firstName;
		this.phone = phone;
	}
	
	public Contact(String name, String firstName, String email, String phone) throws ErrorException {
		super();
		setName(name);
		setFirstName(firstName);
		setEmail(email);
		setPhone(phone);
	}

	@Override
	public String toString() {
		return "Contact [name=" + name + ", firstName=" + firstName + ", email=" + email + ", phone=" + phone + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) throws ErrorException {
		//if(name.matches("^[a-zA-Z-àâäéèêëïîôöùûüçñÀÂÄÉÈËÏÔÖÙÛÜŸÇÑæœÆŒ'( )]{1,50}$"))
		if(name.matches("^[\\p{javaLowerCase}\\p{javaUpperCase}\'\\s]+$")) {
			this.name = name;
		} else {
			throw new ErrorException("Votre nom ne correspond pas aux règles");
		}
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) throws ErrorException {
		//if(name.matches("^[a-zA-Z-àâäéèêëïîôöùûüçñÀÂÄÉÈËÏÔÖÙÛÜŸÇÑæœÆŒ( )]{1,50}$"))
		if(firstName.matches("^[\\p{javaLowerCase}\\p{javaUpperCase}\\s]+$")) {
			this.firstName = firstName;
		} else {
			throw new ErrorException("Votre prénom ne correspond pas aux règles");
		}
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) throws ErrorException {
		if(email.matches("^[a-zA-Z0-9-_\\.]+@[a-zA-Z-]+\\.[a-zA-Z0-9]{2,}$")) {
			this.email = email;
		} else {
			throw new ErrorException("Votre adresse email bla bla...");
		}
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) throws ErrorException {
		if(phone.matches("(0|\\+*[\\d]{0,3})[1-9]( *[0-9]{2}){4}")) {
			this.phone = phone;
		} else {
			throw new ErrorException("Votre numéro de téléphone bla bla...");
		}
	}


}
