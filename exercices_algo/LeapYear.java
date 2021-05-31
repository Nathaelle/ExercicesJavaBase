package exercices_algo;

import java.util.Scanner;

public class LeapYear {
	
	public static void main(String[] args) {
		
		// Variables : year en Numérique (int), 
		//			   result en Booléen (boolean)
		boolean result = false;
		
		// Lire year
		System.out.println("Saisir une année :");
		Scanner input = new Scanner(System.in);
		int year = input.nextInt();
		input.close();
		
		if (year % 4 != 0) {
			result = false;
		} else {
			
			if (year % 400 == 0) {
				result = true;
			} else if (year % 100 == 0 && year % 400 != 0) {
				result = false;
			} else {
				result = true;
			}
		}
		/* Si l'année considérée n'est pas multiple de 4 alors elle n'est pas bissextile.
		   Si elle est alors il faut encore faire d'autres tests :
				Si elle est multiple de 400 alors l'année est bissextile.
				Si elle est multiple de 100 (mais pas de 400) alors elle n'est pas bissextile.
				Dans les autres cas elle est bissextile.
		 */
		if(result) {
			System.out.println("L'année est bissextile");
		} else {
			System.out.println("L'année n'est pas bissextile");
		}
		
		// Version condensée :
		if ( year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.printf( "L'année %d est bissextile\n", year );
        } else {
            System.out.printf( "L'année %d n'est pas bissextile\n", year );
        }
			
		
	}

}
