package byui.cit260.oregontrail.view;

import byui.cit260.oregontrail.control.*;
import byui.cit260.oregontrail.model.Months;
import byui.cit260.oregontrail.model.OregonTrail;
import byui.cit260.oregontrail.model.StartProgram;

import java.util.List;
import java.util.Scanner;


public class StartMonthView {
    
    private static String currentMonth = null;
    private static String menu =
    
"\n************** The Oregon Trail ***************"
+"\n     Choose a month to begin your journey:    *"
+"\n     1. March                                 *"
+"\n     2. April                                 *"
+"\n     3. May                                   *"
+"\n     4. June                                  *"
+"\n     5. July                                  *"
+"\n     6. When should I leave?                  *"
+"\n     What is your choice?                     *"
+"\n***********************************************";

//   Default constructor to be implemented later, when class
//   is connected to rest of the program
//   public StartMonthView() {
//        System.out.println(menu);
//        displayStartMonthView();
//    }
   
   public static void main(String args[]) {
       System.out.println(menu); // Displays menu / choices to user.
       displayStartMonthView();  
   }
   
   public static void displayStartMonthView() {
        boolean done = false;
        do {
            // Call getMonthOption, assign returned variable to monthOption
            String monthOption = getMonthOption();
            if (monthOption.toUpperCase().equals("Q"))
                return;
            
            // Call doAction, pass month into parameters
            done = doAction(monthOption);
        } while (!done); // Continue asking for input until doAction is complete.
    }
    
    // Get input, tell user if input is invalid
    private static String getMonthOption() {
        
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
    
    // Handle various input options
    private static boolean doAction(String choice) {
        choice = choice.toUpperCase();
        
        switch (choice) {
        case "1": // create and start a new game
            selectMonth("March");
            break;
        case "2":
            selectMonth("April");
            break;
        case "3":
            selectMonth("May");
            break;
        case "4":
            selectMonth("June");
            break;
        case "5":
            selectMonth("July");
            break;
        case "6":
            displayChoice();
            break;
        default:
            System.out.println("\n*** Invalid selection *** Try again");
        }
        return false;
    }
    
    // Selects current month, goes to next view (GeneralStoreView)
    private static void selectMonth(String month) {
        currentMonth = month;
        
        System.out.println("You've selected " + month + " as your current month.");
        /* Creates instance of GeneralStoreView
         * which displays both next view & menu */
        GeneralStoreView storeView = new GeneralStoreView();  
    }
    
    // Displays advantages / disadvantages of each month
    private static void displayChoice() {
        System.out.println("If you choose March, you get this advantage."
                + "\nIf you choose April, you get this advantage."
                + "\nIf you choose May, you get this advantage."
                + "\nIf you choose June, you get this advantage."
                + "\nIf you choose July, you get this advantage.");
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}