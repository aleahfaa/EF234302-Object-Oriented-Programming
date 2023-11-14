// File: Q15Weight.java
public class Q15Weight {
    // Property/field
    private double pounds;
    // Constructor
    public Q15Weight(double p) {
        this.pounds = p;
    }
    // Method to get weight in pounds
    public double getPounds() {
        return pounds;
    }
    // Method to convert and get weight in kilograms
    public double getKilograms() {
        return pounds * 0.45359237;
    }
}