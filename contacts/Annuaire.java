package contacts;

import java.util.ArrayList;

public class Annuaire {
	
	private ArrayList<Contact> contacts;

	public Annuaire() {
		this.contacts = new ArrayList<>();
	}
	
	public void addContact(Contact contact) {
		
		contacts.add(contact);
	}

	
}
