package byui.cit260.oregontrail.model;

import java.io.Serializable;

public class OregonTrail implements Serializable
{

    private static Game currentGame = null;
    private static Player player = null;
    
    // Main method.
    public static void main(String args[]) throws Throwable {
        try {
            StartProgram program = new StartProgram();
        } catch (Throwable e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    // Getters & Setters
    public static Game getCurrentGame()
    {
        return currentGame;
    }
    
    public static void setCurrentGame(Game currentGame)
    {
        OregonTrail.currentGame = currentGame;
    }
    
    public static Player getPlayer()
    {
        return player;
    }
    
    public static void setPlayer(Player player)
    {
        OregonTrail.player = player;
    }
}
