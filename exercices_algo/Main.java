package exercices_algo;

public class Main {

	public static void main(String[] args) {
		
		byte a = 30;
		byte b = 7;
		int result = (a * b);
		byte reste = (byte) (a % b);
		
		// 1. Le résultat (optimisé de a * b)
		System.out.println(result);
		
		// 2. Le reste de la division entière de a par b
		System.out.println(reste);
		
		// 3. Essayer de diviser a par 0
//		System.out.println(a / 0);
		
		// 4. Afficher le plus grand des deux nombres
		if(a > b) {
			// SI (a est supérieur à b) ALORS
			// AFFICHER a
			System.out.println(a);
		} else {
			// SINON
			// AFFICHER b
			System.out.println(b);
		}

	}
	

}
