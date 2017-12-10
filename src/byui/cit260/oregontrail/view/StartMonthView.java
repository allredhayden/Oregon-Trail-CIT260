package byui.cit260.oregontrail.view;

import java.io.IOException;


public class StartMonthView extends View {
    
   private static String currentMonth = null;
   private static String prompt =
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
                   +"\n***********************************************";

   public StartMonthView() {
       super();
    }
   
   @Override
   public void display() {
       System.out.println(prompt);
       boolean done = false;
       do {
           String value = this.getInput();
           if (value.toUpperCase().equals("Q")) {
               return;
           }
           
           done = this.doAction(value);
       } while (!done);
   }
    
    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase();
        
        switch (choice) {
        case "1":
            selectMonth("January");
            return true;
        case "2":
            selectMonth("February");
            return true;
        case "3":
            selectMonth("March");
            return true;
        case "4":
            selectMonth("April");
            return true;
        case "5":
            selectMonth("May");
            return true;
        case "6":
            selectMonth("June");
            return true;
        case "7":
            selectMonth("July");
            return true;
        case "8":
            selectMonth("August");
            return true;
        case "9":
            selectMonth("September");
            return true;
        case "10":
            selectMonth("October");
            return true;
        case "11":
            selectMonth("November");
            return true;
        case "12":
            selectMonth("December");
            return true;
        case "13":
            displayChoice();
            break;
        default:
            ErrorView.display(this.getClass().getName(), "\nInvalid selection. Please try again.");
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
               Integer.parseInt(value);
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
    
    protected void selectMonth(String month) {
        currentMonth = month;
        this.console.println("You've selected " + month + " as your current month.");
    }
    
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
    
    public String getCurrentMonth() {
        return currentMonth;
    }

    public void setCurrentMonth(String currentMonth) {
        StartMonthView.currentMonth = currentMonth;
    }    
}