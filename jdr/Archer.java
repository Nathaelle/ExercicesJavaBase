package jdr;

public class Archer extends Character {

	private static final int MAX_HEALTH = 850;
	
	/* Constructeurs */
	
	public Archer() {
		super(MAX_HEALTH);
	}
	
	public Archer(String name) {
		super(name, MAX_HEALTH);
	}

	public Archer(String name, int strength, int level) {
		super(name, strength, level, MAX_HEALTH);
	}

	public Archer(String name, int strength, int level, int health) {
		super(name, strength, level, MAX_HEALTH, health);
	}

	/* Getter (constante de classe) */
	
	public int getMaxHealth() {
		return MAX_HEALTH;
	}
	
	/* Méthodes spécifiques de la classe */
	
	public int throwArrow() {
		return 8;
	}
	
	/* Méthodes héritées redéfinies/ implémentées */

	@Override
	public String toString() {
		return "Archer (spécialité) + \n" + super.toString();
	}

	@Override
	public String showCharacter() {
		return "Archer + " + super.showCharacter();
	}

	@Override
	public void attack(Target perso) {
		if(!isDeath()) {
			perso.damage(throwArrow());
			System.out.println("Je tire des flèches");
		}
	}
}
