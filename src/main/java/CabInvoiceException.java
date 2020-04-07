public class CabInvoiceException extends Exception {

    public enum MyEXception_Type {
        NOT_A_VALID_USER, NO_SUCH_RIDE_TYPE;
    }

    MyEXception_Type type;

    public CabInvoiceException(MyEXception_Type type, String message) {
        super(message);
        this.type = type;
    }
}
