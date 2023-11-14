// File: Q15WeightTest.java
public class Q15WeightTest {
    public static void main(String[] args) {
        // Creating a Q15Weight instance with 10 pounds
        Q15Weight weight = new Q15Weight(10);
        // Getting the weight in pounds and kilograms
        double pounds = weight.getPounds();
        double kilograms = weight.getKilograms();
        // Printing the results
        System.out.println("Weight in pounds: " + pounds);
        System.out.println("Weight in kilograms: " + kilograms);
    }
}