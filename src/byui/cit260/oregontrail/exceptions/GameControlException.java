package byui.cit260.oregontrail.exceptions;

@SuppressWarnings("serial")
public class GameControlException extends Exception {
    
    public GameControlException() {
    }
    
    public GameControlException(String message) {
        super(message);
        System.err.println(message);
    }
    
    public GameControlException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public GameControlException(Throwable cause) {
        super(cause);
        cause.printStackTrace();
    }
}
