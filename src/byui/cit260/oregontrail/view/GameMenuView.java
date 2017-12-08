package byui.cit260.oregontrail.view;

import byui.cit260.oregontrail.model.Game;
import byui.cit260.oregontrail.model.Location;
import byui.cit260.oregontrail.model.OregonTrail;

public class GameMenuView extends View {
    
    private static final String LINE = "\n  ---------------------------------------------------";

    public GameMenuView() {
        super("\n"
              + "\n-----------------------------------------"
              + "\n|              Game Menu                 |"
              + "\n-----------------------------------------"
              + "\nV - View Map"
              + "\nT - Temporary Menu"
              + "\nR - Travel Menu"
              + "\nZ - Quit to Main Menu"
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
        case "T":
            new TempMenu();
            break;
        case "R":
            new TravelView();
            break;            
        case "Z":
            new MainMenuView();
            break;
        default:
            ErrorView.display(this.getClass().getName(), "\nInvalid selection. Please try again");
        }
        return false;
    }
    
    public void displayMap() {
        Game game = OregonTrail.getCurrentGame();
        Location[][] location = game.getMap().getLocations();
        
        this.console.println("              THE LAND OF THE BOUNTFIUL               \n");
        
        for (int rowNumber = 0; rowNumber < location.length + 1; rowNumber++) {
            
            if (rowNumber == 0) {
                this.console.print("    ");
                for (int x = 0; x <= 9; x++) {
                    this.console.print(x + 1 + "    "); // Print column numbers.
                }
                this.console.print(LINE);
            }
            
            if (rowNumber != 0) {
                if (rowNumber < 10) {
                    this.console.print(" ");
                }
                this.console.print(rowNumber + "|"); // Print row numbers.
                for (int colNumber = 0; colNumber <= 9; colNumber++) {
                    if (location[rowNumber-1][colNumber].getScene() != null) {
                        this.console.print(" " + location[rowNumber-1][colNumber].getScene().getSymbol() + " |"); // If scene is not null, display symbol.
                    } else {
                        this.console.print(" ?? |"); // Else, display "??"
                    }
                }
                this.console.print(LINE);
            }
            this.console.println("");
        }
    }
}
