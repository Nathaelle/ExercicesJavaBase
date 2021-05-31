package jdr;

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

	public int throwSpell() {
		return 12;
	}
	
	public String showCharacter() {
		return "Archer + " + super.showCharacter();
	}
	
	@Override
	public void attack(Target perso) {
		perso.damage(throwSpell());
		System.out.println("Je lance des sorts");
	}
	
}
