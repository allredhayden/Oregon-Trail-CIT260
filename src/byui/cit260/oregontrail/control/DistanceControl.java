package byui.cit260.oregontrail.control;

import byui.cit260.oregontrail.exceptions.DistanceControlException;

public class DistanceControl {

    int[] distance = new int[10];
    private boolean valid = false;

    public DistanceControl() {
        // default constructor
    }

    public void populateDistance(int value, int position) throws DistanceControlException {
        
        if (value <= 0) {
            valid = false;
            throw new DistanceControlException("\nEach value has to be greater than zero.");
        }
        else {
            valid = true;
        }
        
        distance[position] = value;
    }
    
    public void distanceTraveled() {

        /* Lesson 10 individual assignment code.
        for (int i = 0; i < distance.length; i++) {
            distance[i] = i * 3;
        } */
        int total = 0;

        for (int i = 0; i < distance.length; i++) {
            total = total + distance[i];
        }

        System.out.println("\nYou have traveled a total of " + total + " miles");
    }
    
    public void displayDistance() {
        System.out.println("\nThe content of your distance array is: \n");
        for (int i = 0; i < distance.length; i++) {
            System.out.println(distance[i]);
        }
    }
    
    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }    
}