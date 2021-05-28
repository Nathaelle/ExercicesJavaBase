package models;

public class Rational {

	private int numerator;
    private int denominator;
    
    
	public Rational(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	

	@Override
	public String toString() {
		return "Rational [\n\tnumerator = " + numerator + ", \n\tdenominator = " + denominator + "\n]";
	}


	public int getNumerator() {
		return numerator;
	}
	
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}
	
	public int getDenominator() {
		return denominator;
	}
	
	public void setDenominator(int denominator) {
		if(denominator == 0) {
			throw new RuntimeException("Erreur division par 0");
		}
			
		this.denominator = denominator;
	}
    
    
    
}
