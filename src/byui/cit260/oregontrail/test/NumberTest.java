package byui.cit260.oregontrail.test;

import java.util.Scanner;

import org.junit.Test;

public class NumberTest
{
    
    public String getInput() {
       @SuppressWarnings("resource")
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
    
    public int getInteger(){
        String value = getInput();
        int intValue = -1;
        try {
            intValue = Integer.parseInt(value);
        } catch (NumberFormatException nfe){
            nfe.printStackTrace();
        }
        return intValue;
    }
    
    public double getDouble(){
        String value = getInput();
        double doubleValue = -1;
        try {
            doubleValue = Double.parseDouble(value);
        } catch (NumberFormatException nfe){
            nfe.printStackTrace();
        }
        return doubleValue;
    }
    
    
    @Test
    public void testGetInteger() {
        int intValue = getInteger();
        System.out.println("The integer is : " + intValue);
    }
}
