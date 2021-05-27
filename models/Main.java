package models;

public class Main {

	public static void main(String[] args) {
		
		// Point d'entrée de l'application
		
		// 1. Création d'un nouveau contact :
		Contact contact1 = new Contact();
		contact1.name = "Dupond";
		contact1.firstname = "Jean";
		contact1.email = "jd@gmail.com";
		contact1.telephone = "0606060606";
		
		String card1 = contact1.showCard();
		System.out.println(contact1);
		
		Contact contact2 = new Contact();
		contact2.name = "Michel";
		contact2.firstname = "Caroline";
		contact2.email = "michel.c@gmail.com";
		contact2.telephone = "0707060606";
		
		String card2 = contact2.showCard();
		System.out.println(contact2);
	}
}
