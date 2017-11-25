/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.control;

import java.io.Serializable;

import byui.cit260.oregontrail.exceptions.ManufactureControlException;

public class ManufactureControl implements Serializable {
    
    boolean valid = false;

    public ManufactureControl() {
    }
    
    // We will use getStrikesLeft() in the future.
    
    public int acquireResources(int strikesLeft, int strength) throws ManufactureControlException {
        
        int barrelsHarvested = (strikesLeft * strength);
        
        if (strength < 0) {
            valid = false;
            throw new ManufactureControlException("\nYou cannot have a negative number for strength.\n");
        }
        else if (strikesLeft < 0) {
            valid = false;
            throw new ManufactureControlException("\nStrikes can't be negative.\n");
        }
        else if (strength > 1000) {
            valid = false;
            throw new ManufactureControlException("\nStrength can't be above 1000.\n");
        }
        else {
            valid = true;
            System.out.println("\nCongratulations! You have harvested " + barrelsHarvested + " barrels of berries.\n");
        }
        
        return barrelsHarvested;
    }
    
    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }    
}