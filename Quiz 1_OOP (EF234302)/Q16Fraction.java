// File: Q16Fraction.java
public class Q16Fraction {
    // Properties/fields
    private int numerator;
    private int denominator;
    // Constructor
    public Q16Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }
    // Getter for numerator
    public int getNumerator() {
        return numerator;
    }
    // Getter for denominator
    public int getDenominator() {
        return denominator;
    }
    // Method to calculate the sum of two fractions
    public Q16Fraction getSum(Q16Fraction other) {
        int newNumerator = (this.numerator * other.denominator) + (other.numerator * this.denominator);
        int newDenominator = this.denominator * other.denominator;
        return new Q16Fraction(newNumerator, newDenominator);
    }
    // Method to calculate the product of two fractions
    public Q16Fraction getProduct(Q16Fraction other) {
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new Q16Fraction(newNumerator, newDenominator);
    }
    // Method to represent the fraction as a string
    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}