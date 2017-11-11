package byui.cit260.oregontrail.view;

import byui.cit260.oregontrail.control.*;
import byui.cit260.oregontrail.model.*;
import java.util.Scanner;


public class ChooseTargetView extends View {
    
    String enemy1 = "Buffalo";
    String enemy2 = "Rabbit";
    String enemy3 = "Bobcat";
    String enemy4 = "Elk";
    String enemy5 = "Bear";
    
    public ChooseTargetView() {
        super("\n"
              + "\n-----------------------------------------"
              + "\n|                Choose Target                    |"
              + "\n-----------------------------------------");
        System.out.println(
                "\n1 - Target " + enemy1 + ".               "
              + "\n2 - Target " + enemy2 + ".               "            
              + "\n3 - Target " + enemy3 + ".               "
              + "\n4 - Target " + enemy4 + ".               "
              + "\n5 - Target " + enemy5 + ".               "                      
              + "\n6 - Quit                                 "
              + "\n-----------------------------------------");
        super.display();
    }
    

    @Override
    public boolean doAction(String choice)
    {
        choice = choice.toUpperCase();

        switch (choice)
        {
        case "1":
            System.out.print("\nBuffalo has been targeted.\n");
            AttackView attack = new AttackView(enemy1);
            break;
        case "2":
            System.out.println("\nRabbit has been targeted.\n");
            AttackView attack2 = new AttackView(enemy2);
            break;
        case "3":
            System.out.println("\nBobcat has been targeted.\n");
            AttackView attack3 = new AttackView(enemy3);
            break;
        case "4":
            System.out.println("\nElk has been targeted.\n");
            AttackView attack4 = new AttackView(enemy4);
            break;
        case "5":
            System.out.println("\nBear has been targeted.\n");
            AttackView attack5 = new AttackView(enemy5);
            break;
        case "6":
            MainMenuView mainMenuView = new MainMenuView();
        default:
            System.out.println("\n*** Invalid selection *** Try again\n");
        }
        return false;
    }
}
