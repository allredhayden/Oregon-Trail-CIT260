package byui.cit260.oregontrail.view;

import java.util.Scanner;

import byui.cit260.oregontrail.control.GameControl;
import byui.cit260.oregontrail.model.OregonTrail;

public class HelpMenuView extends View
{
    public HelpMenuView() {
        super(
                "\n"
                  + "\n-----------------------------------------"
                  + "\n | Help Menu                            |"
                  + "\n-----------------------------------------"
                  + "\nG - What is the goal of the game?"
                  + "\nM - How to move"
                  + "\nE - Estimating the amount of resources"
                  + "\nH - Harvesting resources"
                  + "\nD - Deivering resources to warehouse"
                  + "\nZ - Quit"
                  + "\n-----------------------------------------");
        super.display();
    }
    
    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase();
        
        switch (choice) {
        case "G":
            this.console.print("\nThe goal of the game is to make it to Oregon.\n");
            break;
        case "M":
            this.console.println("To move, go to the map and select desired coordinates for your character.");
            break;
        case "E":
            this.console.println("Your estimated amount of resources is: ______"); 
            break;
        case "H":
            this.console.println("The way to harvest resources is: ______");
            break;
        case "D":
            this.console.println("The way to deliver resources to a warehouse is: ______");
            break;
        case "Z":
            this.console.println("Help menu has been called.");
            MainMenuView menu = new MainMenuView();
            break;
        default:
            ErrorView.display(this.getClass().getName(), "\n*** Invalid selection *** Try again");
        }
        return false;
    }
}
