package models;

public class Main {

	public static void main(String[] args) {
		
		// Point d'entrée de l'application
		
		// 1. Création d'un nouveau contact :
		Contact contact1 = new Contact("Dupond", "Jean", "jd@gmail.com", "0606060606");
		Contact contact2 = new Contact("Michel", "Caroline", "michel.c@gmail.com", "0707060606");
		
		Contact contact3 = contact1;
		
//		System.out.println(contact1.toString());
		System.out.println(contact1);
//		System.out.println(contact2.toString());
		System.out.println(contact2);
		
		Rational nb1 = new Rational(1, 3);
		System.out.println(nb1);
		
		nb1.setDenominator(0);
		System.out.println(nb1);
	}
}
