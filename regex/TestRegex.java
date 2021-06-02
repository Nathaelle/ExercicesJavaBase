package regex;

public class TestRegex {

	public static void main(String[] args) {
		
		
		String texte = "code etc...";
		String texte2 = "jdupond@gmail.com";
		
		// Il faut doubler le caractère d'échappement (le backslash)
		// Tester avec différents ensembles
		// [a-z] : abcdefghijklmnopqrstuvwxyz
		// [A-Z] : ABCDEFGHIJKLMNOPQRSTUVWXYZ
		// [0-9] : 0123456789
		// \\w : [a-zA-Z0-9_]
		// . : Nimporte quel caractère
		// \\. : Un point
//		System.out.println(texte.matches("^[\\w \\.]*$"));
//		System.out.println(texte2.matches("^[\\w \\.]*$"));
		
		String telephone = "0786985478";
		// Je cherche à vérifier que l'utilisateur a bien saisi un numero de téléphone portable
		System.out.println(telephone.matches("^0[67][0-9]{8}$"));
		
		
		String password = "ceviushsr";
		// Je cherche à vérifier que le mot de passe contient au moins 8 caractères
		System.out.println(password.matches("^[\\w]{8,}$"));
		
	}

}
