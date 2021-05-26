package app;

import java.util.Scanner;

public class DemoFor {

	public static void main(String[] args) {
		
		char[] tab = {'H','e','l','l','o'};
		int nbElements = tab.length;
		
		for ( int counter = 0; counter < nbElements; counter++ ) {
//			System.out.println( tab[counter] );
		}
		
		for (char element : tab) {
//			System.out.println(element);
		}
		
		String [] months = {
	            "January", "February", "March", "April", "May", "June",
	            "July", "August", "September", "October", "November", "December"
	        }; 
		
		int i = 5;
		int j = 5;
		

		Scanner s = new Scanner(System.in);
		System.out.println("Entrez 5"); // 1
		int saisie = s.nextInt(); // 2
		
		while (saisie != 5) {
			System.out.println("Entrez 5"); // 1
			saisie = s.nextInt(); // 2
		}
		
		s.close();
		
		Scanner t = new Scanner(System.in);
		int saisie2;
		do {
			System.out.println("Entrez 5"); // 1
			saisie2 = t.nextInt(); // 2
	            
		} while(saisie2 != 5);
		
		t.close();
	}
}
