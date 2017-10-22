package byui.cit260.oregontrail.control;

/*
 * Tests the travelTime function of the TravelControl class.
 */
public class TravelControlTest
{
    public void testTravelTime(double speed, double distanceRequired, double idleTime) {
        
        TravelControl travel = new TravelControl();
        double expectedTime = (((distanceRequired/speed) * 60) + idleTime);
        
        double actualTime = travel.travelTime(speed, distanceRequired, idleTime);
        
        if (expectedTime == actualTime) {
            System.out.println("Total travel time is: " + actualTime + "\nYou have passed the test.\n");
        }
        else {
            System.out.println("You have failed the test.\n");
        }
    }
}
