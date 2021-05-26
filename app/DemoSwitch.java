package app;

public class DemoSwitch {

	public static void main(String[] args) {

		int nombre = (int) Math.floor(Math.random()*10);
		System.out.println(nombre);
		
		switch (nombre) {
			case 0: 
			case 1: 
			case 2: 
			case 3: 
			case 4: System.out.println("Le nombre est inférieur ou égal à 4");
				break;

			default: System.out.println("Le nombre est supérieur à 4");
				break;
			}

	}

}
