package byui.cit260.oregontrail.view;

import byui.cit260.oregontrail.control.*;
import byui.cit260.oregontrail.model.Months;
import byui.cit260.oregontrail.model.OregonTrail;
import byui.cit260.oregontrail.model.StartProgram;

import java.util.List;
import java.util.Scanner;


public class StartMonthView {
    
    private String menu =
    
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
    
   public StartMonthView() {
        System.out.println(menu);
        displayStartMonthView();
    }
   
   public void displayStartMonthView() {
        boolean done = false;
        do {
            // prompt for and get players name
            String monthOption = this.getMonthOption();
            if (monthOption.toUpperCase().equals("Q"))
                return;
            
            // do the requested action and display the next view
            done = this.doAction(monthOption);
        } while (!done);
    }
    
    private String getMonthOption() {
        
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
        case "1": // create and start a new game
            this.selectMarch();
            break;
        case "2":
            this.selectApril();
            break;
        case "3":
            this.selectMay();
            break;
        case "4":
            this.selectJune();
            break;
        case "5":
            this.selectJuly();
            break;
        case "6":
            this.displayChoice();
            break;
        default:
            System.out.println("\n*** Invalid selection *** Try again");
        }
        return false;
    }
    
    // Stub functions
    private void selectMarch() {
        GeneralStoreView displayGeneralStoreView = new GeneralStoreView;
       
    }
    
    private void selectApril() {
        GeneralStoreView displayGeneralStoreView = new GeneralStoreView;
    }
    
    private void selectMay() {
        GeneralStoreView displayGeneralStoreView = new GeneralStoreView;
    }
    
    private void selectJune() {
        GeneralStoreView displayGeneralStoreView = new GeneralStoreView;
    }
    private void selectJuly() {
        GeneralStoreView displayGeneralStoreView = new GeneralStoreView;
    }
    private void displayChoice() {
        displayParagraph = new displayParagraphView();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
