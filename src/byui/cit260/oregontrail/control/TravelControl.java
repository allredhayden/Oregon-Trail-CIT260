package byui.cit260.oregontrail.control;

/*
 * Calculates the total amount of time required to travel a certain distance in the game.
 */
public class TravelControl
{
   public double travelTime(double speed, double distanceRequired, double idleTime) {
       
       double totalTravelTime;
       
       totalTravelTime = (((distanceRequired/speed) * 60) + idleTime);
       
       if (idleTime <= 0) {
           System.out.println("You can't have a negative idle time. Value must be greater than zero.");
           return 0;
       }
       if (speed <= 0) {
           System.out.println("You won't get anywhere if you aren't moving. Speed has to be greater than zero.");
           return 0;
       }
       if (distanceRequired <= 0) {
           System.out.println("You have to have a destination other than your current location.");
           return 0;
       }
       if (speed > 10) {
           System.out.println("That wagon won't go faster than 10 mph. Speed must be below 10 mph.");
           return 0;
       }
       else {
           return (totalTravelTime);
       }
   }
}
