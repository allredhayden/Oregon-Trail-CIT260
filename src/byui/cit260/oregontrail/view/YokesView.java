package byui.cit260.oregontrail.view;

import java.util.Scanner;

import byui.cit260.oregontrail.control.ControlYokes;
import byui.cit260.oregontrail.exceptions.ControlYokesException;

public class YokesView extends View {
    
    private static String prompt = "\nPlease enter item number ";
    ControlYokes controlYokes;
    
    int numberInput[] = new int[10];
    
    public YokesView() {

        controlYokes = new ControlYokes();
        
        while (!controlYokes.isValid()) {
            if (!controlYokes.isValid()) {
                System.err.println("\nEach value has to be greater than zero.");
            }
            catchYokesException();
        }

        controlYokes.displayYokes();
        controlYokes.countYokes();
    }
    
    public double parseCatchDouble(String prompt) {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        double i = 0;
        
        do {
           System.out.println(prompt);
           value = keyboard.nextLine();
           value = value.trim();

           if (value.length() < 1) {
              System.err.println("\nInvalid value: value can not be blank.");
              continue;
           }
           try {
               i = Double.parseDouble(value);
           }
           catch (NumberFormatException nfe) {
               System.err.println("\nYou must enter a number.");
               i = parseCatchDouble(prompt);
               }
           catch (Throwable te) {
               i = parseCatchDouble(prompt);
               System.err.println(te.getMessage());
               }
           break;
           } while (!valid);
        return i;
    }
    
    public int parseCatchInt(String prompt) {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        int i = 0;
        
        do {
           System.out.println(prompt);
           value = keyboard.nextLine();
           value = value.trim();

           if (value.length() < 1) {
              System.err.println("\nInvalid value: value can not be blank.");
              continue;
           }
           try {
               i = Integer.parseInt(value);
           }
           catch (NumberFormatException nfe) {
               System.err.println("\nYou must enter a number.");
               i = parseCatchInt(prompt);
               }
           catch (Throwable te) {
               i = parseCatchInt(prompt);
               System.out.println(te.getMessage());
               }
           break;
           } while (!valid);
        return i;
    }
    
    public void requestContent() {
        
        do {
            numberInput[0] = parseCatchInt(prompt + "one.");
            numberInput[1] = parseCatchInt(prompt + "two.");
            numberInput[2] = parseCatchInt(prompt + "three.");
            numberInput[3] = parseCatchInt(prompt + "four.");
            numberInput[4] = parseCatchInt(prompt + "five.");
            numberInput[5] = parseCatchInt(prompt + "six.");
            numberInput[6] = parseCatchInt(prompt + "seven.");
            numberInput[7] = parseCatchInt(prompt + "eight.");
            numberInput[8] = parseCatchInt(prompt + "nine.");
            numberInput[9] = parseCatchInt(prompt + "ten.");
        }
        while (controlYokes.isValid());
    }
    
    public void catchYokesException() {
        try {
            requestContent();
            for (int i = 0; i < numberInput.length; i++) {
                controlYokes.createYokes(numberInput[i], i);
                }
        } 
        catch (ControlYokesException e) {
            System.err.println(e.getMessage() + "\n");
            requestContent();
        }
    }
}
