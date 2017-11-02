package byui.cit260.oregontrail.view;

import byui.cit260.oregontrail.control.*;
import byui.cit260.oregontrail.model.*;
import java.util.Scanner;

public class AboutAuthorsView
{
    private static String aboutMenu = 
                "\n"
              + "\n-----------------------------------------"
              + "\n|              About Us                |"
              + "\n-----------------------------------------"
              + "\nJ - Jeremy Alkire"
              + "\nB - Blair Furner"
              + "\nH - Hayden Alred"
              + "\nA - Allen Relthford"
              + "\nZ - Quit"
              + "\n-----------------------------------------";
        
//    public AboutUsView() {
//            displayAboutUsView();
//    }

    public static void main(String args[]) {
        displayAboutUsView();
        String choice = getInput();
        doAction(choice);
    }
    
    private static void displayAboutUsView()
    {
        System.out.println(aboutMenu);
        boolean done = false;
        do {
            // prompt for and get players name
            String choice = getInput();
            if (choice.toUpperCase().equals("Q"))
                return;
            
            // do the requested action and display the next view
            done = doAction(choice);
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

    // Finish this later.
    private static boolean doAction(String choice)
    {
        choice = choice.toUpperCase();

        switch (choice)
        {
        case "J":
            System.out.print("Hello, my name is Jeremy Alkire and I'm a tech whiz. I will be graduating from BYUI with a degree in...");
            break;
        case "B":
            System.out.println("Hi, my name is Blair Furner and I simply love long walks on beaches and stallions. I really love stallions.");
            break;
        case "H":
            System.out.println("Howdy folks! My name is Hayden Alred and I love to cattle wrangle and cow poke.");
            break;
        case "A":
            System.out.println("Hello everybody! I'm Allen Relthford and I like to color outside the lines. I love gaming and movies.");
            break;
        case "Z":
            MainMenuView mainMenuView = new MainMenuView();
        default:
            System.out.println("\n*** Invalid selection *** Try again");
        }
        return false;
    }
}
