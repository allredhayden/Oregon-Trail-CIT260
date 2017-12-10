package byui.cit260.oregontrail.exceptions;

@SuppressWarnings("serial")
public class MoneyControlException extends Exception {
    
    public MoneyControlException() {
    }
    
    public MoneyControlException(String message) {
        super(message);
        System.err.println(message);
    }
    
    public MoneyControlException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public MoneyControlException(Throwable cause) {
        super(cause);
    }
}
