package byui.cit260.oregontrail.test;

import byui.cit260.oregontrail.control.MoneyControl;

public class MoneyControlTest
{
    public static void main(String args[]) {
        MoneyControl conMoney = new MoneyControl();
        double endingBalance = 0.0;
        
        endingBalance = conMoney.calcFundsInHand(800, 3, 25);
        System.out.println("Ending balance is " + endingBalance + "\n");

        endingBalance = conMoney.calcFundsInHand(15, 1, 25);
        System.out.println("Ending balance is " + endingBalance + "\n");

        endingBalance = conMoney.calcFundsInHand(250, 5, 25);
        System.out.println("Ending balance is " + endingBalance + "\n");

        endingBalance = conMoney.calcFundsInHand(1800, 20, 100);
        System.out.println("Ending balance is " + endingBalance + "\n");
        
        endingBalance = conMoney.calcFundsInHand(2000, 1, 100);
        System.out.println("Ending balance is " + endingBalance + "\n");
        
        endingBalance = conMoney.calcFundsInHand(4000, 4, 100);
        System.out.println("Ending balance is " + endingBalance + "\n");
    }
}
