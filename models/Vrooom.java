package models;

public class Vrooom {

	public static void main(String[] args) {
		
		Bus bus = new Bus("Renault", 1500);
		Voiture voiture = new Voiture("Ford");
		Moto moto = new Moto("BMW");
		
		bus.klaxonner();
		voiture.klaxonner();
		moto.klaxonner();
	}

}
