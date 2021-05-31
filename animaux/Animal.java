package animaux;

public abstract class Animal {

	private String race;
	private String espece;
	private double poids;
	
	/* Constructeurs 
	 * (polymorphisme = plusieurs "versions" de la même méthode) */
	
	public Animal() {
		
	}
	
	public Animal(String race, String espece) {
		this.race = race;
		this.espece = espece;
	}
	
	public Animal(String race, String espece, double poids) {
		this.race = race;
		this.espece = espece;
		this.poids = poids;
	}
	
	/* Getters et Setters 
	 * Accéder aux propriétés de mon objet
	 * En ajoutant d'éventuelles contraintes (setters) */

	public String getRace() {
		return this.race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public String getEspece() {
		return this.espece;
	}

	public void setEspece(String espece) {
		this.espece = espece;
	}

	public double getPoids() {
		return this.poids;
	}

	public void setPoids(double poids) {
		this.poids = poids;
	}
	
	/* Méthodes supplémentaires 
	 * CONTRAT :
	 * TOUS les objet type Animal disposeront de ces méthodes
	 * (Signature du contrat implicite) 
	 * Responsabilité de la classe mère car méthodes GENERALES */
	
	public void seDeplacer() {
		System.out.println("Je suis un Animal donc capable de me déplacer (à mon niveau) dans l'Espace");
	}
	
	public abstract void crier();
	
	public abstract void seReproduire();
	
}
