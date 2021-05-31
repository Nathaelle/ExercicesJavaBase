package animaux;

public class Baleine extends Mammifere implements Nageur {

	public Baleine() {
	}

	public Baleine(String race, String espece, double poids) {
		super(race, espece, poids);
	}

	public Baleine(String race, String espece) {
		super(race, espece);
	}

	@Override
	public void crier() {
		System.out.println("Mooooooooooooooooo");
	}

	@Override
	public void nager() {
		System.out.println("Je nage à ma manière");
	}

}
