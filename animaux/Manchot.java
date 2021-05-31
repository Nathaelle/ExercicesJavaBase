package animaux;

public class Manchot extends Ovipare {

	
	public Manchot() {
		super();
	}

	public Manchot(String race, String espece, double poids) {
		super(race, espece, poids);
	}

	public Manchot(String race, String espece) {
		super(race, espece);
	}

	@Override
	public void crier() {
		System.out.println("Kuiiikkk");
	}
}
