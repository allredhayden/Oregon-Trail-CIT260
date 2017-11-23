package byui.cit260.oregontrail.view;

import byui.cit260.oregontrail.control.MoneyControl;
import byui.cit260.oregontrail.exceptions.MoneyControlException;

import java.util.Scanner;

public class MoneyView extends View {
    
    boolean score = false;
    double currentAmount = 0;
    double newCurrencyTotal = 0;

    public MoneyView() {
        
        MoneyControl moneyControl = new MoneyControl();
        double actualMoney = GeneralStoreView.getMoney();
        
        /* Prompt for current amount of money.
         * Check for MoneyControlException. If exception thrown, user lied.
         * If user is dishonest, prompt again. If user is honest, reward 1000 silver.
         */
        
        while (score == false) {
            currentAmount = parseCatchDouble("\nPlease enter the amount of money you currently have.");
            try {
                score = moneyControl.integrityTest(currentAmount);
            } 
            catch (MoneyControlException e) {
                e.getMessage();
            }
            if (score == true) {
                System.out.println("\nCongratulations. Not only do you actually have " + actualMoney + " silver, but you also get an extra 1000 silver for your honesty.");
                
                newCurrencyTotal = GeneralStoreView.getMoney() + 1000;
                GeneralStoreView.setMoney(newCurrencyTotal);
                System.out.println("\nYour new monetary total is " + newCurrencyTotal + " silver.");
            }
        }
        
        // Prompt user for number of items they're attempting to buy. Parse string input to integer. Assign to moneyControl object.
        int numberItemsSold = parseCatchInt("\nPlease enter the number of items you're attempting to buy.");
        moneyControl.setNumItemsSold(numberItemsSold);
        
        // Prompt user for cost of a single item type. Parse string input to double. Assign to moneyControl object.
        double itemCost = parseCatchDouble("\nPlease enter the cost per item of a single type.");
        moneyControl.setCostItem(itemCost);
        
        // Calculate current funds in hand, display total purchase cost to user.
        double fundsInHand = moneyControl.calcFundsInHand(newCurrencyTotal, numberItemsSold, itemCost);
        double cost = moneyControl.getTotalPurchase();
        
        System.out.println("\nThe total cost of your attempted purchase is: " + cost + " silver.\nYou'll have " + fundsInHand + " silver left after this purchase.");
    }

    public double parseCatchDouble(String prompt) {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        double i = 0;
        
        do {
           System.out.println(prompt);
           value = keyboard.nextLine();
           value = value.trim();

           if (value.length() < 1) {
              System.err.println("\nInvalid value: value can not be blank.");
              continue;
           }
           try {
               i = Double.parseDouble(value);
           }
           catch (NumberFormatException nfe) {
               System.err.println("\nYou must enter a number.");
               i = parseCatchDouble(prompt);
               }
           catch (Throwable te) {
               i = parseCatchDouble(prompt);
               System.err.println(te.getMessage());
               }
           break;
           } while (!valid);
        return i;
    }
    
    public int parseCatchInt(String prompt) {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        int i = 0;
        
        do {
           System.out.println(prompt);
           value = keyboard.nextLine();
           value = value.trim();

           if (value.length() < 1) {
              System.err.println("\nInvalid value: value can not be blank.");
              continue;
           }
           try {
               i = Integer.parseInt(value);
           }
           catch (NumberFormatException nfe) {
               System.err.println("\nYou must enter a number.");
               i = parseCatchInt(prompt);
               }
           catch (Throwable te) {
               i = parseCatchInt(prompt);
               System.out.println(te.getMessage());
               }
           break;
           } while (!valid);
        return i;
    }   
}
