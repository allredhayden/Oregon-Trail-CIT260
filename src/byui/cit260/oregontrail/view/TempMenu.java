package byui.cit260.oregontrail.view;

public class TempMenu extends View
{
    // protected String item = getItem();
    protected String item = "default";
    // protected String opponent = getOpponent();
    protected String opponent = "Wolf";
        
    public TempMenu() {
        super("\n"
              + "\n-----------------------------------------"
              + "\n|           Temporary Menu              |"
              + "\n-----------------------------------------"
              + "\nA - Go to attack menu"
              + "\nB - Go to build menu"            
              + "\nR - Go to river encounter menu"
              + "\nT - Go to about authors menu"
              + "\nL - Go to location enounter menu"
              + "\nC - Go to loot menu"   
              + "\nX - Go to choose target menu"
              + "\nY - Calculate current funds after specific purchase"       
              + "\nZ - Quit"
              + "\n-----------------------------------------");
        display();
    }
    
    @Override
    public boolean doAction(String choice)
    {
        choice = choice.toUpperCase();

        switch (choice)
        {
        case "A":
            new AttackView(opponent);
            break;
        case "B":
            new BuildView();
            break;
        case "R":
            new RiverEncounterView();
            break;
        case "T":
            new AboutAuthorsView();
            break;
        case "L":
            new LocationEncounterView();
            break;
        case "C":
            new LootView();
            break;
        case "X":
            new ChooseTargetView();
            break;
        case "Y":
            new MoneyView();
            break; 
        case "Z":
            new MainMenuView();
        default:
            System.out.println("\n*** Invalid selection *** Try again");
        }
        return false;
    }
}
