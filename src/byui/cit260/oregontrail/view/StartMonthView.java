package byui.cit260.oregontrail.view;

import java.io.IOException;


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
            ErrorView.display(this.getClass().getName(), "\n*** Invalid selection *** Try again");
        }
        return false;
    }
    
    @Override
    public String getInput() {
        String value = "";
        boolean valid = false;
        
        do {
           this.console.println("\nPlease choose one of the menu options:");
           try {
            value = keyboard.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
           value = value.trim();

           if (value.length() < 1) {
              ErrorView.display(this.getClass().getName(), "\nInvalid value: value can not be blank.");
              continue;
           }
           try {
               int i = Integer.parseInt(value);
           }
           catch (NumberFormatException nfe) {
               ErrorView.display(this.getClass().getName(), "\nYou must enter a number.");
               }
           catch (Throwable te) {
               ErrorView.display(this.getClass().getName(), te.getMessage());
               }
           break;
           } while (!valid);
        return value;
    }
    
    // Selects current month, goes to next view (GeneralStoreView)
    protected void selectMonth(String month) {
        currentMonth = month;
        
        this.console.println("You've selected " + month + " as your current month.");
        /* Creates instance of GeneralStoreView
         * which displays both next view & menu */
        GeneralStoreView storeView = new GeneralStoreView();
    }
    
    // Displays advantages / disadvantages of each month
    protected void displayChoice() {
        this.console.println("\n"
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