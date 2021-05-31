package models;

public class Character {

	private String name;
	private int strength;
	private int level;
	private int maxHealth;
	private int health;
	
	/* Avec surcharge de constructeur */
	public Character() {
		this.name = "unknown";
		this.strength = 5;
		this.level = 1;
		this.health = 100;
	}
	
	public Character(String name) {
		this.name = name;
		this.strength = 4 + (int) Math.floor(Math.random() * 8);
		this.level = 1;
		this.health = 100;
	}
	
	public Character(String name, int strength, int level) {
		this.name = name;
		this.strength = strength;
		this.level = level;
		this.health = 100;
	}
	
	public Character(String name, int strength, int level, int health) {
		this.name = name;
		this.strength = strength;
		this.level = level;
		this.health = health;
	}
	
	
	public void attack(Character perso) {
		perso.damage(10);
	}
	
	public void damage(int pts) {
		this.health -= pts;
	}
	
	
	public String showCharacter() {
		return "Character [name=" + name + ", strength=" + strength + ", level=" + level + ", health=" + health +"]";
	}

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
	
	
	
	
}
