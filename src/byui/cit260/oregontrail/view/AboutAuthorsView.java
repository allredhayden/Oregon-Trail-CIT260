package byui.cit260.oregontrail.view;

import byui.cit260.oregontrail.control.*;
import byui.cit260.oregontrail.model.*;
import java.util.Scanner;

public class AboutAuthorsView extends View {
    
    public AboutAuthorsView() {
        super("\n"
              + "\n-----------------------------------------"
              + "\n|              About Us                |"
              + "\n-----------------------------------------"
              + "\nJ - Jeremy Alkire"
              + "\nB - Blair Furner"
              + "\nH - Hayden Alred"
              + "\nA - Allen Relthford"
              + "\nZ - Quit"
              + "\n-----------------------------------------");
        super.display();
    }

    @Override
    public boolean doAction(String choice)
    {
        choice = choice.toUpperCase();

        switch (choice)
        {
        case "J":
            System.out.print("\nHello, my name is Jeremy Alkire, and I'm pursuing a degree in CIT.\n");
            break;
        case "B":
            System.out.println("\nHi, my name is Blair Furner and I simply love long walks on beaches and stallions. I really love stallions.");
            break;
        case "H":
            System.out.println("\nHowdy folks! My name is Hayden Alred and I love to cattle wrangle and cow poke.");
            break;
        case "A":
            System.out.println("\nHello everybody! I'm Allen Relthford and I like to color outside the lines. I love gaming and movies.");
            break;
        case "Z":
            MainMenuView mainMenuView = new MainMenuView();
        default:
            System.out.println("\n*** Invalid selection *** Try again");
        }
        return false;
    }
}
