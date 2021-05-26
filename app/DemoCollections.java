package app;

import java.util.Scanner;

public class DemoCollections {

	public static void main(String[] args) {
		
		byte[] tab = {0,0,0,0,0,0,0};
		byte[] tab2 = new byte[7];
		
		byte[][] multi = {
				{0,2,0,0,0,0,0},
				{0,0,0,0,0,5,0},
				{0,0,0,1,0,0,0},
				{0,0,0,0,0,0,0},
				{0,2,0,0,0,1,0}
		};
		
		for (byte[] line : multi) {
			String ligne = "";
			for (byte cell : line) {
				ligne += cell + " ";
			}
//			System.out.println(ligne);
		}
		
		// Exercice : Afficher le "labyrinthe" suivant
		char [][] maze = {
	            "######################################".toCharArray(),
	            "S      #       #             #       #".toCharArray(),
	            "###### # # ### # ########### # ### # #".toCharArray(),
	            "#      # # # # # #         # #   #####".toCharArray(),
	            "### #### # # # # # # # # # # # #     #".toCharArray(),
	            "#      # # # # # # ######### ####### #".toCharArray(),
	            "# #### # # # # # #             #     #".toCharArray(),
	            "# #    # # # #   # ########### # # # #".toCharArray(),
	            "# ###### # # # # # # # # # # # # # # #".toCharArray(),
	            "#        #   # #           # #   # # #".toCharArray(),
	            "####################################D#".toCharArray()
	        };
		
		
		// Labyrinthe 11 * 38
		
		boolean stop = false;
		
		int positionX = 36;
		int positionY = 9;
		maze[positionY][positionX] = 'x';

		Scanner input = new Scanner(System.in);
		
		do {
			
			for (char[] line : maze) {
				String ligne = "";
				for (char cell : line) {
					ligne += cell + " ";
				}
				System.out.println(ligne);
			}
			
			System.out.println("Où souhaitez-vous aller ? ");
			System.out.println("H (Haut)");
			System.out.println("B (Bas)");
			System.out.println("D (Droite)");
			System.out.println("G (Gauche)");
			
			String choice = input.nextLine();
			
			switch (choice) {
				case "H":
					if(maze[positionY - 1][positionX] != '#') {
						maze[positionY][positionX] = ' ';
						positionY--;
						maze[positionY][positionX] = 'x';
					}
					break;
				case "B":
					if(maze[positionY + 1][positionX] != '#') {
						maze[positionY][positionX] = ' ';
						positionY++;
						maze[positionY][positionX] = 'x';
					}
					break;
				case "D":
					if(maze[positionY][positionX + 1] != '#') {
						maze[positionY][positionX] = ' ';
						positionX++;
						maze[positionY][positionX] = 'x';
					}
					break;
				case "G":
					if(maze[positionY][positionX - 1] != '#') {
						maze[positionY][positionX] = ' ';
						positionX--;
						maze[positionY][positionX] = 'x';
					}
					break;
				default:
					break;
			}
			
		} while (!stop);
		
		input.close();
		
		
		
		
		
		
		

		
	}
}
