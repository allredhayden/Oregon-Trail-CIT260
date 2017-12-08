package byui.cit260.oregontrail.exceptions;

@SuppressWarnings("serial")
public class MapControlException extends Throwable {
    
    public MapControlException() {
    }
    
    public MapControlException(String message) {
        super(message);
    }
    
    public MapControlException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public MapControlException(Throwable cause) {
        super(cause);
    }
}
