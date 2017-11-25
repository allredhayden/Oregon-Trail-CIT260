package byui.cit260.oregontrail.exceptions;

public class ManufactureControlException extends Exception {
    
    public ManufactureControlException() {
    }
    
    public ManufactureControlException(String message) {
        super(message);
    }
    
    public ManufactureControlException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public ManufactureControlException(Throwable cause) {
        super(cause);
    }
}
