package jdr;

import java.util.ArrayList;
import java.util.Map;

public class Jdr {

	public static void main(String[] args) {
		
		/* public Archer(String name, int strength, int level, int health) */
		
		try {
			Archer perso1 = new Archer("Rose", 12, 5, 500);
			System.out.println(perso1);
			
		} catch(CharacterException e) {
			System.out.println("Il y a eu une erreur lors de la création du personnage avec le message suivant :");
			System.out.println(e.getMessage());
		}
		
		
		
		
//		Warrior perso2 = new Warrior("Golbu");
//		Mage perso3 = new Mage("Merlin", 13, 3);
		
//		Scanner sc = new Scanner(System.in);
//		
//		boolean pb = false;
//		
//		do {
//			
//			System.out.println("Choisissez un type de personnage (ARCHER - WARRIOR - MAGE)");
//			String choix = sc.nextLine();
//			System.out.println("Choisissez son nom ([3-10] caractères)");
//			String nom = sc.nextLine();
//			
//			try {
//				pb = false;
//				Character perso4 = CharacterFactory.createCharacter(choix, nom);
//				System.out.println(perso4);
//				
//			} catch(CharacterException e) {
////				e.printStackTrace();
//				System.out.println(e);
//				pb = true;
//				System.out.println("Il y a eu un problème, veuillez recommencer !");
//			} 
//			
//		} while(pb);
//		
//		sc.close();
		
//		Creature monstre = new Creature("Rat", 560, 12);
//		
//		System.out.println(perso1);
//		System.out.println(perso2);
//		System.out.println(perso3);
//		System.out.println(perso4);
//		
//		perso1.attack(perso3);
//		perso3.attack(perso2);
//		perso2.attack(perso3);
//		perso4.attack(perso1);
//		
//		perso3.attack(monstre);
//		monstre.attack(perso1);
//		
		
//		System.out.println(perso1.showCharacter());
//		System.out.println(perso2.showCharacter());
//		System.out.println(perso3.showCharacter());
//		
//		
//		Attacker att1 = new Attacker() {
//			@Override
//			public void attack(Target perso) {
//				
//			}
//		};
//		
//		att1.attack(perso4);
		
		
	}
}
