package byui.cit260.oregontrail.control;

public class DistanceControl {
   
   public DistanceControl() {
       // default constructor
   }
   
   public void distanceTraveled() {
       
     int[] distance = new int[10];
     
     for (int i = 0; i < distance.length; i++) {
         distance[i] = i * 3;
     }
     
     int total = 0;
     
     for (int i = 0; i < distance.length; i++) {
         total = total + distance[i];
     }
     
     System.out.println("You have traveled a total of " + total + " miles");
 }
}