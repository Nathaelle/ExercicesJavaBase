package jdr;

public class Creature implements Attacker, Target {
	
	private String race;
	private int health;
	private int maxHealth;
	private int strength;

	public Creature() {
	}

	public Creature(String race, int maxHealth, int strength) {
			this.race = race;
			this.maxHealth = maxHealth;
			this.strength = strength;
			this.health = maxHealth;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getMaxHealth() {
		return maxHealth;
	}

	public void setMaxHealth(int maxHealth) {
		this.maxHealth = maxHealth;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	@Override
	public void damage(int deg) {
		this.health -= deg;
	}

	@Override
	public void attack(Target cible) {
		
		int deg = (int) Math.floor(Math.random() * 6);
		cible.damage(deg + this.strength);
	}
	
	
}
