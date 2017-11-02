package byui.cit260.oregontrail.view;

import byui.cit260.oregontrail.control.*;
import byui.cit260.oregontrail.model.*;
import java.util.Scanner;

public class BuildView {
    // private static int woodCount = getWoodCount();
    private static int woodCount = 20;
    
    private static String buildMenu = 
              "\n-----------------------------------------"
              + "\n|              Build                    |"
              + "\n-----------------------------------------"
              + "\nC - Build a crate"
              + "\nN - Build a wagon"            
              + "\nW - Build a wheel"
              + "\nF - Build a fire"
              + "\nZ - Quit"
              + "\n-----------------------------------------";
        
//    public BuildView() {
//            displayBuildView();
//    }

    public static void main(String args[]) {
        displayBuildView();
    }
    
    private static void displayBuildView()
    {
        System.out.println(buildMenu);
        boolean done = false;
        do {
            // prompt for and get players name
            String choice = getInput();
            if (choice.toUpperCase().equals("Q"))
                return;
            
            // do the requested action and display the next view
            done = doAction(choice, woodCount);
        } while (!done);
    }

    private static String getInput() {
       Scanner keyboard = new Scanner(System.in);
       String value = "";
       boolean valid = false;
       
       do {
          System.out.println("\nPlease choose one of the listed options.");
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

    private static boolean doAction(String choice, int woodCount)
    {
        choice = choice.toUpperCase();
        boolean success = false;
        
        if ("C".equals(choice)) {
            buildCrate(woodCount);
            success = true;
        }
        else if ("N".equals(choice)) {
            buildWagon(woodCount);
            success = true;            
        }
        else if ("W".equals(choice)) {
            buildWheel(woodCount);
            success = true;            
        }
        else if ("F".equals(choice)) {
            buildFire(woodCount);            
        }
        else if("Z".equals(choice)) {
            MainMenuView mainMenuView = new MainMenuView();            
        }
        else {
            System.out.println("Invalid option. Choose one of the listed options.");            
        }
        return success;
    }
    
    
    private static void buildCrate(int woodCount) {
        buildObject("Crate", woodCount);
        System.out.println("throwObject successfully called.");
    }
    private static void buildWagon(int woodCount) {
        buildObject("Wagon", woodCount);
        System.out.println("swingObject successfully called.");
    }
    private static void buildWheel(int woodCount) {
        buildObject("Wheel", woodCount);
        System.out.println("punchOpponent successfully called.");
    }
    private static void buildFire(int woodCount) {
        buildObject("Fire", woodCount);
        System.out.println("kickOpponent successfully called.");
    }
    
    private static void buildObject(String buildChoice, int numWood) {
        int requiredWood = 20;
        
        if (numWood >= requiredWood) {
            for (int i=0; i <= 100; i+=20) {
                while (requiredWood > 0) {
                    numWood-=1;
                    woodCount-=1;
                    requiredWood-=1;
                    if (numWood%4 == 0) {
                        System.out.println("You have " + numWood + " wood left.");
                        }
                    }
                System.out.println(buildChoice + " is " + i + "% complete.");
                }
            System.out.println("\nProject completed. You have now built a " + buildChoice);
            }
        else {
            System.out.println("Not enough wood. You have " + woodCount + " wood left. "
                    + "You need " + requiredWood + " to construct a " + buildChoice + ".");
        }
        displayBuildView();
        }
    }
