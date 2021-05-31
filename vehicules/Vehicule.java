package vehicules;

public abstract class Vehicule {
	
	private int nbRoues;
	private String marque;
	
	public Vehicule(int nbRoues, String marque) {
		this.nbRoues = nbRoues;
		this.marque = marque;
	}
	
	public abstract void klaxonner();

}
