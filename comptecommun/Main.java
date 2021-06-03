package comptecommun;

public class Main {
	
	public static void main(String[] args) {
		
		//Compte compteCommun = new Compte(45000);
		Compte compteCommun = Compte.getInstance(1560);
		System.out.println(compteCommun);
		Compte compteCommun2 = Compte.getInstance(86547325);
		System.out.println(compteCommun2);
		
		System.out.println(compteCommun.getSolde());
		
		Client jean = new Client("Dupond", "Jean", compteCommun);
		Client lucie = new Client("Dupond", "Lucie", compteCommun);
		
		//Compte compte2 = new Compte(150);
		
//		jean.retrait(560);
//		System.out.println(compteCommun);
//		jean.retrait(40);
//		System.out.println(compteCommun);
//		lucie.retrait(1200);
//		System.out.println(compteCommun);
//		jean.retrait(1560);
//		System.out.println(compteCommun);
		
		Thread t1 = new Thread(jean);
		Thread t2 = new Thread(lucie);
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
			System.out.println("Les threads se sont terminés avec succès");
		} catch(InterruptedException e) {
			
		}
		
		
		
	}

}
