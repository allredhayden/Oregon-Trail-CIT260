package byui.cit260.oregontrail.test;

import byui.cit260.oregontrail.control.ManufactureControl;
import byui.cit260.oregontrail.exceptions.ManufactureControlException;

/**
 *
 * @author blairfurner
 */
public class ManufactureControlTest {
    
    public static void main(String args[]) {
        ManufactureControl manuControl = new ManufactureControl();
        try {
            manuControl.acquireResources(1, 50);
            manuControl.acquireResources(10, -1);
            manuControl.acquireResources(-2, 50);
            manuControl.acquireResources(1, 2000);
            manuControl.acquireResources(20, 10);
            manuControl.acquireResources(8, 20);
        } 
        catch (ManufactureControlException e) {
            e.printStackTrace();
        }
    }
}
