package byui.cit260.oregontrail.view;

import byui.cit260.oregontrail.control.*;
import byui.cit260.oregontrail.model.*;
import java.util.Scanner;

public class RiverEncounterView extends View {
        
    public RiverEncounterView() {
        super("\n"
              + "\n-----------------------------------------"
              + "\n|              River Encounter          |"
              + "\n-----------------------------------------"
              + "\nC - Caulk your wagon"
              + "\nH - Hire an Indian guide"
              + "\nF - Use a ferry to get a cross"
              + "\nZ - Quit"
              + "\n-----------------------------------------");
        super.display();
    }
    
    @Override
    public boolean doAction(String choice)
    {
        choice = choice.toUpperCase();
        
        if ("C".equals(choice)) {
            caulkWagon();
        }
        else if ("H".equals(choice)) {
            hireGuide();
        }
        else if ("F".equals(choice)) {
            useFerry();
        }
        else if ("Z".equals(choice)) {
            MainMenuView menu = new MainMenuView();
        }
        else {
            ErrorView.display(this.getClass().getName(), "Invalid option. Choose one of the listed options.");
        }
        return false;
    }
    
    protected void caulkWagon() {
        this.console.println("caulkWagon function successfully called.");
    }
    
    protected void hireGuide() {
        this.console.println("hireGuide function successfully called.");
    }
    
    protected void useFerry() {
        this.console.println("useFerry function successfully called.");
    }
}