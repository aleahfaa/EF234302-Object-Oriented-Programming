public class Q12Time {
    public static void main(String[] args) {
        // Test cases
        System.out.println(calculateAngle(9, 0));   // Expected output: 270
        System.out.println(calculateAngle(3, 0));   // Expected output: 90
        System.out.println(calculateAngle(18, 0));  // Expected output: 180
        System.out.println(calculateAngle(1, 0));   // Expected output: 30
        System.out.println(calculateAngle(2, 30));  // Expected output: 255
        System.out.println(calculateAngle(4, 41));  // Expected output: 254
    }
    /**
     * Calculates the angle between the hour hand and the minute hand on an analog clock.
     * @param hours The current hour (0-24).
     * @param minutes The current minute (0-60).
     * @return The angle between the hour and minute hands (in degrees).
     */
    public static int calculateAngle(int hours, int minutes) {
        // Normalize hours and minutes
        hours = hours % 12;
        minutes = minutes % 60;
        // Calculate angles
        int hourAngle = (hours * 30) + (minutes / 2); // 1 hour ≈ 30°, 1 minute ≈ 0.5°
        int minuteAngle = minutes * 6; // 1 minute ≈ 6°
        // Calculate the absolute difference between the angles
        int angle = Math.abs(hourAngle - minuteAngle);

        // Ensure the angle is between 0 and 359 (inclusive)
        angle = angle % 360;
        return angle;
    }
}