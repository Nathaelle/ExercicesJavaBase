package models;

public class Warrior extends Character {
	
	private static final int MAX_HEALTH = 100;

	public Warrior() {
		super();
	}
	
	public Warrior(String name) {
		super(name);
	}

	public Warrior(String name, int strength, int level) {
		super(name, strength, level, MAX_HEALTH);
	}

	
	
	public void hit() {
		System.out.println("Frappe");
	}

	public String showCharacter() {
		return "Warrior + " + super.showCharacter();
	}
}
