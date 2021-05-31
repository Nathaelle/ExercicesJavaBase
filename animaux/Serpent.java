package animaux;

public class Serpent extends Ovipare {

	
	public Serpent() {
		super();
	}

	public Serpent(String race, String espece, double poids) {
		super(race, espece, poids);
	}

	public Serpent(String race, String espece) {
		super(race, espece);
	}

	@Override
	public void crier() {
		System.out.println("*****");
	}

}
