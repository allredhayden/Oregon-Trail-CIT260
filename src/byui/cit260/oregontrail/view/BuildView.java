package byui.cit260.oregontrail.view;

import byui.cit260.oregontrail.model.Game;
import byui.cit260.oregontrail.model.OregonTrail;

public class BuildView extends View {
    Game game = OregonTrail.getCurrentGame();
    private int woodCount = game.getWood();
    
        
    public BuildView() {
        super("\n-----------------------------------------"
              + "\n|              Build                    |"
              + "\n-----------------------------------------"
              + "\nC - Build a crate"
              + "\nN - Build a wagon"            
              + "\nW - Build a wheel"
              + "\nF - Build a fire"
              + "\nT - Return to travel menu"
              + "\nZ - Quit"
              + "\n-----------------------------------------");
        this.display();
    }
    
    @Override
    public void display()
    {
        boolean done = false;
        do {
            // prompt for and get players name
            String choice = getInput();
            if (choice.toUpperCase().equals("Q"))
                return;
            
            // do the requested action and display the next view
            done = doAction(choice, woodCount);
        } while (!done);
    }
    
    @Override
    public boolean doAction(String value) {
        return true;
    }
    
    public boolean doAction(String choice, int woodCount)
    {
        choice = choice.toUpperCase();
        boolean success = false;
        
        if ("C".equals(choice)) {
            buildCrate(woodCount);
            success = true;
        }
        else if ("N".equals(choice)) {
            buildWagon(woodCount);
            success = true;            
        }
        else if ("W".equals(choice)) {
            buildWheel(woodCount);
            success = true;            
        }
        else if ("F".equals(choice)) {
            buildFire(woodCount);            
        }
        else if ("T".equals(choice)) {
            new TravelView();            
        }
        else if("Z".equals(choice)) {
            new MainMenuView();            
        }
        else {
            ErrorView.display(this.getClass().getName(), "Invalid option. Choose one of the listed options.");            
        }
        return success;
    }
    
    
    protected void buildCrate(int woodCount) {
        buildObject("Crate", woodCount);
        this.console.println("throwObject successfully called.");
    }
    protected void buildWagon(int woodCount) {
        buildObject("Wagon", woodCount);
        this.console.println("swingObject successfully called.");
    }
    protected void buildWheel(int woodCount) {
        buildObject("Wheel", woodCount);
        this.console.println("punchOpponent successfully called.");
    }
    protected void buildFire(int woodCount) {
        buildObject("Fire", woodCount);
        this.console.println("kickOpponent successfully called.");
    }
    
    protected void buildObject(String buildChoice, int numWood) {
        int requiredWood = 20;
        
        if (numWood >= requiredWood) {
            for (int i=0; i <= 100; i+=20) {
                while (requiredWood > 0) {
                    numWood-=1;
                    game.setWood(woodCount-=1);
                    requiredWood-=1;
                    if (numWood%4 == 0) {
                        this.console.println("You have " + numWood + " wood left.");
                        }
                    }
                this.console.println(buildChoice + " is " + i + "% complete.");
                }
            this.console.println("\nProject completed. You have now built a " + buildChoice);
            }
        else {
            ErrorView.display(this.getClass().getName(), "Not enough wood. You have " + game.getWood() + " wood left. "
                    + "You need " + requiredWood + " to construct a " + buildChoice + ".");
        }
        this.display();
        }
    }
