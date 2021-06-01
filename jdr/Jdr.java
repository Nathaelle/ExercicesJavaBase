package jdr;

import java.util.Scanner;

public class Jdr {

	public static void main(String[] args) {
		
//		Archer perso1 = new Archer("Rose", 10, 5);
//		Warrior perso2 = new Warrior("Golbu");
//		Mage perso3 = new Mage("Merlin", 13, 3);
		
		Scanner sc = new Scanner(System.in);
		
		boolean pb = false;
		
		do {
			
			System.out.println("Choisissez un type de personnage (ARCHER - WARRIOR - MAGE)");
			String choix = sc.nextLine();
			
			try {
				pb = false;
				Character perso4 = CharacterFactory.createCharacter(choix, "Robin");
				System.out.println(perso4);
				
			} catch(Exception e) {
				e.printStackTrace();
				pb = true;
				System.out.println("Il y a eu un problème, veuillez recommencer !");
			}
		} while(pb);
		
		
		
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
