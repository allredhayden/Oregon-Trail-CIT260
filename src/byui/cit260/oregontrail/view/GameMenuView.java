package byui.cit260.oregontrail.view;

import byui.cit260.oregontrail.control.GameControl;
import byui.cit260.oregontrail.model.MainMenu;
import byui.cit260.oregontrail.model.OregonTrail;
import byui.cit260.oregontrail.model.Game;
import byui.cit260.oregontrail.model.Location;
import byui.cit260.oregontrail.control.ControlYokes;
import byui.cit260.oregontrail.control.DistanceControl;

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
              + "\n1 - Count yokes"
              + "\n2 - Calculate distance traveled"                
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
            this.console.print("\nView list of items option selected.\n");
            break;
        case "A":
            this.console.print("\nView list of actors option selected.\n");
            break;
        case "S":
            this.console.print("\nView ship status option selected.\n");
            break;
        case "L":
            this.console.print("\nView contents of location selected.\n");
            break;
        case "M":
            this.console.print("\nMove person to new location option selected.\n");
            break;
        case "E":
            this.console.print("\nEstimate the resource needed option selected.\n");
            break;
        case "B":
            this.console.print("\nDesign barrels option selected.\n");
            break;
        case "C":
            this.console.print("\nConstruct tools option selected.\n");
            break;
        case "R":
            this.console.print("\nHarvest resource option selected.\n");
            break;
        case "D":
            this.console.print("\nDeliver resource option selected.\n");
            break;
        case "W":
            this.console.print("\nWork on ship option selected.\n");
            break;
        case "P":
            this.console.print("\nPack ship option selected.\n");
            break;
        case "J":
            this.console.print("\nLaunch ship option selected.\n");
            break;
        case "H":
            this.console.print("\nHelp option selected.\n");
            break;
        case "T":
            new TempMenu();
            break;
        case "X":
            GameControl.visitCalc();
            break;
        case "1":
            new ControlYokes();
            break;
        case "2":
            DistanceControl distance = new DistanceControl();
            distance.distanceTraveled();
            break;            
        case "Z":
            new MainMenuView();
            break;
        default:
            ErrorView.display(this.getClass().getName(), "\n*** Invalid selection *** Try again");
        }
        return false;
    }
    
    public void displayMap() {
        Game game = OregonTrail.getCurrentGame();
        Location[][] location = Game.map.getLocations();
        
        this.console.println("              Land of the Bountiful               ");
        
        // Rows
        for (int i = 0; i < location.length + 1; i++) {
            
            if (i == 0) {
                this.console.print("    ");
            }
            for (int x = 0; x <= 9; x++) {
                this.console.print(x + 1 + "    ");
            }
            this.console.println("");
            
            if (i != 0) {
                this.console.print(i);
                
                for (int x = 0; x <= 9; x++) {
                    this.console.println(i + " : " + x);
                    this.console.println(location[i-1][x]);                   
                    this.console.print(location[i-1][x].getScene().getSymbol() + "|    ");
                }
            }
        }
        this.console.println("\n--------------------------------------------------");
    }
}
