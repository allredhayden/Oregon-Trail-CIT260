/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.control;

import java.io.Serializable;

/**
 *
 * @author blairfurner
 */
public class ManufactureControlTest {

    double requiredResources;
    double item;
    double amount;
    double noPeople;
    boolean inventoryItem;
    
    

public double manufactureItem (double requiredResources,double item, double amount, double noPeople, double inventoryItem){
           this.requiredResources = requiredResources;
           this.item = item;
           this.amount = amount;
           this.noPeople = noPeople;
           this.inventoryItem = inventoryItem;
           
        if (inventoryItem == result){
               System.out.println("You have passed the test.");
        }
        else {
        System.out.println("You have failed the test.");
        }
          
}
}