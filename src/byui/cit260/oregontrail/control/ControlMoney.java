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
public class ControlMoney implements Serializable
{

    public double calcFundsInHand(double currentAmount, int numberItemsSold, double itemCost, double purchaseTotal)
    {
        int capacity = 200;
        double endBalance = (currentAmount - (numberItemsSold * itemCost));
        
        if (currentAmount < 0 || purchaseTotal > currentAmount) {
            System.out.println("You don't have enough money, beat it!");
            return endBalance;
        }
        else if (numberItemsSold > capacity) {
            System.out.println("You can't carry that much");
            return endBalance;
        }
        else if (numberItemsSold < 0) {
            System.out.println("This is a store not a trading post!");
            return endBalance;
        }
        else if (endBalance < 0) {
            System.out.println("You cannot have a negative ending balance.");
            return endBalance;
        }
        else {
            System.out.println("No errors!");
            return endBalance;
        }
    }
}