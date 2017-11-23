/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.control;

import java.io.Serializable;

import byui.cit260.oregontrail.exceptions.MoneyControlException;
import byui.cit260.oregontrail.model.*;
import byui.cit260.oregontrail.view.GeneralStoreView;

/**
 *
 * @author Allen
 */
public class MoneyControl implements Serializable
{
    private double amountCurrent = 0.0;
    private int numItemsSold = 0;
    private double costItem = 0.0;
    private double totalPurchase = 0.0;
    private double moneyLimit = GeneralStoreView.getMoney();
    
    public MoneyControl() {
    }

    public double calcFundsInHand(double currentAmount, int numberItemsSold, double itemCost) {
        int capacity = 200;
        double endBalance = (currentAmount - (numberItemsSold * itemCost));
        totalPurchase = numberItemsSold * itemCost;
        
        if (currentAmount < 0 || totalPurchase > currentAmount) {
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
    
    public boolean integrityTest(double response) throws MoneyControlException {
        boolean score;
        if (response > moneyLimit) {
            score = false;
            throw new MoneyControlException("Cheating attempt detected. You've entered a value that exceeds the monetary limit of " + moneyLimit + ".");
        }
        else {
            setAmountCurrent(response);
            score = true;
        }
        return score;
    }
    
    public double getAmountCurrent() {
        return amountCurrent;
    }

    public void setAmountCurrent(double amountPassed) {
        amountCurrent = amountPassed;
    }

    public int getNumItemsSold() {
        return numItemsSold;
    }

    public void setNumItemsSold(int numItemsPassed) {
        numItemsSold = numItemsPassed;
    }

    public double getCostItem() {
        return costItem;
    }

    public void setCostItem(double costPassed) {
        costItem = costPassed;
    }

    public double getTotalPurchase() {
        return totalPurchase;
    }

    public void setTotalPurchase(double totalPurchaseSet) {
        totalPurchase = totalPurchaseSet;
    }    
}