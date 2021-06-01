package jdr;

public abstract class Character implements Attacker, Target {

	private String name;
	private int strength;
	private int level;
	private int maxHealth;
	private int health;
	private boolean death;
	
	/* Constructeurs */
	/* (Avec surcharge de constructeur) */
	
	public Character(int maxHealth) {
		this.name = "unknown";
		this.strength = 5;
		this.level = 1;
		this.health = maxHealth;
		this.maxHealth = maxHealth;
	}
	
	public Character(String name, int maxHealth) throws CharacterException {

		this.maxHealth = maxHealth;
		setName(name);
		this.strength = 4 + (int) Math.floor(Math.random() * 8);
		this.level = 1;
		this.health = maxHealth;
	}
	
	public Character(String name, int strength, int level, int maxHealth) throws CharacterException {

		this.maxHealth = maxHealth;
		setName(name);
		setStrength(strength);
		setLevel(level);
		this.health = maxHealth;
	}
	
	public Character(String name, int strength, int level, int maxHealth, int health) throws CharacterException {

		this.maxHealth = maxHealth;
		setName(name);
		setStrength(strength);
		setLevel(level);
		setHealth(health);
		setDeath();
	}
	
	/* Getters & Setters */
	
	public String getName() {
		return this.name;
	}

	/* 3 - 10 caractères maximum */
	public void setName(String name) throws CharacterException {
		
		int len = name.length();
		if(len < 3) {
			throw new CharacterNameException("Le nom doit être composé d'au moins 3 caractères");
		} else if(len > 10) {
			throw new CharacterNameException("Le nom est trop long (10 caractères maximum)");
		} else {
			this.name = name;
		}
	}

	public int getStrength() {
		return this.strength;
	}

	/* Toujours inférieur à maxHealth/ 50 */
	/* Toujours valeur positive */
	public void setStrength(int strength) throws CharacterAttIllegalValue {
		
		if(strength >= 0 && strength < maxHealth / 50) {
			this.strength = strength;
		} else if(strength >= 0) {
			throw new CharacterAttIllegalValue("La limite est de " + (maxHealth / 50) + "pts");
		} else {
			throw new CharacterAttIllegalValue("La valeur doit être positive");
		}
		
	}

	public int getLevel() {
		return this.level;
	}

	/* Toujours valeur positive */
	public void setLevel(int level) throws CharacterAttIllegalValue {
		
		if(level >= 0) {
			this.level = level;
		} else {
			throw new CharacterAttIllegalValue("La valeur doit être positive");
		}
	}
	
	public int getMaxHealth() {
		return maxHealth;
	}

	public void setMaxHealth(int maxHealth) {
		this.maxHealth = maxHealth;
	}

	public int getHealth() {
		return health;
	}

	/* Jamais supérieur à la santé maximum */
	public void setHealth(int health) {
		
		if(health > this.maxHealth) {
			this.health = maxHealth;
		} else {
			this.health = health;
		}
	}
	
	public boolean isDeath() {
		return death;
	}

	protected void setDeath() {
		this.death = (health <= 0);
		if (isDeath())
			this.health = 0;
	}
	
	public void setDeath(boolean death) {
		this.death = death;
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
	
	@Override
	public abstract void attack(Target perso);
	
	@Override
	public void damage(int pts) {
		this.health -= pts;
		setDeath();
	}
	
}
