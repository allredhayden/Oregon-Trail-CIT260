package byui.cit260.oregontrail.view;

import byui.cit260.oregontrail.control.*;
import byui.cit260.oregontrail.model.Months;
import byui.cit260.oregontrail.model.OregonTrail;
import byui.cit260.oregontrail.model.StartProgram;

import java.util.List;
import java.util.Scanner;


public class GeneralStoreView {
    
    private String menu =
    
"\n**** The Oregon Trail - Matt's General Store****"
+"\n     Choose an item to add to you order:       *"
+"\n     1. Oxen                           $0      *"
+"\n     2. Food                           $0      *"
+"\n     3. Clothing                       $0      *"
+"\n     4. Ammunition                     $0      *"
+"\n     5. Spare Parts                    $0      *"
+"\n            Total Bill                 $0      *"
+"\n            Total Funds                $800    *"
+"\n            Funds Remaining            $800    *"
+"\n What is you choice? (space bar to continue)   *"
+"\n***********************************************";
    
   public GeneralStoreView() {
        System.out.println(menu);
        displayGeneralStoreView();
    }
   
   public void displayGeneralStoreView() {
        boolean done = false;
        do {
            // prompt for and get players name
            String AmountOption = this.getAmountOption();
            if (AmountOption.toUpperCase().equals("Q"))
                return;
            
            // do the requested action and display the next view
            done = this.doAction(AmountOption);
        } while (!done);
    }
    
    private String getAmountOption() {
        
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
    
    private boolean doAction(String choice) {
        choice = choice.toUpperCase();
        
        switch (choice) {
        case "1 - 800": // create and start a new game
            this.selectAmount();
            break;
        default:
            System.out.println("\n*** Invalid selection *** Try again");
        }
        return false;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
