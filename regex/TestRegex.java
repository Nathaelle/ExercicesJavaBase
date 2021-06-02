package regex;

public class TestRegex {

	public static void main(String[] args) {
		
		
		String texte = "code etc...";
		String texte2 = "jdupond@gmail.com";
		
		// Il faut doubler le caractère d'échappement (le backslash)
		// Tester avec différents ensembles
		// [] <- Un ensemble se défini entre crochets
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
//		System.out.println(telephone.matches("^0[67][0-9]{8}$"));
		
		
		String password = "zecfze";
		// Je cherche à vérifier que le mot de passe contient au moins 8 caractères
		// {min,max} : nombre de caractère(s) minimum et maximum
		// {min,} : nombre de caractère(s) minimum vers l'infini
		// {,max} : nombre des caractère(s) entre 0 et maximum
		// {nombre} : nombre de caractère(s) fixe
//		System.out.println(password.matches("^[\\w]{8,}$"));
		
		String email = "jdupond@gmail.com";
		System.out.println(email.matches("^[a-zA-Z0-9-_\\.]+@[a-zA-Z-]+\\.[a-zA-Z0-9]{2,}$"));
		
	}

}
