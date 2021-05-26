package app;

public class DemoStrings {

	public static void main(String[] args) {

		String str1 = "Hello";
		String str2 = "Hel";
		str2 += "lo";
		
//		System.out.println(str1.equals(str2));
		
		
		String hw = str1 + " " + str2;
//		System.out.println(hw.toString());
		
		int len = hw.length();
		
		for (int i = 0; i < len; i++) {
//			System.out.println(hw.charAt(i));
		}
		
		
		String [] parts = "Extrait une sous chaîne de caractères. Attention, le second".split( " " );
		for(String str: parts)
			System.out.println(str);

		
		
	}

}
