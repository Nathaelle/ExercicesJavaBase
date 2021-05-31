package exercices_algo;

import java.util.Scanner;

public class ConversionTimeToSecond {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Entrez un nombre d'heures");
		int hours = sc.nextInt();
		System.out.println("Entrez un nombre de minutes");
		int minutes = sc.nextInt();

		minutes += hours * 60;
		int seconds = minutes * 60;
		
		System.out.println("Nombre de secondes : " + seconds + " secondes");
		sc.close();
	}

}
