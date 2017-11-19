package byui.cit260.oregontrail.control;

/*
*This class was created to calculate how far you have travel
*/
public class DistanceControl {
    
}

public class howFarTraveled {
  public static void main(String args[]) {
      int[] distance = new int[10];
      distance[0] = 1;
      distance[1] = 1;
      distance[3] = 1;
      distance[4] = 1;
      distance[5] = 1;
      distance[6] = 1;
      distance[7] = 1;
      distance[8] = 1;
      distance[9] = 1;
      
      int total = 0;
      
      for (int i = 0; i < distance.length; i++) {
          total = total + distance[i];
      }
      
      System.out.println("You have traveled a total of " + total + "miles");
  }
}