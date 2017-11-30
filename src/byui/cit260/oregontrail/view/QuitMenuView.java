package byui.cit260.oregontrail.view;

import byui.cit260.oregontrail.control.*;
import byui.cit260.oregontrail.model.*;
import java.util.Scanner;


public class QuitMenuView extends View {
    
    public QuitMenuView() {
        super(
         "\n************** The Oregon Trail *******"
        +"\n     Are you sure you want to quit?   *"
        +"\n     1. Yes                           *"
        +"\n     2. No                            *"
        +"\n     What is your choice?             *"
        +"\n***************************************");
        super.display();
    }

    @Override
    public boolean doAction(String choice)
    {
        choice = choice.toUpperCase();

        switch (choice)
        {
        case "1":
            this.console.print("\nProgram is terminated!\n");
            break;
        case "2":
            MainMenuView mainMenuView = new MainMenuView();
        default:
            ErrorView.display(this.getClass().getName(), "\n*** Invalid selection *** Try again");
        }
        return false;
    }
}
