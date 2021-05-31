package animaux;

public abstract class Ovipare extends Animal {

	private double moyenneOeufs;
	
	
	public Ovipare() {
		super();
	}
	
	public Ovipare(String race, String espece) {
		super(race, espece);
	}

	public Ovipare(String race, String espece, double poids) {
		super(race, espece, poids);
	}

	/* Getters et Setters 
	 * Pour les propriétés spécifiques à cette classe uniquement */
	
	public double getMoyenneOeufs() {
		return moyenneOeufs;
	}

	public void setMoyenneOeufs(double moyenneOeufs) {
		this.moyenneOeufs = moyenneOeufs;
	}

	@Override
	public abstract void crier();

	@Override
	public void seReproduire() {
		System.out.println("Je ponds des oeufs");
	}
	
}
