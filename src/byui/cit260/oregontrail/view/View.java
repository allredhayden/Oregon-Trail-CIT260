package byui.cit260.oregontrail.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

import byui.cit260.oregontrail.model.OregonTrail;

public abstract class View implements ViewInterface {
    
    protected String displayMessage;
    protected final BufferedReader keyboard = OregonTrail.getInFile();
    protected final PrintWriter console = OregonTrail.getOutFile();
    
    public View() {
    }
    
    public View(String message) {
        this.displayMessage = message;
        this.console.println(message);
    }
    
    @Override
    public void display() {
        
        boolean done = false;
        do {
            String value = this.getInput();
            if (value.toUpperCase().equals("Q")) {
                return;
            }
            
            done = this.doAction(value);
        } while (!done);
    }
    
    // Removed do try for Team Assignment (Week 12).
    @Override
    public String getInput() {
       String value = "";
       boolean valid = false;
       
       this.console.println("\nHit enter to submit your response:");
       
       while (!valid) {
           try {
               value = keyboard.readLine();
               value = value.trim();
               
               if (value.length() < 1) {
                   ErrorView.display(this.getClass().getName(), "\nInvalid value: value can not be blank.");
                   continue;
               }
               break;
           }
           catch (IOException e) {
               // e.printStackTrace(); // Commented out for Team Assignment (Week 12)
               ErrorView.display(this.getClass().getName(), "\nError reading input: " + e.getMessage());
           }           
       }
       return value;
    }
    
    @Override
    public boolean doAction(String value) {
        return true;
    }
}
