package animaux;

public abstract class Mammifere extends Animal {

	private double moyennePortees;

	
	public Mammifere() {
		super();

	}

	public Mammifere(String race, String espece, double poids) {
		super(race, espece, poids);

	}

	public Mammifere(String race, String espece) {
		super(race, espece);
	}

	@Override
	public abstract void crier();

	@Override
	public void seReproduire() {
		System.out.println("J'allaite mes petits");
	}
	
}
