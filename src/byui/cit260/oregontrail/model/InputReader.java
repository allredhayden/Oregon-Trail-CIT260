package byui.cit260.oregontrail.model;

import java.util.Scanner;

public class InputReader
{
    public static String readString() {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        String value = scan.next();
        return value; 
    }
}
