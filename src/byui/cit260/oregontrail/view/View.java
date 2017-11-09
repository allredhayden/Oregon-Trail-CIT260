package byui.cit260.oregontrail.view;

import java.util.Scanner;

public abstract class View implements ViewInterface {
    
    protected String displayMessage;
    
    public View() {
    }
    
    public View(String message) {
        this.displayMessage = message;
        System.out.println(message);
    }
    
    @Override
    public void display() {
        
        boolean done = false;
        do {
            // prompt for and get players name
            String value = this.getInput();
            if (value.toUpperCase().equals("Q")) {
                return;
            }
            
            done = this.doAction(value);
        } while (!done);
    }
    
    @Override
    public String getInput() {
       Scanner keyboard = new Scanner(System.in);
       String value = "";
       boolean valid = false;
       
       do {
          System.out.println("\nPlease choose one of the following options:");
          value = keyboard.nextLine();
          value = value.trim();

          if (value.length() < 1) {
             System.out.println("\nInvalid value: value can not be blank.");
             continue;
          }
          break;
       } while (!valid);
       return value;
    }
    
    @Override
    public boolean doAction(String value) {
        return true;
    }
}
