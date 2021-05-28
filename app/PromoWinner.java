package app;

import java.util.Scanner;

public class PromoWinner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Variables
		 * somme : double
		 * points : int
		 * tranche : int
		 * */
		double somme = 0;
		
		Scanner sc = new Scanner(System.in);
		double fact = 0;
		
		do {
			System.out.println("Entrez le montant de votre facture (0 pour sortir)");
			fact = sc.nextDouble();
			somme += fact;
		} while (fact != 0);
		
		int points = (int) Math.floor(somme / 25);
		System.out.println("Nombre de points de fidelités : " + points + "pts");
		
		
		
	}

}
