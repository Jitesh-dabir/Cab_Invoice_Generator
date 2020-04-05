import org.junit.Assert;
import org.junit.Test;

public class CabInvoiceGeneratorTest {

    //CREATE OBJECT OF MAIN CLASS
    CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();

    @Test
    public void givenDistanceAndTime_InvoiceGeneratorGenerateFare_ShouldReturnTotalFareForJourney() {
        double totalFare = cabInvoiceGenerator.getTotalFare(20, 20);
        Assert.assertEquals(220, totalFare, 0);
    }
}