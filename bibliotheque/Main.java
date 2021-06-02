package bibliotheque;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Main {
	
	private static List<Livre> bibliotheque;

	public static void main(String[] args) {
		
		Main.initBibliotheque();
		
		// 1. Afficher les titres de tous les livres de la bibliothèque
		
		// Je doit parcourir ma liste 
		// Solution : boucle for (for each + précis)
		// (en cas "d'oubli" de la syntaxe tapez for puis Ctrl+Espace et sélectionnez foreach)
		
//		for (Livre livre : bibliotheque) {
//			System.out.println(livre.getTitre() + " par " + livre.getAuteur());
//		}
		
		// 2. Permettre à l'utilisateur d'ajouter un nouveau livre, et le stocker dans la bibliothèque
		
		// Je dois récupérer la saisie de l'utilisateur avec un objet Scanner
		// En stockant les données saisies dans des variables
		// Je dois utiliser ces variables pour créer un nouvel objet Livre
		// Je dois ajouter ce livre dans la bibliotheque
		
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("\nRéférence du livre : ");
//		String reference = scan.nextLine();
//		System.out.println("Titre du livre : ");
//		String titre = scan.nextLine();
//		System.out.println("Auteur du livre : ");
//		String auteur = scan.nextLine();
//		
//		Livre livre = new Livre(reference, titre, auteur);
//		
//		bibliotheque.add(livre);
		
		// 2.bis Réafficher la bibliothèque mise à jour
		
//		for (Livre book : bibliotheque) {
//			System.out.println(book.getTitre() + " par " + book.getAuteur());
//		}
		
		// 3. Afficher les titres des livres préalablement triés (ordre alphabétique)
	
		// Je sais que List propose une méthode de tri sort()
		// Je me rends sur la doc
		// Par extension je consulte également la doc de Comparator

//		bibliotheque.sort(new Comparator<Livre>() {
//			@Override
//			public int compare(Livre livre1, Livre livre2) {
//				return livre1.getTitre().compareToIgnoreCase(livre2.getTitre());
//			}
//		});
		
		// Même chose avec Lambda Expression
		
		bibliotheque.sort((livre1, livre2) -> livre1.getTitre().compareToIgnoreCase(livre2.getTitre()));

		
		
		// Alternative "maison"
		
//		int len = bibliotheque.size();
//		
//		for (int i = 0 ; i < len; i++ ) {
//			for(int j = i; j < len; j++) {
//				
//				Livre min = searchMin(bibliotheque, 0, i).get(0);
//				int index = bibliotheque.indexOf(min);
//
//				bibliotheque.set(index, bibliotheque.set(i, min));	
//			}
//		}
		

		for (Livre book : bibliotheque) {
			System.out.println(book.getTitre() + " par " + book.getAuteur());
		}
		
	}
	
	private static void initBibliotheque() {
		
		Livre livre1 = new Livre("rs548", "Les Misérables", "Victor Hugo");
		Livre livre2 = new Livre("nb548",  "L'Iliade et l'Odyssée", "Homère");
		Livre livre3 = new Livre("ut862", "1984", "George Orwell");
		Livre livre4 = new Livre("fr693", "Voyage au centre de le terre", "Jules Vernes");
		Livre livre5 = new Livre("sd861", "Ravage", "Barjavel");
		Livre livre6 = new Livre("zq695", "Les fleurs du mal", "Baudelaire");
		
		
		List<Livre> classiques = new ArrayList<>();
		classiques.add(livre1);
		classiques.add(livre2);
		classiques.add(livre3);
		classiques.add(livre4);
		classiques.add(livre5);
		classiques.add(livre6);
		
		bibliotheque = classiques;
		
	}
	
	public static List<Livre> searchMin(List<Livre> tab, int position, int startAt) {
		
		if(tab.size() == 1) {
			return tab;
		} else {
			
			char min = tab.get(startAt).getTitre().charAt(position);
			
			for(int i = startAt; i < tab.size(); i++) {
				if(min > tab.get(i).getTitre().charAt(position))
					min = tab.get(i).getTitre().charAt(position);
			}
			
			// reconstruction du tableau avec noms restants
			ArrayList<Livre> newTab = new ArrayList<>();
			for(int i = startAt; i < tab.size(); i++) {
				if(tab.get(i).getTitre().charAt(position) == min)
					newTab.add(tab.get(i));
			}
			
			// rappel de la méthode
			return searchMin(newTab, ++position, 0);
			
		}
	}
	
	

}
