package app;

import java.util.Locale;
import java.util.Scanner;

public class ExposeMarie {

	public static void main(String[] args) {
		
		// TODO Refaire l'exercice pour entrainement !

		/* Moyenne = somme des données / nombre de données
		 * Nbre de données doit être compté
		 * 
		 * Variables
		 * temperature : double
		 * compteur : int 
		 * somme : double
		 * moyenne : double
		 * */
		
		double somme = 0;
		
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		System.out.println("Entrez le nombre de données à saisir :");
		int compteur = sc.nextInt();
		
		for(int i = 0; i < compteur; i++) {
			System.out.println("Entrez température n° : " + (i+1));
			somme += sc.nextDouble();
		}
		
		sc.close();
		
		double moyenne = somme / compteur;
		
		System.out.println("La moyenne des températures de la région est de : " + moyenne + "°C");
		
	}

}
