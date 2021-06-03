package comptecommun;

public class Compte {

	private static Compte compte;
	
	private int solde;
	
	private Compte() {
		super();
	}

	private Compte(int solde) {
		super();
		this.solde = solde;
	}
	
	/* Méthodes statiques permettant de récupérer une instance du Compte */
	
	public static Compte getInstance() {
		/* S'il n'y a aucune instance disponible, on en crée une (la première fois seulement) 
		 * On renvoie la SEULE instance de cette classe */
		if(compte == null ) {
			System.out.println("Le compte n'existe pas, il est donc créé");
			compte = new Compte();
		} else {
			System.out.println("Le compte existe déjà, il est juste renvoyé");
		}
		
		return compte;
	}
	
	public static Compte getInstance(int solde) {
		
		if(compte == null ) {
			System.out.println("Le compte n'existe pas, il est donc créé");
			compte = new Compte(solde);
		} else {
			System.out.println("Le compte existe déjà, il est juste renvoyé");
		}
		
		return compte;
	}

	public int getSolde() {
		return solde;
	}

	public void setSolde(int solde) {
		this.solde = solde;
	}
	
	public void debit(int somme) {
		this.solde -= somme;
	}

	@Override
	public String toString() {
		return "Compte [solde=" + solde + "]";
	}
	
	
}
