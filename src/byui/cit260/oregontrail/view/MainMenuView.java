package byui.cit260.oregontrail.view;

import byui.cit260.oregontrail.control.*;
import byui.cit260.oregontrail.model.MainMenu;
import byui.cit260.oregontrail.model.OregonTrail;
import byui.cit260.oregontrail.model.StartProgram;

import java.util.List;
import java.util.Scanner;

public class MainMenuView
{
    private String menu;
    
    public MainMenuView() {
        this.menu = "\n"
                  + "\n-----------------------------------------"
                  + "\n | Main Menu                            |"
                  + "\n-----------------------------------------"
                  + "\nN - Start new game"
                  + "\nG - Get and start saved game"
                  + "\nH - Get help on how to play the game"
                  + "\nS - Save game"
                  + "\nQ - Quit"
                  + "\n-----------------------------------------";
    }
    
    public void displayMainMenuView() {
        boolean done = false;
        do {
            // prompt for and get players name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q"))
                return;
            
            // do the requested action and display the next view
            done = this.doAction(menuOption);
        } while (!done);
    }
    
    private String getMenuOption() {
        
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        
        while (!valid) {
            System.out.println("\nPlease enter a value: ");
            
        value = keyboard.nextLine();
        value = value.trim();
        
        if (value.length() < 1) {
            System.out.println("\nInvalid value: value can not be blank");
            continue;
            }
        
            break; // end the loop
        }
        
        return value;
    }
    
    private boolean doAction(String choice) {
        choice = choice.toUpperCase();
        
        switch (choice) {
        case "N": // create and start a new game
            this.startNewGame();
            break;
        case "G":
            this.startExistingGame();
            break;
        case "H":
            this.displayHelpMenu();
            break;
        case "S":
            this.saveGame();
            break;
        default:
            System.out.println("\n*** Invalid selection *** Try again");
        }
        return false;
    }
    
    private void startNewGame() {
        // create a new game
        GameControl.createNewGame(OregonTrail.getPlayer());
        
        // display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }
    
    private void startExistingGame() {
        System.out.println("*** startExistingGame function called ***");
    }
    
    private void saveGame() {
        System.out.println("*** startExistingGame function called ***");
    }
    
    private void displayHelpMenu() {
        System.out.println("*** displayHelpMenu function called ***");
    }
//    private MainMenu menu = new MainMenu();
//    SetupView setup = null;
//    
//    // Default constructor. Displays menu, prompts for choice.
//    public MainMenuView() {
//        displayMenu();
//        int answer = StartProgramView.readAnswer();
//        
//        // If '1', construct SetupView, which displays next three prompts.
//        if (1 == answer) {
//            setup = new SetupView();
//        }
//        else if (2 == answer) {
//            StartProgramView.displayBanner();
//            MainMenuView menu = new MainMenuView(); // Review this code later.
//        }
//        else {
//            StartProgramView.quit();
//        }
//    }
//    
//    public void displayMenu() {
//        List<String> menuOptions = menu.getMenuOptions();
//        
//        for (int i = 0; i < menuOptions.size(); i++) {
//            System.out.println(menuOptions.get(i));
//        }
//    }
}
