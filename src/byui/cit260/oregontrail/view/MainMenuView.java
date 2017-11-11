package byui.cit260.oregontrail.view;

import byui.cit260.oregontrail.control.*;
import byui.cit260.oregontrail.model.MainMenu;
import byui.cit260.oregontrail.model.OregonTrail;
import byui.cit260.oregontrail.model.StartProgram;

import java.util.List;
import java.util.Scanner;

public class MainMenuView extends View {
    public MainMenuView() {
        super(
                "\n"
                    + "\n-----------------------------------------"
                    + "\n|              Main Menu                |"
                    + "\n-----------------------------------------"
                    + "\nN - Start new game"
                    + "\nG - Get and start saved game"
                    + "\nH - Get help on how to play the game"
                    + "\nS - Save game"
                    + "\nT - Go to the temporary menu"            
                    + "\nQ - Quit"
                    + "\n-----------------------------------------");
        display();
    }
        
    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase();
        
        switch (choice) {
        case "N": // create and start a new game
            startNewGame();
            break;
        case "G":
            startExistingGame();
            break;
        case "H":
            displayHelpMenu();
            break;
        case "T":
            TempMenu temp = new TempMenu();
            break;            
        case "S":
            saveGame();
            break;
        default:
            System.out.println("\n*** Invalid selection *** Try again");
        }
        return false;
    }
    
    protected void startNewGame() {
        // create a new game
        GameControl.createNewGame(OregonTrail.getPlayer());
        
        // display the game menu
        GameMenuView gameMenu = new GameMenuView();
    }
    
    // Stub functions
    protected void startExistingGame() {
        System.out.println("*** startExistingGame function called ***");
    }
    
    protected void saveGame() {
        System.out.println("*** startExistingGame function called ***");
    }
    
    protected void displayHelpMenu() {
        HelpMenuView help = new HelpMenuView();
    }
}
