package byui.cit260.oregontrail.control;

import java.io.Serializable;

import byui.cit260.oregontrail.view.*;
import byui.cit260.oregontrail.model.*;
import java.awt.Point;

public class GameControl implements Serializable
{
    private static final long serialVersionUID = 1L; 
    private static Game game;
    private static Map map;
    private static InventoryItem[] gameItems;
    private static Location[][] gameLocations;
    private static Scene[] gameScenes;
    private static Question[] gameQuestions;
    
    ControlMap mapControl = new ControlMap();

    public int createNewGame() {
        
        // Create new game.
        game = new Game();
        
        // Create player and store in Game class (model).       
        game.setPlayer(createPlayer(StartProgramView.getPlayerName()));
        
        // Create player actors, request occupation & name.
        Occupations.createActors("Default1", "Default2", "Default3");
        SetupView.requestOccupation();
        SetupView.requestName();

        // Store actor array in Game class (model).
        game.setActors(Occupations.getActors());
        
        // Create NPC actor array & item array, store in Game class (model).
        gameItems = createItems();
        game.setInventory(gameItems);
        game.setNPCActors(createActors());   
        
        // Create new map and store in Game class (model).
        if (mapControl.createMap(10, 10, gameItems) == null) {
            System.out.println("Failed to create new map.");
        }
        else {
            game.setMap(map);             
        }
        
        SetupView.requestMonth();
        
        // Store new game in MainMenu (model).
        MainMenu.setGame(game);
        
        System.out.println("\nA new game has been created.\n");
        
        return 0;
    }
    
     public static Player createPlayer(String name) {
        if (name == null) {
            return null;
        }

        Player playerOne = new Player(); // Create player object.
        playerOne.setPlayerName(name); // Set player name to 'name'.
        game.setPlayer(playerOne);
        OregonTrail.setPlayer(playerOne);
        
        return playerOne; // Return player object.
    }
    
    public static Actor[] createActors() {
        Actor[] actors = new Actor[10];
        
        // String occupation, String name, String description, Point coordinates, double money, double health
        Actor lehi = new Actor("Pioneer", "Lehi", "Lehi", new Point(1,2), 1000, 100);
        Actor sariah = new Actor("Pioneer", "Sariah", "Sariah", new Point(1,2), 1000, 100);
        Actor nephi = new Actor("Pioneer", "Nephi", "Leader of Nephites", new Point(1,2), 1000, 100);
        Actor jacob = new Actor("Pioneer", "Jacob", "Jacob", new Point(1,2), 1000, 100);
        Actor sam = new Actor("Pioneer", "Sam", "Sam", new Point(1,2), 1000, 100);
        Actor laman = new Actor("Pioneer", "Laman", "Laman", new Point(1,2), 1000, 100);
        Actor lemuel = new Actor("Pioneer", "Lemuel", "Lemuel", new Point(1,2), 1000, 100);
        Actor zoram = new Actor("Pioneer", "Zoram", "Zoram", new Point(1,2), 1000, 100);
        Actor angel = new Actor("Pioneer", "Angel", "Angel", new Point(1,2), 1000, 100);
        Actor lord = new Actor("Pioneer", "Lord", "Lord", new Point(1,2), 1000, 100);
        
        lehi = actors[ActorType.Lehi.ordinal()];
        sariah = actors[ActorType.Sariah.ordinal()];
        nephi = actors[ActorType.Nephi.ordinal()];
        jacob = actors[ActorType.Jacob.ordinal()];
        sam = actors[ActorType.Sam.ordinal()];
        laman = actors[ActorType.Laman.ordinal()];
        lemuel = actors[ActorType.Lemuel.ordinal()];
        zoram = actors[ActorType.Zoram.ordinal()];
        angel = actors[ActorType.Angel.ordinal()];
        lord = actors[ActorType.Lord.ordinal()];
        
        return actors;
    }
    
    public static InventoryItem[] createItems() {
       InventoryItem[] items = new InventoryItem[15];
       
       InventoryItem lumber = new InventoryItem("lumber", 200);
       InventoryItem ore = new InventoryItem("ore", 200);
       InventoryItem grain = new InventoryItem("grain", 200);
       InventoryItem legume = new InventoryItem("legume", 200);
       InventoryItem oil = new InventoryItem("oil", 200);
       InventoryItem water = new InventoryItem("water", 200);
       InventoryItem honey = new InventoryItem("honey", 200);
       InventoryItem salt = new InventoryItem("salt", 200);
       InventoryItem axe = new InventoryItem("axe", 200);
       InventoryItem hammer = new InventoryItem("hammer", 200);
       InventoryItem drill = new InventoryItem("drill", 200);
       InventoryItem shovel = new InventoryItem("shovel", 200);
       InventoryItem sickle = new InventoryItem("sickle", 200);
       InventoryItem saw = new InventoryItem("saw", 200);       
       InventoryItem nails = new InventoryItem("nails", 200);
       
       lumber = items[ItemType.lumber.ordinal()];
       ore = items[ItemType.ore.ordinal()];
       grain = items[ItemType.grain.ordinal()];
       legume = items[ItemType.legume.ordinal()];
       oil = items[ItemType.oil.ordinal()];
       water = items[ItemType.water.ordinal()];
       honey = items[ItemType.honey.ordinal()];
       salt = items[ItemType.salt.ordinal()];
       axe = items[ItemType.axe.ordinal()];
       hammer = items[ItemType.hammer.ordinal()];
       drill = items[ItemType.drill.ordinal()];
       shovel = items[ItemType.shovel.ordinal()];
       sickle = items[ItemType.sickle.ordinal()];
       saw = items[ItemType.saw.ordinal()];
       nails = items[ItemType.nails.ordinal()];
       
       return items;
    }
    
    
    public static Game getGame() {
        return game;
    }

    public static void setGame(Game gameSet) {
        game = gameSet;
    }

    public static Map getMap() {
        return map;
    }

    public static void setMap(Map mapSet) {
        map = mapSet;
    }

    public static InventoryItem[] getGameItems() {
        return gameItems;
    }

    public static void setGameItems(InventoryItem[] gameItemsSet) {
        gameItems = gameItemsSet;
    }

    public static Scene[] getGameScenes() {
        return gameScenes;
    }

    public static void setGameScenes(Scene[] gameScenesSet) {
        gameScenes = gameScenesSet;
    }

    public static Question[] getGameQuestions() {
        return gameQuestions;
    }

    public static void setGameQuestions(Question[] gameQuestionsSet) {
        gameQuestions = gameQuestionsSet;
    }
    
}
