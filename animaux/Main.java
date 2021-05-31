package animaux;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Chat chat = new Chat();
		Cheval cheval = new Cheval();
		Serpent serpent = new Serpent();
		Manchot manchot = new Manchot();
		Baleine baleine = new Baleine();
		Requin requin = new Requin();

		chat.crier();
		cheval.crier();
		serpent.crier();
		manchot.crier();
		
		chat.seDeplacer();
		cheval.seDeplacer();
		serpent.seDeplacer();
		manchot.seDeplacer();
		
		chat.seReproduire();
		cheval.seReproduire();
		serpent.seReproduire();
		manchot.seReproduire();
		
		ArrayList<Animal> zoo = new ArrayList<>();
		zoo.add(chat);
		zoo.add(cheval);
		zoo.add(serpent);
		zoo.add(manchot);
		zoo.add(requin);
		zoo.add(baleine);
		
		ArrayList<Serpent> vivarium = new ArrayList<>();
		vivarium.add(serpent);
		
		ArrayList<Nageur> aquarium = new ArrayList<>();
		aquarium.add(requin);
		aquarium.add(baleine);
		
		for(Nageur animal: aquarium) {
			animal.nager();
		}
	}

}
