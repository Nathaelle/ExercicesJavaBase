package comptecommun;

import java.util.ArrayList;

public class Compte implements Observable {

	private static Compte compte;
	private ArrayList<Client> abonnes;
	private int decouvert;
	
	private int solde;
	
	private Compte() {
		super();
		this.abonnes = new ArrayList<>();
		this.decouvert = -250;
	}

	private Compte(int solde) {
		super();
		this.solde = solde;
		this.abonnes = new ArrayList<>();
		this.decouvert = -250;
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
	
	public static Compte getCompte() {
		return compte;
	}

	public static void setCompte(Compte compte) {
		Compte.compte = compte;
	}

	public ArrayList<Client> getAbonnes() {
		return abonnes;
	}

	public void setAbonnes(ArrayList<Client> abonnes) {
		this.abonnes = abonnes;
	}

	public int getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(int decouvert) {
		this.decouvert = decouvert;
	}

	public void debit(int somme) {
		this.solde -= somme;
		if(this.solde <= this.decouvert) {
			notifier("Vous avez dépassé votre découvert autorisé. Veuillez vous rapprocher de votre conseiller.");
		} else if(solde <= 0) {
			notifier("Attention, votre solde est inférieur à 0. Il est de " + solde + "€");
		}
	}

	@Override
	public String toString() {
		return "Compte [solde=" + solde + "]";
	}
	
	
	public void notifier(String message) {
		for (Client client : this.abonnes) {
			client.update(message);
		}
	}
	
	
	public void inscription(Client client) {
		this.abonnes.add(client);
	}
	
	
}
