package fraction;

public class Fraction {
	
	private int numerator;
	private int denominator;
	
	
	
	public Fraction(int numerator, int denominator) {
		if(denominator == 0) {
			throw new IllegalArgumentException(
					"Denominator cannot be equal to 0");
		}
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	public Fraction sum(Fraction f) {
		int numerator = this.numerator + f.getNumerator();
		int denominator = this.denominator + f.getDenominator();
		
		return new Fraction(numerator, denominator);
	}
	
	public Fraction sub(Fraction f) {
		int numerator = this.numerator - f.getNumerator();
		int denominator = this.denominator - f.getDenominator();
		
		return new Fraction(numerator, denominator);
	}
	
	public Fraction mult(Fraction f) {
		int numerator = this.numerator * f.getNumerator();
		int denominator = this.denominator * f.getDenominator();
		
		return new Fraction(numerator, denominator);		
	}
	
	public Fraction div(Fraction f) {
		int numerator = this.numerator / f.getNumerator();
		int denominator = this.denominator / f.getDenominator();
		
		return new Fraction(numerator, denominator);		
	}
	
	public boolean equals(Object o) {
		if(!(o instanceof Fraction)) return false;
		
		Fraction f = (Fraction)o;
		return (this.numerator == f.getNumerator()
				&& this.denominator == f.getDenominator());
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
		this.denominator = denominator;
	}
	
	
}
