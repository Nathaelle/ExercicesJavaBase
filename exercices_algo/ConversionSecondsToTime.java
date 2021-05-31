package exercices_algo;

import java.util.Scanner;

public class ConversionSecondsToTime {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entrez un nombre de secondes");
		int seconds = sc.nextInt();
		
		int minutes = seconds / 60;
		seconds = seconds % 60;
		
		int hours = minutes / 60;
		minutes = minutes % 60;
		
		System.out.println( hours + "h " + minutes +"min " + seconds + "s");
		sc.close();
	}

}
