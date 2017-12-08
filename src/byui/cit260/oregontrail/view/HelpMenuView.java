package byui.cit260.oregontrail.view;

public class HelpMenuView extends View
{
    public HelpMenuView() {
        super(
                "\n"
                  + "\n-----------------------------------------"
                  + "\n | Help Menu                            |"
                  + "\n-----------------------------------------"
                  + "\n1 - What is the goal of the game?"
                  + "\n2 - How do begin the trail?"
                  + "\nZ - Quit"
                  + "\n-----------------------------------------");
        super.display();
    }
    
    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase();
        
        switch (choice) {
        case "1":
            this.console.print("\nThe goal of the game is to make it to Oregon.\n");
            break;
        case "2":
            this.console.println("\nTo move, go from the game menu to the travel menu, and start the trail.");
            break;
        case "Z":
            new MainMenuView();
            break;
        default:
            ErrorView.display(this.getClass().getName(), "\nInvalid selection. Please try again.");
        }
        return false;
    }
}
