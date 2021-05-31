package animaux;

public class Requin extends Ovipare implements Nageur {

	public Requin() {
	}

	public Requin(String race, String espece) {
		super(race, espece);
	}

	public Requin(String race, String espece, double poids) {
		super(race, espece, poids);
	}

	@Override
	public void crier() {
		System.out.println("Bllblllbllllbbll");
	}

	@Override
	public void nager() {
		System.out.println("Je nage (peu importe comment)");
	}
	
	

}
