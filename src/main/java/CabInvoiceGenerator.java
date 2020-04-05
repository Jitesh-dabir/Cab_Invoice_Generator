public class CabInvoiceGenerator {

    //CONSTANTS
    private static final double COST_PER_KILOMETER = 10;
    private static final int COST_PER_MINUTE = 1;

    public static void main(String[] args) {
        System.out.println("Welcome to cab invoice generator");
    }

    //METHOD TO GET TOTAL FARE FOR JOURNEY
    public double getTotalFare(double distanceInKiloMeter, int travelPerMinute) {
        double totalFare = distanceInKiloMeter * COST_PER_KILOMETER + travelPerMinute * COST_PER_MINUTE;
        return totalFare;
    }
}