import org.junit.Assert;
import org.junit.Test;

public class CabInvoiceGeneratorTest {

    //CREATE OBJECT OF MAIN CLASS
    CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();

    @Test
    public void givenDistanceAndTime_InvoiceGeneratorGenerateFare_ShouldReturnTotalFareForJourney() {
        int time = 20;
        double distance = 20.0;
        double totalFare = cabInvoiceGenerator.getTotalFare(distance, time);
        Assert.assertEquals(220, totalFare, 0);
    }
}