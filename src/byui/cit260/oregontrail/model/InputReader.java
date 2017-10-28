package byui.cit260.oregontrail.model;

import java.util.Scanner;

public class InputReader
{
    public static String readString() {
        Scanner scan = new Scanner(System.in);
        String value = scan.next();
//        String value = scan.next("(\\s+?)\\n");
        return value; 
    }
}
