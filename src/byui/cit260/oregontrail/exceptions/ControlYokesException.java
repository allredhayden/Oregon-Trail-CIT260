package byui.cit260.oregontrail.exceptions;

@SuppressWarnings("serial")
public class ControlYokesException extends Exception {
    
    public ControlYokesException() {
    }
    
    public ControlYokesException(String message) {
        super(message);
    }
    
    public ControlYokesException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public ControlYokesException(Throwable cause) {
        super(cause);
    }
}
