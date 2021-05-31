package vehicules;

public class Voiture extends Vehicule {

	private static final int NB_ROUES = 4;
	
	public Voiture(String marque) {
		super(NB_ROUES, marque);
	}

	@Override
	public void klaxonner() {
		System.out.println("Tutt");
	}
}
