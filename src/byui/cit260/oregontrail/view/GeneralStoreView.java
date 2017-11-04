package byui.cit260.oregontrail.view;

import byui.cit260.oregontrail.control.*;
import byui.cit260.oregontrail.model.Months;
import byui.cit260.oregontrail.model.OregonTrail;
import byui.cit260.oregontrail.model.StartProgram;

import java.util.List;
import java.util.Scanner;


public class GeneralStoreView {
    
    // Need to use getMoney() later.
    public static double money = 2000;
    
    private static String menu =
    
"\n**** The Oregon Trail - Matt's General Store****"
+"\n     Choose an item to add to you order:       *"
+"\n     1. Oxen                           $0      *"
+"\n     2. Food                           $0      *"
+"\n     3. Clothing                       $0      *"
+"\n     4. Ammunition                     $0      *"
+"\n     5. Spare Parts                    $0      *"
+"\n     6. Quit                                   *"
+"\n            Total Funds                $" + money + " *"
+"\n What is you choice? (space bar to continue)   *"
+"\n***********************************************";
    
   public GeneralStoreView() {
        System.out.println(menu); // Displays menu / choices
        displayGeneralStoreView();
    }
   
   public static void displayGeneralStoreView() {
        boolean done = false;
        do {
            // Call getAmountOption, assign returned value to AmountOption variable
            String amountOption = getAmountOption();
            if (amountOption.toUpperCase().equals("Q"))
                return;
            
            // Call doAction, pass amountOption into parameters
            done = doAction(amountOption);
        } while (!done);
    }
    
   // Read input, tell user if input is invalid
    private static String getAmountOption() {
        
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        
        while (!valid) {
            System.out.println("\nPlease enter a value: ");
            
        value = keyboard.nextLine();
        value = value.trim();
        
        if (value.length() < 1) {
            System.out.println("\nInvalid value: value can not be blank");
            continue;
            }
        
            break; // end the loop
        }
        
        return value;
    }
    
    // Handle various input choices.
    private static boolean doAction(String choice) {
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
        case "6": // Quit, i.e. go to main menu.
            MainMenuView mainMenuView = new MainMenuView();
        default:
            System.out.println("\n*** Invalid selection *** Try again");
            break;            
        }
        return false;
    }
    
    // Returns item price of specified item to caller.
    private static double getItemPrice(String choice) {
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
