package jdr;

public class Warrior extends Character {
	
	private static final int MAX_HEALTH = 1000;
	
	/* Constructeurs */

	public Warrior() {
		super(MAX_HEALTH);
	}
	
	public Warrior(String name) throws CharacterException {
		super(name, MAX_HEALTH);
	}

	public Warrior(String name, int strength, int level) throws CharacterException {
		super(name, strength, level, MAX_HEALTH);
	}
	
	public Warrior(String name, int strength, int level, int health) throws CharacterException {
		super(name, strength, level, MAX_HEALTH, health);
	}

	/* Getter (constante de classe) */
	
	public int getMaxHealth() {
		return MAX_HEALTH;
	}
	
	/* Méthodes spécifiques de la classe */

	public int hit() {
		return 15;
	}
	
	/* Méthodes héritées redéfinies/ implémentées */
	
	@Override
	public String toString() {
		return "Warrior (spécialité) + \n" + super.toString();
	}

	@Override
	public String showCharacter() {
		return "Warrior + " + super.showCharacter();
	}

	@Override
	public void attack(Target perso) {
		if(!isDeath()) {
			perso.damage(hit());
			System.out.println("Je frappe");
		}
	}
}
