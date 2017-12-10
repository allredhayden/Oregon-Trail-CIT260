package byui.cit260.oregontrail.view;

import byui.cit260.oregontrail.model.CreatureDeathAudio;

public class AttackView extends View
{
    protected String item = "Rock";
    protected String opponent = "default";
    private CreatureDeathAudio audio = null;
    private static String path = "http://faintdev.net/rzx/sounds/splatter.wav";

    public AttackView(String enemy) {
        super("\n"
              + "\n-----------------------------------------"
              + "\n|              Attack                   |"
              + "\n-----------------------------------------"
              + "\nT - Throw object at your opponent"
              + "\nS - Swing object at your opponent"            
              + "\nP - Punch your opponent"
              + "\nK - Kick your opponent"
              + "\nR - Return to travel menu"
              + "\nZ - Quit"
              + "\n-----------------------------------------");
        opponent = enemy;        
        display();
    }
    
    @Override
    public void display() {
        boolean done = false;
        do {
            String choice = getInput();
            if (choice.toUpperCase().equals("Q"))
                return;
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
    
    private void throwObject(String item, String opponent) {
        this.console.println(item + " has successfully been thrown at " + opponent + ".");
        this.console.println("\nCongratulations. Your foe is now dead.\n");
        playDeathSound();
        new LootView();
    }
    private void swingObject(String item, String opponent) {
        this.console.println(item + " has successfully been swung at " + opponent + ".");
        this.console.println("\nCongratulations. Your foe is now dead.\n");
        playDeathSound();
        new LootView();
    }
    private void punchOpponent(String opponent) {
        this.console.println(opponent + " has successfully been punched.");
        this.console.println("\nCongratulations. Your foe is now dead.\n");
        playDeathSound();
        new LootView();
    }
    private void kickOpponent(String opponent) {
        this.console.println(opponent + " has successfully been kicked.");
        this.console.println("\nCongratulations. Your foe is now dead.\n");
        playDeathSound();
        new LootView();
    }
    
    public void playDeathSound() {
        if (audio == null) {
            audio = new CreatureDeathAudio();
        }
    }
    
    public static String getPath() {
        return path;
    }
}
