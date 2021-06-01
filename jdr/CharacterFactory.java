package jdr;


public abstract class CharacterFactory {

	public static Character createCharacter(String type) throws CharacterException {
		
		switch (type) {
		
			case "ARCHER" : return new Archer();
			case "WARRIOR" : return new Warrior();
			case "MAGE" : return new Mage();
			default : throw new CharacterException("Erreur de choix du type de personnage");
		}
		
	}
	
	public static Character createCharacter(String type, String nom) throws CharacterException {
		
		switch (type) {
		
			case "ARCHER" : return new Archer(nom);
			case "WARRIOR" : return new Warrior(nom);
			case "MAGE" : return new Mage(nom);
			default : throw new CharacterException("Erreur de choix du type de personnage");
		}
		
	}
	
}
