public class CabInvoiceException extends Exception {

    public enum MyEXception_Type {
        NOT_A_VALID_USER
    }

    MyEXception_Type type;

    public CabInvoiceException(MyEXception_Type type, String message) {
        super(message);
        this.type = type;
    }
}
