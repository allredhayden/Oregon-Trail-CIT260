package byui.cit260.oregontrail.view;

import java.io.IOException;

import byui.cit260.oregontrail.control.ManufactureControl;
import byui.cit260.oregontrail.exceptions.ManufactureControlException;

public class ManufactureView extends View {
    
    int strikes = 0;
    int strength = 0;
    ManufactureControl manufactureControl;
    
    public ManufactureView() {
        
        manufactureControl = new ManufactureControl();
        promptUser();
    }
    
    public double parseCatchDouble(String prompt) {
        String value = "";
        boolean valid = false;
        double i = 0;
        
        do {
           this.console.println(prompt);
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
               i = Double.parseDouble(value);
           }
           catch (NumberFormatException nfe) {
               ErrorView.display(this.getClass().getName(), "\nYou must enter a number.");
               i = parseCatchDouble(prompt);
               }
           catch (Throwable te) {
               i = parseCatchDouble(prompt);
               ErrorView.display(this.getClass().getName(), te.getMessage());
               }
           break;
           } while (!valid);
        return i;
    }
    
    public int parseCatchInt(String prompt) {
        String value = "";
        boolean valid = false;
        int i = 0;
        
        do {
           this.console.println(prompt);
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
               i = Integer.parseInt(value);
           }
           catch (NumberFormatException nfe) {
               ErrorView.display(this.getClass().getName(), "\nYou must enter a number.");
               i = parseCatchInt(prompt);
               }
           catch (Throwable te) {
               i = parseCatchInt(prompt);
               ErrorView.display(this.getClass().getName(), te.getMessage());
               }
           break;
           } while (!valid);
        return i;
    }
    
    public void promptUser() {
        strikes = parseCatchInt("\nPlease enter the amount of strikes you intend to make: ");
        strength = parseCatchInt("\nPlease enter your character strength.");
        catchMexception();
    }
    
    public void catchMexception() {
        while (!manufactureControl.isValid()) {
            try {
                manufactureControl.acquireResources(strikes, strength);
            } catch (ManufactureControlException e) {
                ErrorView.display(this.getClass().getName(), e.getMessage());
                promptUser();
            }
        }
    }
}
