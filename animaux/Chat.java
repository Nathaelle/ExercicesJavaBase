package animaux;

public class Chat extends Mammifere {

	
	public Chat() {
		super();
	}

	public Chat(String race, String espece, double poids) {
		super(race, espece, poids);
	}

	public Chat(String race, String espece) {
		super(race, espece);
	}

	@Override
	public void crier() {
		System.out.println("Maaooowwwww");
	}
}
