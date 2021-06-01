package bibliotheque;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	private static List<Livre> bibliotheque;

	public static void main(String[] args) {
		
		Main.initBibliotheque();
		
		
		
		
		
		
	}
	
	private static void initBibliotheque() {
		
		Livre livre1 = new Livre("rs548", "Les Misérables", "Victor Hugo");
		Livre livre2 = new Livre("nb548",  "L'Iliade et l'Odyssée", "Homère");
		Livre livre3 = new Livre("ut862", "1984", "George Orwell");
		Livre livre4 = new Livre("fr693", "Voyage au centre de le terre", "Jules Vernes");
		Livre livre5 = new Livre("sd861", "Ravage", "Barjavel");
		Livre livre6 = new Livre("zq695", "Les fleurs du mal", "Baudelaire");
		
		System.out.println(livre1);
		System.out.println(livre2);
		System.out.println(livre3);
		System.out.println(livre4);
		System.out.println(livre5);
		System.out.println(livre6);
		
		List<Livre> classiques = new ArrayList<>();
		classiques.add(livre1);
		classiques.add(livre2);
		classiques.add(livre3);
		classiques.add(livre4);
		classiques.add(livre5);
		classiques.add(livre6);
		
		bibliotheque = classiques;
	}

}
