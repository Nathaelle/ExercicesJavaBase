package jdr;

public abstract class Character implements Attacker, Target {

	private String name;
	private int strength;
	private int level;
	private int maxHealth;
	private int health;
	
	/* Constructeurs */
	/* (Avec surcharge de constructeur) */
	
	public Character(int maxHealth) {
		this.name = "unknown";
		this.strength = 5;
		this.level = 1;
		this.health = maxHealth;
		this.maxHealth = maxHealth;
	}
	
	public Character(String name, int maxHealth) {
		this.name = name;
		this.strength = 4 + (int) Math.floor(Math.random() * 8);
		this.level = 1;
		this.health = maxHealth;
		this.maxHealth = maxHealth;
	}
	
	public Character(String name, int strength, int level, int maxHealth) {
		this.name = name;
		this.strength = strength;
		this.level = level;
		this.health = maxHealth;
		this.maxHealth = maxHealth;
	}
	
	public Character(String name, int strength, int level, int maxHealth, int health) {
		this.name = name;
		this.strength = strength;
		this.level = level;
		this.health = maxHealth;
		this.maxHealth = maxHealth;
	}
	
	/* Getters & Setters */
	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStrength() {
		return this.strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getLevel() {
		return this.level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	
	public abstract void attack(Target perso);
	
	public void damage(int pts) {
		this.health -= pts;
	}
	
	/* Méthodes générales de la classe */
	
	public String showCharacter() {
		return "Character [name=" + name + ", strength=" + strength + ", level=" + level + ", health=" + health +"]";
	}


	/* Méthodes héritées redéfinies/ implémentées */
	
	@Override
	public String toString() {
		return "Character [\n\tname=" + name + ", \n\tstrength=" + strength + ", \n\tlevel=" + level + ", \n\tmaxHealth=" + maxHealth
				+ ", \n\thealth=" + health + "\n]";
	}
	
	
	
	
}
