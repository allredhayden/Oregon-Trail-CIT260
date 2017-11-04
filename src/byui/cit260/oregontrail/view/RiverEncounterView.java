package byui.cit260.oregontrail.view;

import byui.cit260.oregontrail.control.*;
import byui.cit260.oregontrail.model.*;
import java.util.Scanner;

public class RiverEncounterView {
    private static String riverMenu = 
                "\n"
              + "\n-----------------------------------------"
              + "\n|              River Encounter          |"
              + "\n-----------------------------------------"
              + "\nC - Caulk your wagon"
              + "\nH - Hire an Indian guide"
              + "\nF - Use a ferry to get a cross"
              + "\nZ - Quit"
              + "\n-----------------------------------------";
        
//    public RiverEncounterView() {
//            displayRiverView();
//    }

    public static void main(String args[]) {
        displayRiverView();
        String choice = getInput();
        doAction(choice);
    }
    
    private static void displayRiverView()
    {
        System.out.println(riverMenu);
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
       
       while (!valid) {
          System.out.println("\nPlease choose one of the following options:");
          value = keyboard.nextLine();
          value = value.trim();

          if (value.length() < 1) {
             System.out.println("\nInvalid value: value can not be blank.");
             continue;
          }
          break;
       }
       return value;
    }

    // Finish this later.
    private static boolean doAction(String choice)
    {
        choice = choice.toUpperCase();
        
        if (choice == "C") {
            caulkWagon();
        }
        else if (choice == "H") {
            hireGuide();
        }
        else if (choice == "F") {
            useFerry();
        }
        else {
            System.out.println("Invalid option. Choose one of the listed options.");
        }
        return false;
    }
    
    private static void caulkWagon() {
        System.out.println("caulkWagon function successfully called.");
    }
    
    private static void hireGuide() {
        System.out.println("hireGuide function successfully called.");
    }
    
    private static void useFerry() {
        System.out.println("useFerry function successfully called.");
    }
}