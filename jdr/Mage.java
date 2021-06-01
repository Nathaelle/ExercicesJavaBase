package jdr;

public class Mage extends Character {

	private static final int MAX_HEALTH = 900;
	
	/* Constructeurs */
	
	public Mage() {
		super(MAX_HEALTH);
	}

	public Mage(String name) {
		super(name, MAX_HEALTH);
	}

	public Mage(String name, int strength, int level) {
		super(name, strength, level, MAX_HEALTH);
	}
	
	public Mage(String name, int strength, int level, int health) {
		super(name, strength, level, MAX_HEALTH, health);
	}
	
	/* Getter (constante de classe) */
	
	public int getMaxHealth() {
		return MAX_HEALTH;
	}
	
	/* Méthodes spécifiques de la classe */

	public int throwSpell() {
		return 12;
	}
	
	/* Méthodes héritées redéfinies/ implémentées */

	@Override
	public String toString() {
		return "Mage (spécialité) + \n" + super.toString();
	}
	
	@Override
	public String showCharacter() {
		return "Archer + " + super.showCharacter();
	}

	@Override
	public void attack(Target perso) {
		if(!isDeath()) {
			perso.damage(throwSpell());
			System.out.println("Je lance des sorts");
		}
	}
	
}
