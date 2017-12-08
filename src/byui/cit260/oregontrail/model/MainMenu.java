package byui.cit260.oregontrail.model;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

@SuppressWarnings("serial")
public class MainMenu implements Serializable
{
    private static Game game;
    
    // Create list of menu options.
    private static List<String> menuOptions = new ArrayList<>();
    static {
        menuOptions.add("1. Travel the trail");
        menuOptions.add("2. Learn about the trail");
        menuOptions.add("3. Quit");
    }
    
    public List<String> getMenuOptions() {
        return menuOptions;
    }
    
    public static Game getGame() {
        return game;
    }

    public static void setGame(Game game) {
        MainMenu.game = game;
    }
}
