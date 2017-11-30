package byui.cit260.oregontrail.view;
import byui.cit260.oregontrail.control.*;
import byui.cit260.oregontrail.exceptions.MapControlException;
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
            ErrorView.display(this.getClass().getName(), "\n*** Invalid selection *** Try again");
        }
        return false;
    }
    
    private void startNewGame() {
        // create a new game
        GameControl controlGame = new GameControl();
        try {
            OregonTrail.setCurrentGame(controlGame.createNewGame());
        }
        catch (MapControlException e) {
            ErrorView.display(this.getClass().getName(), e.getMessage());
        }
    }
    
    // Stub functions
    private void startExistingGame() {
        this.console.println("\n\nEnter the file path for where your game is saved.");
        
        String filePath = this.getInput();
        
        try {
            // Start saved game.
            GameControl.getSavedGame(filePath);
        }
        catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        
        // Display the game menu.
        GameMenuView gameMenu = new GameMenuView();
    }
    
    private void saveGame() {
        this.console.println("\n\nEnter the file path for file where the game is to be saved.");
        String filePath = this.getInput();
        
        try {
            // Save the game to the specified file.
            GameControl.saveGame(OregonTrail.getCurrentGame(), filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
    }
    
    private void displayHelpMenu() {
        HelpMenuView help = new HelpMenuView();
    }
}
