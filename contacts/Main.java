package contacts;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Je crée un objet type Scanner (qui va lire l'entrée console)
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entrez un nombre");
		int test = scan.nextInt();
		
		// J'utilise les méthodes de mon Scanner pour lire les données
		// scan.nextLine() => récupère une chaîne de caractères
		// scan.nextInt() => récupère un nombre entier
		// scan.nextFloat() => récupère un nombre flottant etc...
		System.out.println("Nom : " );
		String name = scan.nextLine();
		
		System.out.println("Prénom : " );
		String firstName = scan.nextLine();
				
		System.out.println("Téléphone : " );
		String number = scan.nextLine();
		
		System.out.println("Email : " );
		String email = scan.nextLine();
		
		scan.close();
		
		try {
			Contact contact1 = new Contact(name, firstName, email, number);
			System.out.println(contact1);
			Annuaire annuaire = new Annuaire();
			annuaire.addContact(contact1);
		} catch(ErrorException e) {
			e.printStackTrace();
		}
		
//		try {
//			Contact contact2 = new Contact();
//			contact2.setEmail("jdupond@gmail.com");
//			System.out.println(contact2);
//		} catch(ErrorException e) {
//			e.printStackTrace();
//		}
		
		
		
	}

}
