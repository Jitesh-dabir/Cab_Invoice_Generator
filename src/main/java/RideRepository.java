import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RideRepository {

    Map<String, ArrayList<Ride>> rideMap = null;

    public RideRepository() {
        this.rideMap = new HashMap<>();
    }

    public void addRide(String userId, Ride[] rides) throws CabInvoiceException {
        if (userId == null)
            throw new CabInvoiceException(CabInvoiceException.MyEXception_Type.NOT_A_VALID_USER,"Wrong user name");
        ArrayList<Ride> rideList = this.rideMap.get(userId);
        if(rideList == null) {
            this.rideMap.put(userId,new ArrayList<Ride>(Arrays.asList(rides)));
        }
    }

    public ArrayList<Ride> getRideDetails(String userId) {
        return rideMap.get(userId);
    }
}
