// File: Q16FractionTest.java
public class Q16FractionTest {
    public static void main(String[] args) {
        // Creating two Q16Fraction instances
        Q16Fraction f1 = new Q16Fraction(1, 2);
        Q16Fraction f2 = new Q16Fraction(3, 7);
        // Testing toString method
        System.out.println(f1.toString());
        // Testing getProduct and getSum methods
        System.out.println(f2.getProduct(f1)); // Should print: 3/14
        System.out.println(f2.getSum(f1));    // Should print: 13/14
    }
}
