package bibliotheque;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	private static List<Livre> bibliotheque;

	public static void main(String[] args) {
		
		initBibliotheque();
		
		
		
	}
	
	private static void initBibliotheque() {
		
		Livre livre1 = new Livre("rs548", "Les Misérables", "Victor Hugo");
		Livre livre2 = new Livre("nb548",  "L'Iliade et l'Odyssée", "Homère");
		Livre livre3 = new Livre("ut862", "1984", "George Orwell");
		
		System.out.println(livre1);
		System.out.println(livre2);
		System.out.println(livre3);
		
		List<Livre> classiques = new ArrayList<>();
		classiques.add(livre1);
		classiques.add(livre2);
		classiques.add(livre3);
		
		Main.setBibliotheque(classiques);
	}
	
	public static void setBibliotheque(List<Livre> bibli) {
		bibliotheque = bibli;
	}

}
