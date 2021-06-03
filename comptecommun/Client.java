package comptecommun;

public class Client implements Runnable{
	
	private String nom;
	private String prenom;
	private Compte compte;
	
	public Client(String nom, String prenom, Compte compte) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.compte = compte;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Compte getCompte() {
		return compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}
	
	public void retrait(int somme) {
		this.compte.debit(somme);
		System.out.println(this + " a effectué un retrait sur le compte " + this.compte);
	}

	@Override
	public void run() {

		// Code exécuté par le thread
		try {
			Thread.sleep((int) Math.floor(Math.random() * 3000));
		} catch(InterruptedException e) {
			
		}
		
		retrait((int) Math.floor(Math.random() * 750));
		
		try {
			Thread.sleep((int) Math.floor(Math.random() * 3000));
		} catch(InterruptedException e) {
			
		}
		
		retrait((int) Math.floor(Math.random() * 750));
		
		try {
			Thread.sleep((int) Math.floor(Math.random() * 3000));
		} catch(InterruptedException e) {
			
		}
		
		retrait((int) Math.floor(Math.random() * 750));
		
		try {
			Thread.sleep((int) Math.floor(Math.random() * 3000));
		} catch(InterruptedException e) {
			
		}
		
		retrait((int) Math.floor(Math.random() * 750));
		
		
	}

	@Override
	public String toString() {
		return "Client [nom=" + nom + ", prenom=" + prenom + ", compte=" + compte + "]";
	}

}
