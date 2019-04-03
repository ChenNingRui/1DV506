package nc222cv_assign3;

public class Fraction {
	private int numerator;
	private int denominator;
	
	public Fraction (int numerator, int denominator) {	
		reduceFraction(numerator, denominator);
	}

	private void reduceFraction(int numerator, int denominator) {
		int commonFactor = 0;
		
		int smallerFactor = numerator > denominator ? denominator : numerator;
		for (int i = 1; i <= smallerFactor; i++) {
			if (numerator % i == 0 && denominator % i == 0) {
				commonFactor = i;
			}
		}
		
		if(commonFactor != 0) {
			this.numerator = numerator / commonFactor;
			this.denominator = denominator / commonFactor;
		}
	}
	
	public int getNumerator() {
		return numerator;
	}

	public int getDenominator() {
		return denominator;
	}
	
	public boolean isNegative() {	
		if(numerator < 0 && denominator < 0)
			return false;
		
		return (numerator < 0 || denominator < 0) ? true : false;
	}
	
	public Fraction add(Fraction fraction) {
		if(fraction.getDenominator() == 0 || fraction.getNumerator() == 0) {
			return this;
		}
		
		return new Fraction((fraction.getNumerator() * denominator) + (numerator * fraction.getDenominator()),
				fraction.getDenominator() * denominator);
	}
	
	public Fraction subtract(Fraction fraction) {
		if(fraction.getDenominator() == 0 || fraction.getNumerator() == 0) {
			return this;
		}
		
		return new Fraction(fraction.getNumerator() * denominator - numerator * fraction.getDenominator(),
				fraction.getNumerator() * denominator);
	}
	
	public Fraction multiply(Fraction fraction) {
		if(fraction.getDenominator() == 0 || fraction.getNumerator() == 0) {
			return new Fraction(0, 0);
		}
			
		return new Fraction(fraction.getNumerator() * numerator,
				fraction.getDenominator() * denominator);
	}
	
	public Fraction devide(Fraction fraction) {
		if(fraction.getDenominator() == 0 || fraction.getNumerator() == 0) {
			return new Fraction(0, 0);
		}
		
		return new Fraction(fraction.getNumerator() * denominator,
				fraction.getDenominator() * numerator);
	}
	
	public boolean isEqualTo(Fraction fraction) {
		return (numerator == fraction.getNumerator() && denominator == fraction.getDenominator()) ? true : false;
	}
	
	public String toString() {
		return numerator + "/" + denominator;
	}
}
