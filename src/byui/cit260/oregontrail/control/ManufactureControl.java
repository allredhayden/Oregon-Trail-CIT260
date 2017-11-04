/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.control;

import java.io.Serializable;

public class ManufactureControl implements Serializable {
    double requiredResources;
    double item;
    double amount;
    double noPeople;
    boolean inventoryItem;

    public double manufactureItem(double requiredResources,double item, double amount, double noPeople) {
           this.requiredResources = requiredResources;
           this.item = item;
           this.amount = amount;
           this.noPeople = noPeople;
           
           
        if (requiredResources < 0 || requiredResources > 1){
                System.out.println ("The value of requiredResources must be 1, cheater.");
                 return 0;
        }
        if (noPeople < 0){
                System.out.println ("You cannot have a negative number for people.");
                 return 0;
        }
          if (item < 0){
                System.out.println ("You cannot have a negative number for items."); 
                 return 0;
          
        }

        if (amount > 100){
                System.out.println ("You can't have more than 100 of an amount");                 
                 return 0;
        }
        else{
                 return 0;
        }

    }
}
