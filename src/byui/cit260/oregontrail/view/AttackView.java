package byui.cit260.oregontrail.view;

import byui.cit260.oregontrail.control.*;
import byui.cit260.oregontrail.model.*;
import java.util.Scanner;

public class AttackView
{
    // private static String item = getItem();
    private static String item = "default";
    // private static String opponent = getOpponent();
    private static String opponent = "default";
    
    private static String attackMenu = 
                "\n"
              + "\n-----------------------------------------"
              + "\n|              Attack                   |"
              + "\n-----------------------------------------"
              + "\nT - Throw object at your opponent"
              + "\nS - Swing object at your opponent"            
              + "\nP - Punch your opponent"
              + "\nK - Kick your opponent"
              + "\nZ - Quit"
              + "\n-----------------------------------------";
        
//    public AttackView() {
//            displayAttackView();
//    }

    public static void main(String args[]) {
        displayAttackView();
//        String choice = getInput();
//        doAction(choice);
    }
    
    private static void displayAttackView()
    {
        System.out.println(attackMenu);
        boolean done = false;
        do {
            // prompt for and get players name
            String choice = getInput();
            if (choice.toUpperCase().equals("Q"))
                return;
            
            // do the requested action and display the next view
            done = doAction(choice, item, opponent);
        } while (!done);
    }

    private static String getInput() {
       Scanner keyboard = new Scanner(System.in);
       String value = "";
       boolean valid = false;
       
       do {
          System.out.println("\nPlease choose one of the following options:");
          value = keyboard.nextLine();
          value = value.trim();

          if (value.length() < 1) {
             System.out.println("\nInvalid value: value can not be blank.");
             continue;
          }
          break;
       } while (!valid);
       return value;
    }

    private static boolean doAction(String choice, String item, String opponent)
    {
        choice = choice.toUpperCase();

        switch (choice)
        {
        case "T":
            throwObject(item, opponent);
            break;
        case "S":
            swingObject(item, opponent);
            break;
        case "P":
            punchOpponent(opponent);
            break;
        case "K":
            kickOpponent(opponent);
            break;
        case "Z":
            MainMenuView mainMenuView = new MainMenuView();
        default:
            System.out.println("\n*** Invalid selection *** Try again");
        }
        return false;
    }
    
    private static void throwObject(String item, String opponent) {
        System.out.println("throwObject successfully called.");
    }
    private static void swingObject(String item, String opponent) {
        System.out.println("swingObject successfully called.");
    }
    private static void punchOpponent(String opponent) {
        System.out.println("punchOpponent successfully called.");
    }
    private static void kickOpponent(String opponent) {
        System.out.println("kickOpponent successfully called.");
    }
}
