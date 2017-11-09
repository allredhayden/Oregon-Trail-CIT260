package byui.cit260.oregontrail.view;

public class GameMenuView extends View
{
    public GameMenuView() {
        super("\nProceeding to the next step in your setup.\n");
        displayMenu();
    }
    public void displayMenu() {
        SetupView setup = new SetupView();
    }
}
