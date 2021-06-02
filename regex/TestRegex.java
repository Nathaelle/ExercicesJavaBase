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
		System.out.println(texte.matches("^[\\w \\.]*$"));
		System.out.println(texte2.matches("^[\\w \\.]*$"));
		
	}

}
