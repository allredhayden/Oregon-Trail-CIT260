package byui.cit260.oregontrail.exceptions;

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
