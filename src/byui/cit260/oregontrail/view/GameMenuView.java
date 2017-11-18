package byui.cit260.oregontrail.view;

import byui.cit260.oregontrail.control.GameControl;
import byui.cit260.oregontrail.model.MainMenu;
import byui.cit260.oregontrail.model.Game;
import byui.cit260.oregontrail.model.Location;
import byui.cit260.oregontrail.model.Map;
import byui.cit260.oregontrail.model.Scene;

public class GameMenuView extends View {
    
    public GameMenuView() {
        super("\n"
              + "\n-----------------------------------------"
              + "\n|              Game Menu                 |"
              + "\n-----------------------------------------"
              + "\nV - View Map"
              + "\nI - View List of items in inventory"
              + "\nA - View list of actors"
              + "\nS - View ship status"
              + "\nL - View contents of location"
              + "\nM - Move person to new location"
              + "\nE - Estimate the resource needed"
              + "\nB - Design barrels"
              + "\nC - Construct tools"
              + "\nR - Harvest resource"
              + "\nD - Deliver resoruce"
              + "\nW - Work on ship"
              + "\nP - Pack ship"
              + "\nJ - Launch ship"
              + "\nH - Help"
              + "\nT - Go to temp menu"
              + "\nX - Calculate min, max & sum of actor money"                
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
        case "V":
            displayMap();
            break;
        case "I":
            System.out.print("\nView list of items option selected.\n");
            break;
        case "A":
            System.out.print("\nView list of actors option selected.\n");
            break;
        case "S":
            System.out.print("\nView ship status option selected.\n");
            break;
        case "L":
            System.out.print("\nView contents of location selected.\n");
            break;
        case "M":
            System.out.print("\nMove person to new location option selected.\n");
            break;
        case "E":
            System.out.print("\nEstimate the resource needed option selected.\n");
            break;
        case "B":
            System.out.print("\nDesign barrels option selected.\n");
            break;
        case "C":
            System.out.print("\nConstruct tools option selected.\n");
            break;
        case "R":
            System.out.print("\nHarvest resource option selected.\n");
            break;
        case "D":
            System.out.print("\nDeliver resource option selected.\n");
            break;
        case "W":
            System.out.print("\nWork on ship option selected.\n");
            break;
        case "P":
            System.out.print("\nPack ship option selected.\n");
            break;
        case "J":
            System.out.print("\nLaunch ship option selected.\n");
            break;
        case "H":
            System.out.print("\nHelp option selected.\n");
            break;
        case "T":
            TempMenu temp = new TempMenu();
            break;
        case "X":
            GameControl.visitCalc();
            break;
        case "Z":
            MainMenuView mainMenuView = new MainMenuView();
            break;
        default:
            System.out.println("\n*** Invalid selection *** Try again");
        }
        return false;
    }
    
    public void displayMap() {
        Game game = MainMenu.getGame();
        Location[][] location = Map.getLocations();
        
        System.out.println("              Land of the Bountiful               ");
        
        // Rows
        for (int i = 0; i < location.length + 1; i++) {
            
            if (i == 0) {
                System.out.print("    ");
            }
            for (int x = 0; x <= 9; x++) {
                System.out.print(x + 1 + "    ");
            }
            System.out.println("");
            
            if (i != 0) {
                System.out.print(i);
                
                for (int x = 0; x <= 9; x++) {
                    System.out.println(i + " : " + x);
                    System.out.println(location[i-1][x]);                   
                    System.out.print(location[i-1][x].getScene().getSymbol() + "|    ");
                }
            }
        }
        System.out.println("\n--------------------------------------------------");
    }
}
