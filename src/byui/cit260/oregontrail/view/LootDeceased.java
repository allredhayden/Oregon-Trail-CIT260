package byui.cit260.oregontrail.view;

import byui.cit260.oregontrail.model.Game;
import byui.cit260.oregontrail.model.OregonTrail;

public class LootDeceased extends View {
    
    Game game = OregonTrail.getCurrentGame();
    
    public LootDeceased() {
        super("\n"
              + "\n-----------------------------------------"
              + "\n|          Loot Deceased                |"
              + "\n-----------------------------------------");
        this.console.println(
                "\n1 - Loot " + game.getPartyMember1().getName() + "."
              + "\n2 - Loot " + game.getPartyMember2().getName() + "."            
              + "\n3 - Loot " + game.getPartyMember3().getName() + "."
              + "\n4 - Return to travel menu                "
              + "\n5 - Quit"
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
            if (game.getPartyMember1().isDead()) {
                new LootView();
            }
            else {
                this.console.println(game.getPartyMember1().getName() + " is not dead. You cannot take this person's items.");
            }
            break;
        case "2":
            if (game.getPartyMember2().isDead()) {
                new LootView();
            }
            else {
                this.console.println(game.getPartyMember2().getName() + " is not dead. You cannot take this person's items.");
            }
            break;
        case "3":
            if (game.getPartyMember3().isDead()) {
                new LootView();
            }
            else {
                this.console.println(game.getPartyMember3().getName() + " is not dead. You cannot take this person's items.");
            }
            break;
        case "4":
            new TravelView();
            break;
        case "5":
            new MainMenuView();
            break;
        default:
            ErrorView.display(this.getClass().getName(), "\nInvalid selection. Please try again.");
        }
        return false;
    }
}
