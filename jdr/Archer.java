package jdr;

public class Archer extends Character {

	
	public Archer() {
		super();
	}

	public Archer(String name, int strength, int level) {
		super(name, strength, level);
	}

	public Archer(String name) {
		super(name);
	}

	public int throwArrow() {
		return 8;
	}
	
	public String showCharacter() {
		return "Archer + " + super.showCharacter();
	}

	@Override
	public void attack(Character perso) {
		perso.damage(throwArrow());
		System.out.println("Je tire des flèches");
	}
}
