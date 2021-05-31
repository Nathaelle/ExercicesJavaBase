package vehicules;

public class Bus extends Vehicule {

	private static int NB_ROUES = 6;
	
	private double volumeSoutes;
	
	public Bus(String marque, double volumeSoutes) {
		super(NB_ROUES, marque);
		this.volumeSoutes = volumeSoutes;
	}
	
	public void klaxonner() {
		System.out.println("Tutuututututuuuuuuuuuutttt");
	}
}
