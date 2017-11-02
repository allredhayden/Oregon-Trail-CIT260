package byui.cit260.oregontrail.view;

import java.util.Scanner;

import byui.cit260.oregontrail.control.GameControl;
import byui.cit260.oregontrail.model.OregonTrail;

public class HelpMenuView
{
    private String helpMenu = 
                    "\n"
                  + "\n-----------------------------------------"
                  + "\n|              Help Menu                |"
                  + "\n-----------------------------------------"
                  + "\nG - What is the goal of the game?"
                  + "\nM - How to move"
                  + "\nE - Estimating the amount of resources"
                  + "\nH - Harvesting resources"
                  + "\nD - Deivering resources to warehouse"
                  + "\nZ - Quit"
                  + "\n-----------------------------------------";
    
    public HelpMenuView() {
        System.out.println(helpMenu);
        displayHelpMenuView();
    }
    
    public void displayHelpMenuView() {
        boolean done = false;
        do {
            // prompt for and get players name
            String menuOption = this.getHelpMenuOption();
            if (menuOption.toUpperCase().equals("Q"))
                return;
            
            // do the requested action and display the next view
            done = this.doAction(menuOption);
        } while (!done);
    }
    
    private String getHelpMenuOption() {
        
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
    
    // Finish this later.
    private boolean doAction(String choice) {
        choice = choice.toUpperCase();
        
        switch (choice) {
        case "G":
            System.out.print("The goal of the game is to make it to Oregon.");
            break;
        case "M":
            System.out.println("To move, go to the map and select desired coordinates for your character.");
            break;
        case "E":
            System.out.println("Your estimated amount of resources is: ______"); 
            break;
        case "H":
            System.out.println("The way to harvest resources is: ______");
            break;
        case "D":
            System.out.println("The way to deliver resources to a warehouse is: ______");
            break;
        case "Z":
            MainMenuView mainMenuView = new MainMenuView();
        default:
            System.out.println("\n*** Invalid selection *** Try again");
        }
        return false;
    }
}
