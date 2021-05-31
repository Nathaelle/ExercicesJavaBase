package animaux;

public class Cheval extends Mammifere {

	
	public Cheval() {
		super();
	}

	public Cheval(String race, String espece, double poids) {
		super(race, espece, poids);
	}

	public Cheval(String race, String espece) {
		super(race, espece);
	}
	

	@Override
	public void crier() {
		System.out.println("Uhhuuuuu");
	}
}
