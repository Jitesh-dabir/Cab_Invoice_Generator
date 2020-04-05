public class CabInvoiceGenerator {

    //CONSTANTS
    private static final double COST_PER_KILOMETER = 10;
    private static final int COST_PER_MINUTE = 1;
    private static final int MINIMUM_FARE = 5;

    public static void main(String[] args) {
        System.out.println("Welcome to cab invoice generator");
    }

    //METHOD TO GET TOTAL FARE FOR JOURNEY
    public double getTotalFare(double distanceInKiloMeter, int travelPerMinute) {
        double totalFare = distanceInKiloMeter * COST_PER_KILOMETER + travelPerMinute * COST_PER_MINUTE;
        return Math.max(MINIMUM_FARE,totalFare);
    }
}