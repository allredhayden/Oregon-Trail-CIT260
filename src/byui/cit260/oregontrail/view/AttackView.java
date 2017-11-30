package byui.cit260.oregontrail.view;

import byui.cit260.oregontrail.control.*;
import byui.cit260.oregontrail.model.*;
import java.util.Scanner;

public class AttackView extends View
{
    // protected String item = getItem();
    protected String item = "Rock";
    // protected String opponent = getOpponent();
    protected String opponent = "default";
        
    public AttackView(String enemy) {
        super("\n"
              + "\n-----------------------------------------"
              + "\n|              Attack                   |"
              + "\n-----------------------------------------"
              + "\nT - Throw object at your opponent"
              + "\nS - Swing object at your opponent"            
              + "\nP - Punch your opponent"
              + "\nK - Kick your opponent"
              + "\nZ - Quit"
              + "\n-----------------------------------------");
        opponent = enemy;        
        display();
    }
    
    @Override
    public void display() {
        boolean done = false;
        do {
            // prompt for and get players name
            String choice = getInput();
            if (choice.toUpperCase().equals("Q"))
                return;
            
            // do the requested action and display the next view
            done = doAction(choice, item, opponent);
        } while (!done);
    }
    
    @Override
    public boolean doAction(String value) {
        return true;
    }
    
    public boolean doAction(String choice, String item, String opponent)
    {
        choice = choice.toUpperCase();

        switch (choice)
        {
        case "T":
            throwObject(item, opponent);
            break;
        case "S":
            swingObject(item, opponent);
            break;
        case "P":
            punchOpponent(opponent);
            break;
        case "K":
            kickOpponent(opponent);
            break;
        case "Z":
            MainMenuView mainMenuView = new MainMenuView();
        default:
            ErrorView.display(this.getClass().getName(), "\n*** Invalid selection *** Try again");
        }
        return false;
    }
    
    private void throwObject(String item, String opponent) {
        this.console.println(item + " has successfully been thrown at " + opponent + ".");
    }
    private void swingObject(String item, String opponent) {
        this.console.println(item + " has successfully been swung at " + opponent + ".");
    }
    private void punchOpponent(String opponent) {
        this.console.println(opponent + " has successfully been punched.");
    }
    private void kickOpponent(String opponent) {
        this.console.println(opponent + " has successfully been kicked.");
    }
}
