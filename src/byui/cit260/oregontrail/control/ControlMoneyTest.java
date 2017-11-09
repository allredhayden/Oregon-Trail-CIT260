package byui.cit260.oregontrail.control;

public class ControlMoneyTest
{
    public static void main(String args[]) {
        ControlMoney conMoney = new ControlMoney();
        double endingBalance = 0.0;
        
        endingBalance = conMoney.calcFundsInHand(800, 3, 25, 75);
        System.out.println("Ending balance is " + endingBalance + "\n");

        endingBalance = conMoney.calcFundsInHand(15, 1, 25, -10);
        System.out.println("Ending balance is " + endingBalance + "\n");

        endingBalance = conMoney.calcFundsInHand(250, 5, 25, 250);
        System.out.println("Ending balance is " + endingBalance + "\n");

        endingBalance = conMoney.calcFundsInHand(1800, 20, 100, 2000);
        System.out.println("Ending balance is " + endingBalance + "\n");
        
        endingBalance = conMoney.calcFundsInHand(2000, 1, 100, 100);
        System.out.println("Ending balance is " + endingBalance + "\n");
        
        endingBalance = conMoney.calcFundsInHand(4000, 4, 100, 400);
        System.out.println("Ending balance is " + endingBalance + "\n");
    }
}
