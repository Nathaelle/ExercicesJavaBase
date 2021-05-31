package models;

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

	public void throwArrow() {
		System.out.println("Lance une flèche");
	}
	
	public String showCharacter() {
		return "Archer + " + super.showCharacter();
	}
}
