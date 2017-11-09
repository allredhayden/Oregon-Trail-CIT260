package byui.cit260.oregontrail.view;

import byui.cit260.oregontrail.control.*;
import byui.cit260.oregontrail.model.*;
import java.util.Scanner;

public class TempMenu extends View
{
    // private static String item = getItem();
    private static String item = "default";
    // private static String opponent = getOpponent();
    private static String opponent = "default";
        
    public TempMenu() {
        super("\n"
              + "\n-----------------------------------------"
              + "\n|           Temporary Menu              |"
              + "\n-----------------------------------------"
              + "\nA - Go to attack menu"
              + "\nB - Go to build menu"            
              + "\nR - Go to river encounter menu"
              + "\nT - Go to about authors menu"
              + "\nL - Go to location enounter menu"             
              + "\nZ - Quit"
              + "\n-----------------------------------------");
        super.display();
    }
    
    @Override
    public boolean doAction(String choice)
    {
        choice = choice.toUpperCase();

        switch (choice)
        {
        case "A":
            AttackView attack = new AttackView();
            break;
        case "B":
            BuildView build = new BuildView();
            break;
        case "R":
            RiverEncounterView river = new RiverEncounterView();
            break;
        case "T":
            AboutAuthorsView author = new AboutAuthorsView();
            break;
        case "L":
            LocationEncounterView location = new LocationEncounterView();            
        case "Z":
            MainMenuView mainMenuView = new MainMenuView();
        default:
            System.out.println("\n*** Invalid selection *** Try again");
        }
        return false;
    }
}
