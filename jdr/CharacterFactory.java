package jdr;

public abstract class CharacterFactory {

	public static Character createCharacter(String type) {
		
		switch (type) {
		
			case "ARCHER" : return new Archer();
			case "WARRIOR" : return new Archer();
			case "MAGE" : return new Archer();
		}
		
		throw new RuntimeException("Erreur de choix du type de personnage");
		
	}
	
public static Character createCharacter(String type, String nom) {
		
		switch (type) {
		
			case "ARCHER" : return new Archer();
			case "WARRIOR" : return new Archer();
			case "MAGE" : return new Archer();
		}
		
		throw new RuntimeException("Erreur de choix du type de personnage");
		
	}
	
}
