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
            System.out.print("\nThe goal of the game is to make it to Oregon.\n");
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
            System.out.println("Help menu has been called.");
            MainMenuView menu = new MainMenuView();
            break;
        default:
            System.out.println("\n*** Invalid selection *** Try again");
        }
        return false;
    }
}
