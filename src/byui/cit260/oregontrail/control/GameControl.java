package byui.cit260.oregontrail.control;

import java.io.Serializable;

import byui.cit260.oregontrail.model.*;

public class GameControl implements Serializable
{
    private static final long serialVersionUID = 1L;

    public static Player createPlayer(String name) {
        if (name == null) {
            return null;
        }

        Player playerOne = new Player(); // Create player object.
        playerOne.setPlayerName(name); // Set player name to 'name'.
        
        OregonTrail.setPlayer(playerOne);
        
        return playerOne; // Return player object.
    }
    
    public static void createNewGame(Player player) {
        System.out.println("\n*** createNewGame stub function called ***");
    }
}
