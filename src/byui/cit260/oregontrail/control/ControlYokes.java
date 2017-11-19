package byui.cit260.oregontrail.control;

public class ControlYokes {
    
      int[] yoke = new int[10];

    public ControlYokes() {
        createYokes();
        countYokes();
    }
    
    public void countYokes() {
        int total = 0;
        
        for (int i = 0; i < yoke.length; i++) {
            total = total + yoke[i];
        }
        
        System.out.println("\nYou have a total of " + total + " Yokes");
    }
    
    public void createYokes() {
      
      yoke[0] = 1;
      yoke[1] = 1;
      yoke[2] = 1;
      yoke[3] = 1;
      yoke[4] = 1;
      yoke[5] = 1;
      yoke[6] = 1;
      yoke[7] = 1;
      yoke[8] = 1;
      yoke[9] = 1;
    }
}
