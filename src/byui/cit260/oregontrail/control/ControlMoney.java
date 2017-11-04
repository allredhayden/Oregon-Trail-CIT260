/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.control;

import java.io.Serializable;
import byui.cit260.oregontrail.model.*;
/**
 *
 * @author Allen
 */
public class ControlMoney implements Serializable {
    /*Inventory playerInventory = new Inventory();
    int capacity = playerInventory.getCapacity();
    int numberItemsSold;
    double currentAmount;
    double itemCost;
    double purchaseTotal;
    double newAmount = (currentAmount - (numberItemsSold * itemCost));

    /**
     *
     * @param currentAmount
     * @param itemCost
     * @param purchaseTotal
     * @param numberItemsSold
     * @param newAmount
     * @return
     */
    public double calcFundsInHand(double currentAmount, double itemCost, double purchaseTotal, int numberItemsSold, double newAmount){
            int capacity = 200;
            if (currentAmount < 0 || purchaseTotal > currentAmount){
                System.out.println(" You don't have enough money, beat it!");
                return 0;
            }
            if (numberItemsSold > capacity) {
                System.out.println("You can't carry that much");
                return 0;
            }
            if (numberItemsSold < 0) {
                System.out.println("This is a store not a trading post!");
                return 0;
            }
            else {
                return(newAmount);
        }       
    }
        }