package jdr;

public class Jdr {

	public static void main(String[] args) {
		
		Archer perso1 = new Archer("Rose", 10, 5);
		Warrior perso2 = new Warrior("Golbu");
		Mage perso3 = new Mage("Merlin", 13, 3);
		
		System.out.println(perso1.showCharacter());
		System.out.println(perso2.showCharacter());
		System.out.println(perso3.showCharacter());
		
		perso1.attack(perso3);
		perso3.attack(perso2);
		perso2.attack(perso3);
		
		System.out.println(perso1.showCharacter());
		System.out.println(perso2.showCharacter());
		System.out.println(perso3.showCharacter());
		
	}
}
