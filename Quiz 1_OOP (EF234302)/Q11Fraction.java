public class Q11Fraction {
    //fields to store the numerators (e1, e2) and denominators (d1, d2) of the fractions
    private int e1, e2, d1, d2;
    //constructor to initialize the fractions
    public Q11Fraction(int e1, int d1, int e2, int d2) {
        this.e1 = e1;
        this.d1 = d1;
        this.e2 = e2;
        this.d2 = d2;
    }
    //method to add two fractions
    public void addFractions() {
        //calculate the common denominator
        int ds = d1 * d2;
        //calculate the sum of the numerators
        int es = e1 * d2 + e2 * d1;
        //simplify the result
        simplify(es, ds);
        //print the sum of fractions
        System.out.println("Sum of fractions: " + es + "/" + ds);
    }
    //method to multiply two fractions
    public void multiplyFractions() {
        //calculate the product of the numerators and denominators separately
        int ep = e1 * e2;
        int dp = d1 * d2;
        //simplify the result
        simplify(ep, dp);
        //print the product of fractions
        System.out.println("Product of fractions: " + ep + "/" + dp);
    }
    //helper method to simplify a fraction using the greatest common divisor (GCD)
    private void simplify(int numerator, int denominator) {
        int gcd = findGCD(numerator, denominator);
        e1 = numerator / gcd;
        d1 = denominator / gcd;
    }
    //helper method to find the greatest common divisor (GCD) using Euclidean algorithm
    private int findGCD(int a, int b) {
        if (b == 0)
            return a;
        return findGCD(b, a % b);
    }
    //main method for testing
    public static void main(String[] args) {
        //test cases
        Q11Fraction fraction1 = new Q11Fraction(1, 2, 1, 3);
        Q11Fraction fraction2 = new Q11Fraction(1, 3, 3, 4);
        Q11Fraction fraction3 = new Q11Fraction(1, 2, 2, 3);
        Q11Fraction fraction4 = new Q11Fraction(1, 4, 2, 3);
        //perform operations and print results
        fraction1.addFractions();
        fraction2.addFractions();
        fraction3.multiplyFractions();
        fraction4.multiplyFractions();
    }
}