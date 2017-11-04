/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.view;

import java.util.Scanner;

public class LocationEncounterView {
    
    // private static String city = getCity();
    private static String city = "Kearney";
   
    // private static String state = getState();
    private static String state = "Nebraska";
    
    // private static String weather = getWeather();
    private static String weather = "cool";
    
    // private static String health = getHealth();
    private static String health = "good";
    
    // private static String pace = getPace();
    private static String pace = "steady";
    
    // private static String date = getDate();
    private static String currentDate = "April 7, 1848";
    
    private static String locationMenu = 
                "\n"
              + "\n-----------------------------------------"
              + "\n|     Welcome to " + city + ", " + state + "     |"
              + "\n      " + currentDate
              + "\n-----------------------------------------"
              + "\n Weather: " + weather
              + "\n Health: " + health
              + "\n Pace: " + pace
              + "\n"
              + "\nC - Continue on trail"
              + "\nS - Check supplies"            
              + "\nM - Look at map"
              + "\nP - Change pace"
              + "\nR - Stop to rest"
              + "\nT - Attempt to trade"
              + "\nZ - Quit"
              + "\n-----------------------------------------";
        
//    public AttackView() {
//            displayAttackView();
//    }

    public static void main(String args[]) {
        displayLocationEncounterView();
//        String choice = getInput();
//        doAction(choice);
    }
    
    private static void displayLocationEncounterView()
    {
        System.out.println(locationMenu);
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

    private static boolean doAction(String choice)
    {
        choice = choice.toUpperCase();

        switch (choice)
        {
        case "C":
            continueOnTrail();
            break;
        case "S":
            checkSupplies();
            break;
        case "M":
            lookAtMap();
            break;
        case "P":
            changePace();
            break;
        case "R":
            stopToRest();
            break;
        case "T":
            attemptToTrade();
            break;
        case "Z":
            MainMenuView mainMenuView = new MainMenuView();
        default:
            System.out.println("\n*** Invalid selection *** Try again");
        }
        return false;
    }
    
    private static void continueOnTrail() {
        System.out.println("continueOnTrail successfully called.");
    }
    private static void checkSupplies() {
        System.out.println("checkSupplies successfully called.");
    }
    private static void lookAtMap() {
        System.out.println("lookAtMap successfully called.");
    }
    private static void changePace() {
        System.out.println("changePace successfully called.");
    }
    private static void stopToRest() {
        System.out.println("stopToRest successfully called.");
    }
    private static void attemptToTrade() {
        System.out.println("attemptToTrade successfully called.");
    }
}
