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
        +"\n     1. January                               *"
        +"\n     2. February                              *"
        +"\n     3. March                                 *"
        +"\n     4. April                                 *"
        +"\n     5. May                                   *"
        +"\n     6. June                                  *"
        +"\n     7. July                                  *"
        +"\n     8. August                                *"
        +"\n     9. September                             *"
        +"\n     10. October                              *"
        +"\n     11. November                             *"
        +"\n     12. December                             *"               
        +"\n     13. When should I leave?                 *"
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
            selectMonth("January");
            break;
        case "2":
            selectMonth("February");
            break;
        case "3":
            selectMonth("March");
            break;
        case "4":
            selectMonth("April");
            break;
        case "5":
            selectMonth("May");
            break;
        case "6":
            selectMonth("June");
            break;
        case "7":
            selectMonth("July");
            break;
        case "8":
            selectMonth("August");
            break;
        case "9":
            selectMonth("September");
            break;
        case "10":
            selectMonth("October");
            break;
        case "11":
            selectMonth("November");
            break;
        case "12":
            selectMonth("December");
            break;            
        case "13":
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
        System.out.println("\n"
                + "If you choose January, you get this disadvantage."
                + "\nIf you choose February, you get this disadvantage."
                + "\nIf you choose March, you get this disadvantage."
                + "\nIf you choose April, you get this disadvantage."
                + "\nIf you choose May, you get this disadvantage."
                + "\nIf you choose June, you get this disadvantage."
                + "\nIf you choose July, you get this disadvantage."
                + "\nIf you choose August, you get this disadvantage."
                + "\nIf you choose September, you get this disadvantage."
                + "\nIf you choose October, you get this disadvantage."
                + "\nIf you choose November, you get this disadvantage."                
                + "\nIf you choose December, you get this disadvantage.");
    }
}