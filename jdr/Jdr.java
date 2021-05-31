package jdr;

public class Jdr {

	public static void main(String[] args) {
		
		Archer perso1 = new Archer("Rose", 10, 5);
		Warrior perso2 = new Warrior("Golbu");
		Mage perso3 = new Mage("Merlin", 13, 3);
		
		Character perso4 = CharacterFactory.createCharacter("ARCHER", "Robin");
		
		Creature monstre = new Creature("Rat", 560, 12);
		
		System.out.println(perso1);
		System.out.println(perso2);
		System.out.println(perso3);
		System.out.println(perso4);
		
		perso1.attack(perso3);
		perso3.attack(perso2);
		perso2.attack(perso3);
		perso4.attack(perso1);
		
		perso3.attack(monstre);
		monstre.attack(perso1);
		
		
		System.out.println(perso1.showCharacter());
		System.out.println(perso2.showCharacter());
		System.out.println(perso3.showCharacter());
		
	}
}
