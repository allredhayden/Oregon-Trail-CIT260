package byui.cit260.oregontrail.view;

import java.util.List;

import byui.cit260.oregontrail.control.MapControl.Pair;
import byui.cit260.oregontrail.model.*;

public class TravelView extends View {
    
    private Game game = OregonTrail.getCurrentGame();
    private Map map = game.getMap();
    private List<Pair> coordinates = game.getCoordinatePairs();
    private static int sceneIndex = 0;
    
    public TravelView() {
        super("\n"
              + "\n-----------------------------------------"
              + "\n|               Travel                   |"
              + "\n-----------------------------------------"
              + "\n1 - Begin the trail"
              + "\n2 - Continue the trail"
              + "\n3 - Return to game menu"
              + "\n4 - Quit"
              + "\n-----------------------------------------");
        super.display();
    }

    @Override
    public boolean doAction(String choice)
    {
        choice = choice.toUpperCase();

        try {
            switch (choice)
            {
            case "1":
                if (sceneIndex == 0) {
                    this.console.println("\nCongratulations. You've started a new game.");
                    map.getLocation(coordinates.get(sceneIndex).getX(),coordinates.get(sceneIndex++).getY()).getScene().setVisited(true);
                    enterScene(map.getLocation(coordinates.get(sceneIndex).getX(),coordinates.get(sceneIndex).getY()).getScene());
                }
                else {
                    this.console.println("\nYou can't start twice, silly.");
                }
                break;
            case "2":
                if (sceneIndex == 0) {
                    this.console.println("\nYou haven't started the trail yet.");
                }
                else {
                    if (sceneIndex < coordinates.size() - 1) {
                        map.getLocation(coordinates.get(sceneIndex).getX(),coordinates.get(sceneIndex++).getY()).getScene().setVisited(true);
                        
                        if (sceneIndex == coordinates.size() - 1) {
                            this.console.println("Congratulations! You've made it to Oregon."); 
                        } else {
                            enterScene(map.getLocation(coordinates.get(sceneIndex).getX(),coordinates.get(sceneIndex).getY()).getScene());
                        }
                    }
                    else {
                        this.console.println("Your journey is over, you've already made it to Oregon. Please enter 4 to quit and exit the game, or start a new one.");
                    }
                }
                break;
            case "3":
                new GameMenuView();
                break;
            case "4":
                new MainMenuView();
                break;
            default:
                this.console.println("\nInvalid selection. Please try again.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public void enterScene(Scene scene) {
        this.console.println(scene.getDescription());
        this.console.println("\n"
                + "\nH - Hunt"
                + "\nL - Loot"
                + "\nB - Build"
                + "\nT - Return to travel menu"
                + "\nZ - Go to main menu");
        
        boolean done = false;
        do {
            String value = this.getInput();
            if (value.toUpperCase().equals("Q")) {
                return;
            }
            
            done = sceneOptions(value);
        } while (!done);
    }
    
    public boolean sceneOptions(String choice)
    {
        choice = choice.toUpperCase();
        
        switch (choice)
        {
        case "H":
            new ChooseTargetView();
            break;
        case "L":
            new LootView();
            break;
        case "B":
            new BuildView();
            break;
        case "T":
            new TravelView();
            break;
        case "Z":
            new MainMenuView();
        default:
            ErrorView.display(this.getClass().getName(), "\nInvalid selection. Please try again.");
        }
        return true;
    }
    
    public static void setSceneIndex(int sceneIndex) {
        TravelView.sceneIndex = sceneIndex;
    }
}
