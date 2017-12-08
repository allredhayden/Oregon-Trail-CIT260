package byui.cit260.oregontrail.view;

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
        this.console.println(
                "\n1 - Target " + enemy1 + ".               "
              + "\n2 - Target " + enemy2 + ".               "            
              + "\n3 - Target " + enemy3 + ".               "
              + "\n4 - Target " + enemy4 + ".               "
              + "\n5 - Target " + enemy5 + ".               "                      
              + "\n6 - Return to travel menu                "
              + "\n7 - Quit                                 "
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
            this.console.print("\nBuffalo has been targeted.\n");
            new AttackView(enemy1);
            break;
        case "2":
            this.console.println("\nRabbit has been targeted.\n");
            new AttackView(enemy2);
            break;
        case "3":
            this.console.println("\nBobcat has been targeted.\n");
            new AttackView(enemy3);
            break;
        case "4":
            this.console.println("\nElk has been targeted.\n");
            new AttackView(enemy4);
            break;
        case "5":
            this.console.println("\nBear has been targeted.\n");
            new AttackView(enemy5);
            break;
        case "6":
            new TravelView();
            break;            
        case "7":
            new MainMenuView();
        default:
            ErrorView.display(this.getClass().getName(), "\n*Invalid selection. Please try again.\n");
        }
        return false;
    }
}
