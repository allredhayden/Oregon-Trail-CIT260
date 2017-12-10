package byui.cit260.oregontrail.exceptions;

@SuppressWarnings("serial")
public class DistanceControlException extends Exception {
    
    public DistanceControlException() {
    }
    
    public DistanceControlException(String message) {
        super(message);
    }
    
    public DistanceControlException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public DistanceControlException(Throwable cause) {
        super(cause);
    }
}
