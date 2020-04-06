import org.junit.Assert;
import org.junit.Test;

public class CabInvoiceGeneratorTest {

    //CREATE OBJECT OF MAIN CLASS
    CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();

    @Test
    public void givenDistanceAndTime_InvoiceGeneratorGenerateFare_ShouldReturnTotalFareForJourney() {
        int time = 20;
        double distance = 20.0;
        Ride[] rides = {new Ride(2.0, 5)};
        double totalFare = cabInvoiceGenerator.getTotalFare(rides);
        Assert.assertEquals(25, totalFare, 0);
    }

    @Test
    public void givenDistanceAndTime_InvoiceGeneratorGenerateFare_ShouldReturnMinimumFareForJourney() {
        int time = 3;
        double distance = 0.1;
        Ride[] rides = {new Ride(distance, time)};
        double totalFare = cabInvoiceGenerator.getTotalFare(rides);
        Assert.assertEquals(5, totalFare, 0);
    }

    @Test
    public void givenDistanceAndTime_InvoiceGeneratorGenerateFareForMultipleRides_ShouldReturnTotalFareForJourney() {
        Ride[] rides = {new Ride(2.0, 5),
                new Ride(0.1, 1)};
        double totalFare = cabInvoiceGenerator.getTotalFare(rides);
        Assert.assertEquals(5, totalFare, 0);
    }
}