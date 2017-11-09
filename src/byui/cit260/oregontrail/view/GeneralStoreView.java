package byui.cit260.oregontrail.view;

import byui.cit260.oregontrail.control.*;
import byui.cit260.oregontrail.model.Months;
import byui.cit260.oregontrail.model.OregonTrail;
import byui.cit260.oregontrail.model.StartProgram;

import java.util.List;
import java.util.Scanner;


public class GeneralStoreView extends View {
    
    // Need to use getMoney() later.
    public static double money = 2000;
        
   public GeneralStoreView() {
       super(
               "\n**** The Oregon Trail - Matt's General Store****"
                +"\n     Choose an item to add to you order:       *"
                +"\n     1. Oxen                           $0      *"
                +"\n     2. Food                           $0      *"
                +"\n     3. Clothing                       $0      *"
                +"\n     4. Ammunition                     $0      *"
                +"\n     5. Spare Parts                    $0      *"
                +"\n     6. Go to temporary menu                   *"            
                +"\n     7. Quit                                   *"
                +"\n            Total Funds                $" + money + " *"
                +"\n What is you choice? (space bar to continue)   *"
                +"\n***********************************************");
        super.display();
    }
   
    @Override
    public boolean doAction(String choice) {
        double price = 0;
        choice = choice.toUpperCase();
        
        switch (choice) {
        case "1":
            // Request item price, assign to 'price' variable. Tell user item price.
            price = getItemPrice("oxen");
            System.out.println("The cost of your item is " + price + ".");

            // Subtract price from money. Tell user total money left after purchase.
            money = money - price;
            System.out.println("You have " + money + " dollars left.");           
            break;
        case "2":
            price = getItemPrice("food");
            System.out.println("The cost of your item is " + price + ".");

            money = money - price;
            System.out.println("You have " + money + " dollars left.");
            break;            
        case "3":
            price = getItemPrice("clothing");
            System.out.println("The cost of your item is " + price + ".");

            money = money - price;
            System.out.println("You have " + money + " dollars left.");
            break;            
        case "4":
            price = getItemPrice("ammunition");
            System.out.println("The cost of your item is " + price + ".");      

            money = money - price;
            System.out.println("You have " + money + " dollars left.");
            break;
        case "5":
            price = getItemPrice("spareparts");
            System.out.println("The cost of your item is " + price + ".");      

            money = money - price;
            System.out.println("You have " + money + " dollars left.");
            break;
        case "6":
            TempMenu temp = new TempMenu();
            break;
        case "7":
            MainMenuView mainMenuView = new MainMenuView();
            break;            
        default:
            System.out.println("\n*** Invalid selection *** Try again");
            break;            
        }
        return false;
    }
    
    // Returns item price of specified item to caller.
    protected double getItemPrice(String choice) {
        double itemCost = 0;
        
        if (choice == "oxen") {
            itemCost = 200;
        }
        if (choice == "food") {
            itemCost = 50;
        }
        if (choice == "clothing") {
            itemCost = 15;
        }
        if (choice == "ammunition") {
            itemCost = 100;
        }
        if (choice == "spareparts") {
            itemCost = 80;
        }
        return itemCost;
    }
}
