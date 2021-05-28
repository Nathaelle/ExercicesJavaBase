package app;

import java.util.ArrayList;

public class FreePizza {

	public static void main(String[] args) {

		ArrayList<String> clients = new ArrayList<String>();
		String[] tab = {"martin", "allard", "allemand", "bernard", "thomas", "petit", "robert", "richard", "durand", "dubois", "moreau", "laurent", "simon", "michel", "lefebvre", "leroy", "roux", "david", "bertrand", "morel", "fournier", "girard", "bonnet", "dupont", "lambert", "fontaine", "rousseau", "vincent", "muller", "lefevre", "faure", "andre", "mercier", "blanc", "guerin", "boyer", "garnier"};
		for(String client: tab)
			clients.add(client);
		
		ArrayList<String> gagnant = searchChar(clients, 0);
		
		System.out.println("Le gagnant est : " + gagnant.get(0));
		
	}
	
	public static ArrayList<String> searchChar(ArrayList<String> tab, int position) {
		
		if(tab.size() == 1) {
			return tab;
		} else {
			
			char min = tab.get(0).charAt(position);
			for(String nom: tab) {
				if(min > nom.charAt(position))
					min = nom.charAt(position);
			}
			
			// reconstruction du tableau avec noms restants
			ArrayList<String> newTab = new ArrayList<>();
			for(String client: tab) {
				if(client.charAt(position) == min)
					newTab.add(client);
			}
			
			// rappel de la méthode
			return searchChar(newTab, ++position);
			
		}
	}

}
