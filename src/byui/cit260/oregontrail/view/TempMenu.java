package byui.cit260.oregontrail.view;

import byui.cit260.oregontrail.control.*;
import byui.cit260.oregontrail.model.*;
import java.util.Scanner;

public class TempMenu extends View
{
    // protected String item = getItem();
    protected String item = "default";
    // protected String opponent = getOpponent();
    protected String opponent = "Wolf";
        
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
              + "\nC - Go to loot menu"                
              + "\nZ - Quit"
              + "\n-----------------------------------------");
        display();
    }
    
    @Override
    public boolean doAction(String choice)
    {
        choice = choice.toUpperCase();

        switch (choice)
        {
        case "A":
            AttackView attack = new AttackView(opponent);
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
            break;
        case "C":
            LootView loot = new LootView();
            break;
        case "Z":
            MainMenuView mainMenuView = new MainMenuView();
        default:
            System.out.println("\n*** Invalid selection *** Try again");
        }
        return false;
    }
}
