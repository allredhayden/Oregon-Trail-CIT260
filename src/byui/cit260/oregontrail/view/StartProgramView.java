package byui.cit260.oregontrail.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import byui.cit260.oregontrail.control.GameControl;
import byui.cit260.oregontrail.model.*;

public class StartProgramView
{
    @SuppressWarnings("unused")
    MainMenuView mainMenu = null;
    
    static InputReader reader = new InputReader();
    
    public StartProgramView() {
        displayWelcome();
        displayBanner();
        
//        Player playerOne = new Player();
        String name = requestPlayerName(); // Read player name, assign to variable 'name'.
        doAction(name);
       
     
        System.out.println("\nType 1 to begin. To exit, type anything else.");

////         If '1', construct MainMenuView, which displays the Main Menu.
//        int answer = readAnswer();
//        
//        if (answer == 1) { 
//            mainMenu = new MainMenuView();
//            }
//        else {
//            quit();
//            }
    }
    
    private boolean doAction(String playersName) {
        if (playersName.length() < 2) {
            System.out.println("\nInvalid players name: "
                    + "The name must be greater than one character in length");
            return false;
        }
        Player player = GameControl.createPlayer(playersName);  // Create player object.
        if (player == null) {
            System.out.println("\nError creating the player.");
            return false;            
        }
        this.displayNextView(player);
        return true;
    }
    
    private void displayNextView(Player player) {
        System.out.println("\n======================================"
                          + "\n Welcome to the game " + player.getPlayerName()
                          + "\n We hope you have a lot of fun!"
                          + "\n======================================"
                          );
       MainMenuView mainMenuView = new MainMenuView();
    }
    
    public static String requestPlayerName() {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        
        while (!valid) {
            System.out.println("\n");
            promptMessage();
        
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
    
    public static void promptMessage() {
        System.out.println("Please enter your name:");
    }
//        System.out.println("Please enter your name:");
//        String name = reader.readString();
//        return name;
    
    public static void displayWelcome() {
        System.out.println("Welcome to the Oregon Trail.");
    }
    
    public static void displayBanner() {
        System.out.println(
                  "\n********************************************************"
                + "\n                                                        "
                + "\n This is the game of Curious Workmanship                "
                + "\n In this game you will help Nephi build a               "
                + "\n ship of curious workmanship to travel to               "
                + "\n the promised land.                                     "
                + "\n                                                        "
                + "\n You and your family will need to first                 "
                + "\n plan for your trip determining and                     "
                + "\n estimating the amount of resources                     "
                + "\n needed for the trip. Then you will have                "
                + "\n to go out and search for and harvest                   "
                + "\n the needed resources and deliver them                  "
                + "\n to the warehouse where you will store                  "
                + "\n then until the ship is completed. Then                 "
                + "\n You will also need to build the ship,                  "
                + "\n load the ship and then set sail for                    "
                + "\n the promised land. You will first need                 "
                + "\n to find the resources and manufacture the              "
                + "\n tools needed to build the ship.                        "
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
