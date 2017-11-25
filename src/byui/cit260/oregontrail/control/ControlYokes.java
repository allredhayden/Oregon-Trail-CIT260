package byui.cit260.oregontrail.control;

import byui.cit260.oregontrail.exceptions.ControlYokesException;

public class ControlYokes {

    int[] yoke = new int[10];
    private boolean valid = false;

    public ControlYokes() {
    }

    public void createYokes(int value, int position) throws ControlYokesException {
        
        if (value <= 0) {
            valid = false;
            throw new ControlYokesException("\nEach value has to be greater than zero.");
        }
        else {
            valid = true;
        }
        
        yoke[position] = value;
    }
    
    public void countYokes() {

        int totalYokes = 0;

        for (int i = 0; i < yoke.length; i++) {
            totalYokes = totalYokes + yoke[i];
        }

        System.out.println("\nYou have a total of " + totalYokes + " Yokes");
    }
    
    public void displayYokes() {
        
        System.out.println("\nYokes list: \n");
        
        for (int i = 0; i < yoke.length; i++) {
            System.out.println(yoke[i]);
        }
    }
    
    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }    
}