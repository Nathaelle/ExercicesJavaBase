package models;

public class Mage extends Character {

	
	public Mage() {
		super();
	}

	public Mage(String name, int strength, int level) {
		super(name, strength, level);
	}

	public Mage(String name) {
		super(name);
	}

	public void throwSpell() {
		System.out.println("Lance un sort");
	}
	
	public String showCharacter() {
		return "Archer + " + super.showCharacter();
	}
	
}
