package byui.cit260.oregontrail.control;

/*
 * Calls the testTravelTime function the TravelControlTest class.
 * This function is called numerous times with different parameter values.
 */
public class RunTravelTest
{
    public static void main(String args[]) {
        TravelControlTest travelTest = new TravelControlTest();
        
        travelTest.testTravelTime(7, 250, 80);
        travelTest.testTravelTime(5, 1000, -10);
        travelTest.testTravelTime(-2, 500, 200);
        travelTest.testTravelTime(8, -10, 50);
        travelTest.testTravelTime(10, 800, 45);
        travelTest.testTravelTime(5, 800, 200);
    }
}
