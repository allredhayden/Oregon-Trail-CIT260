/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.control;

import java.io.Serializable;

public class ManufactureControl implements Serializable {
    
    // We will use getStrikesLeft() in the future.
    
    public int acquireResources(int strikesLeft, int resourceAmount) {
        
        int barrelsHarvested = (strikesLeft * resourceAmount);
        
        if (resourceAmount < 0) {
            System.out.println("You cannot have a negative number for amount.\n");
        }
        else if (strikesLeft < 0) {
            System.out.println("Strikes can't be negative.\n");
        }
        else if (resourceAmount > 1000) {
            System.out.println("Amount can't be above 1000.\n");
        }
        else {
            System.out.println("Congratulations! You have harvested " + barrelsHarvested + " barrels of berries.\n");
        }
        return barrelsHarvested;
    }
}