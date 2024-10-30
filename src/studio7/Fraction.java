package studio7;

public class Fraction {

	private int numerator;
	private int denominator;
	
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	
	public Fraction add(Fraction otherFraction) {
		Fraction sum = new Fraction(this.numerator*otherFraction.denominator + otherFraction.numerator*this.denominator, this.denominator*otherFraction.denominator*2);
		return sum;
	}
}
