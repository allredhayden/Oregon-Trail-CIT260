package byui.cit260.oregontrail.view;

import byui.cit260.oregontrail.control.DeathControl;
import byui.cit260.oregontrail.model.Game;
import byui.cit260.oregontrail.model.OregonTrail;

public class PartyView extends View
{
    private String prompt = 
            "\n" 
            + "\nR - Return to Travel Menu"
            + "\nZ - Exit to Main Menu";
        
    public PartyView() {
        super();
        displayNames();
        display();
    }

    @Override
    public void display() {
        boolean done = false;
        this.console.println(prompt);
        do {
            String choice = getInput();
            if (choice.toUpperCase().equals("Q"))
                return;
            done = doAction(choice);
        } while (!done);
    }
    
    @Override
    public boolean doAction(String choice)
    {
        choice = choice.toUpperCase();

        switch (choice)
        {
        case "R":
            new TravelView();
            break;
        case "Z":
            new MainMenuView();
        default:
            ErrorView.display(this.getClass().getName(), "\nInvalid selection. Please try again");
        }
        return false;
    }
    
    private void displayNames() {
        Game game = OregonTrail.getCurrentGame();
        this.console.println();
        this.console.println("Party member one: " + game.getPartyMember1().getName() + ".");
        this.console.println("Party member two: " + game.getPartyMember2().getName() + ".");
        this.console.println("Party member three: " + game.getPartyMember3().getName() + ".");
        
        DeathControl deathControl = new DeathControl();
        
        this.console.println();
        if (!game.getPartyMember1().isDead()) {
            deathControl.randomizeDeath(1);
        }
        
        if (!game.getPartyMember2().isDead()) {
            deathControl.randomizeDeath(2);
        }

        if (!game.getPartyMember3().isDead()) {
            deathControl.randomizeDeath(3);
        }
        
        if (game.getPartyMember1().isDead() && game.getPartyMember2().isDead() && game.getPartyMember3().isDead()) {
            this.console.println("\nAll of your companions are deceased. It seems as if you will have to continue your travels alone.");
        }
    }
}

