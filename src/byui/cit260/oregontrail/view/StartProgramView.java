package byui.cit260.oregontrail.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import byui.cit260.oregontrail.model.*;

public class StartProgramView extends View
{
    MainMenuView mainMenu = null;
    
    protected static String playerName = null;
    static InputReader reader = new InputReader();
    
    public StartProgramView() {
    }
    
    @Override
    public boolean doAction(String name) {
        if (name.length() < 2) {
            ErrorView.display(this.getClass().getName(), "\nInvalid players name: "
                    + "The name must be greater than one character in length");
            return false;
        }
        playerName = name;
        displayNextView();
        return true;
    }
    
    private void displayNextView() {
        this.console.println("\n======================================"
                          + "\n Welcome to the game " + playerName
                          + "\n We hope you have a lot of fun!"
                          + "\n======================================"
                          );
       new MainMenuView();
    }
    
    public String requestPlayerName() {
        String value = "";
        boolean valid = false;
        
        while (!valid) {
            this.console.println("\n");
            promptMessage();
        
        try {
            value = keyboard.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        value = value.trim();
        
        if (value.length() < 1) {
            ErrorView.display(this.getClass().getName(), "\nInvalid value: value can not be blank");
            continue;
            }
        
            break;
        }
        
        return value;
    }
    
    public static String getPlayerName() {
        return playerName;
    }
    
    public void promptMessage() {
        this.console.println("Please enter your name:");
    }
    
    public void displayWelcome() {
        this.console.println("Welcome to the Oregon Trail.");
    }
    
    public void displayBanner() {
        this.console.println(
                  "\n********************************************************"
                + "\n                                                        "
                + "\n Hello, user. This is a short, but demonstrative game.  "
                + "\n                                                        "
                + "\n After entering your name, you can begin a new game.    "
                + "\n From there, proceed through the prompts to pick        "
                + "\n an occupation, a month, and names for your party.      "
                + "\n                                                        "
                + "\n After completing the above steps, you can buy a few    "
                + "\n starting items from the store, and from there you may  "
                + "\n continue on to the game menu.                          "
                + "\n                                                        "
                + "\n Upon reaching the game menu, you will be able to view  "
                + "\n the map, and begin traveling the trail.                "
                + "\n                                                        "
                + "\n Good luck and have fun in this adventure.              "
                + "\n                                                        "
                + "\n********************************************************"
                );
    }
    
    public static void quit() {
        System.exit(0);
    }
    
    public static int readAnswer() {
        String input = null;
        int number = 0;
        
        /*
         * InputStreamReader reads input in the form of bytes and decodes them into characters.
         * By itself, this reads data byte by byte, which is very ineffective.

         * BufferedReader puts input into a buffer in memory which allows thousands of bytes to be
         * read at once. For this reason, we wrap the InputStreamReader inside of a BufferedReader.
         */
        InputStreamReader inStream = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inStream);
        
        /* 
         * In a do-while loop, the code inside the loop is executed at least once no matter what, whether or not the loop condition is met. 
         * The condition is checked after the loop body.

         * A try statement is used to catch exceptions that might be thrown as your program executes.
         * It prevents the program from crashing if an exception occurs.
         */
        do {
            try {
                input = bufferedReader.readLine();
                number = Integer.parseInt(input);
            }
            catch (NumberFormatException ex) {
                System.out.println("You must enter a number.");
            }
            catch (IOException e) {
                e.printStackTrace(); // Traces exception, identifies where error occurred in code.
            }
        }
        while (number == 0);
        return number;
    }
}
