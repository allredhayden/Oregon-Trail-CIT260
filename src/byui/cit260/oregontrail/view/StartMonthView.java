package byui.cit260.oregontrail.view;

import byui.cit260.oregontrail.control.*;
import byui.cit260.oregontrail.model.Months;
import byui.cit260.oregontrail.model.OregonTrail;
import byui.cit260.oregontrail.model.StartProgram;

import java.util.List;
import java.util.Scanner;


public class StartMonthView extends View {
    
    private static String currentMonth = null;

    public static String getCurrentMonth() {
        return currentMonth;
    }

    public static void setCurrentMonth(String currentMonth) {
        StartMonthView.currentMonth = currentMonth;
    }
    
   public StartMonthView() {
       super(
       "\n************** The Oregon Trail ***************"
        +"\n     Choose a month to begin your journey:    *"
        +"\n     1. March                                 *"
        +"\n     2. April                                 *"
        +"\n     3. May                                   *"
        +"\n     4. June                                  *"
        +"\n     5. July                                  *"
        +"\n     6. When should I leave?                  *"
        +"\n     What is your choice?                     *"
        +"\n***********************************************");
       super.display();
    }
    
    @Override
    // Handle various input options
    public boolean doAction(String choice) {
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
    protected void selectMonth(String month) {
        currentMonth = month;
        
        System.out.println("You've selected " + month + " as your current month.");
        /* Creates instance of GeneralStoreView
         * which displays both next view & menu */
        GeneralStoreView storeView = new GeneralStoreView();  
    }
    
    // Displays advantages / disadvantages of each month
    protected void displayChoice() {
        System.out.println("If you choose March, you get this advantage."
                + "\nIf you choose April, you get this advantage."
                + "\nIf you choose May, you get this advantage."
                + "\nIf you choose June, you get this advantage."
                + "\nIf you choose July, you get this advantage.");
    }  
}