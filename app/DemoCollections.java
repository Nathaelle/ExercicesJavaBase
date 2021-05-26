package app;

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
	            "#S     #       #             #       #".toCharArray(),
	            "###### # # ### # ########### # ### # #".toCharArray(),
	            "#      # # # # # #         # #   #####".toCharArray(),
	            "### #### # # # # # # # # # # # #     #".toCharArray(),
	            "#      # # # # # # ######### ####### #".toCharArray(),
	            "# #### # # # # # #             #     #".toCharArray(),
	            "# #    # # # #   # ########### # # # #".toCharArray(),
	            "# ###### # # # # # # # # # # # # # # #".toCharArray(),
	            "#        #   # #           # #   # #D#".toCharArray(),
	            "######################################".toCharArray()
	        };
		
		for (char[] line : maze) {
			String ligne = "";
			for (char cell : line) {
				ligne += cell + " ";
			}
//			System.out.println(ligne);
		}
		
		int len = maze.length;
		for (int i = 0; i < len; i++) {
			String ligne = "";
			int len2 = maze[i].length;
			for (int j = 0; j < len2; j++) {
				ligne += maze[i][j] + " ";
			}
			System.out.println(ligne);
		}
		
	}
}
