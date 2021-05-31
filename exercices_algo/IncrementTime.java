package exercices_algo;
import java.util.Scanner;

public class IncrementTime {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("Entrez les heures :");
		byte hours = input.nextByte();
		System.out.println("Entrez les minutes :");
		byte minutes = input.nextByte();
		
		input.close();
		
		minutes++;
		hours++;
		
		if (minutes >= 60) {
			minutes %= 60;
			hours++;
		}
		
		hours %= 24;
		
		System.out.println("Dans une heure et une minutes il sera : " + hours + "h " + minutes + "minutes");
		
/* VARIABLES
	
	minutes EST_DU_TYPE NOMBRE
	heures EST_DU_TYPE NOMBRE
	
DEBUT_ALGORITHME
	
	LIRE heures
	LIRE minutes
	
	minutes PREND_LA_VALEUR minutes + 1
	heures PREND_LA_VALEUR heures + 1
	
	SI (minutes >= 60) ALORS
		DEBUT_SI
		
		minutes PREND_LA_VALEUR 0
		heures PREND_LA_VALEUR heures + 1
		
		FIN_SI
	
	heures PREND_LA_VALEUR heures % 24
	
	AFFICHER "Dans une heure et une minutes il sera : "
	AFFICHER heures
	AFFICHER "h "
	AFFICHER minutes
	AFFICHER* "minutes"
	
FIN_ALGORITHME */

	}

}
