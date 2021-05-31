package vehicules;
import java.util.ArrayList;

public class Moto extends Vehicule {
	
	private static final int NB_ROUES = 2;
	private ArrayList<String> equipements;
	
	public Moto(String marque) {
		super(NB_ROUES, marque);
		this.equipements = new ArrayList<>();
	}
	
	@Override
	public void klaxonner() {
		System.out.println("Tutuu");
	}
	
}
