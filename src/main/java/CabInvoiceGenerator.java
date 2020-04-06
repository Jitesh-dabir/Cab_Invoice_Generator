public class CabInvoiceGenerator {

    //CONSTANTS
    private static final double COST_PER_KILOMETER = 10;
    private static final int COST_PER_MINUTE = 1;
    private static final int MINIMUM_FARE = 5;

    //VARIABLE
    double totalFare = 0;

    public static void main(String[] args) {
        System.out.println("Welcome to cab invoice generator");
    }

    public InvoiceDetails getInvoiceDetails(Ride[] rides) {
        double totalFare = getTotalFare(rides);
        return new InvoiceDetails(rides.length, totalFare);

    }

    //METHOD TO GET TOTAL FARE FOR JOURNEY
    public double getTotalFare(Ride[] rides) {
        for (Ride ride : rides) {
            totalFare = ride.distanceInKiloMeter * COST_PER_KILOMETER + ride.travelPerMinute * COST_PER_MINUTE;
        }
        return Math.max(MINIMUM_FARE, totalFare);
    }
}