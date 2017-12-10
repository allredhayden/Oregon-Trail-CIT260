package byui.cit260.oregontrail.view;
import byui.cit260.oregontrail.control.GameControl;
import byui.cit260.oregontrail.exceptions.MapControlException;
import byui.cit260.oregontrail.model.OregonTrail;

public class MainMenuView extends View {
    public MainMenuView() {
        super(
                "\n"
                    + "\n-----------------------------------------"
                    + "\n|              Main Menu                |"
                    + "\n-----------------------------------------"
                    + "\nN - Start a new game"
                    + "\nS - Save your game"
                    + "\nL - Load a saved game"
                    + "\nH - Help"
                    + "\nT - Temporary Menu (Create a new game before using this option)"      
                    + "\nM - Game Menu      (Create a new game before using this option)" 
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
        case "L":
            startExistingGame();
            break;
        case "H":
            displayHelpMenu();
            break;
        case "T":
            new TempMenu();
            break;            
        case "S":
            saveGame();
            break;
        case "M":
            new GameMenuView();
            break;
        default:
            ErrorView.display(this.getClass().getName(), "\n Invalid selection. Please try again");
        }
        return false;
    }
    
    private void startNewGame() {
        // Create a new game.
        GameControl controlGame = new GameControl();
        try {
            OregonTrail.setCurrentGame(controlGame.createNewGame());
        }
        catch (MapControlException e) {
            ErrorView.display(this.getClass().getName(), e.getMessage());
        }
    }
    
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
        new GameMenuView();
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
        new HelpMenuView();
    }
}
