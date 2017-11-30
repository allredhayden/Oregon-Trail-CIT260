package byui.cit260.oregontrail.control;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import byui.cit260.oregontrail.view.*;
import byui.cit260.oregontrail.exceptions.GameControlException;
import byui.cit260.oregontrail.exceptions.MapControlException;
import byui.cit260.oregontrail.model.*;
import java.awt.Point;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GameControl implements Serializable
{
    private static final long serialVersionUID = 1L; 
    private static Game game;
/*    private static Map map;
    private static InventoryItem[] gameItems;
    private static Location[][] gameLocations;
    private static Scene[] gameScenes;
    private static Question[] gameQuestions;
    private static Actor[] actors = new Actor[10];
    private static SetupView setup;
    private static GeneralStoreView storeView; */
    
    public GameControl() {
        // Default constructor.
    }
    
    MapControl mapControl = new MapControl();

    public Game createNewGame() throws MapControlException {
        
        // Create new game.
        game = new Game();
        
        // Get player name.
        StartProgram program = new StartProgram();
        String playerName = program.getPlayerName();
        
        // Create new player.
        createPlayer(playerName);
        
        // Create player actors
        Occupations.createActors("Default1", "Default2", "Default3");
        
        game.setSetup(new SetupView());
        SetupView setup = game.getSetup();

        // Request & set player occupation.
        String occupation = setup.requestOccupation();
        game.setPlayerOccupation(occupation);

        setup.requestNames();
        
        // Store actor array in Game class (model).
        // game.setActors(occ.getActors());
        
        // Create NPC actor array & item array, store in Game class (model).
        game.setGameItems(createItems());
        InventoryItem[] gameItems = game.getGameItems();
        
        game.setNPCActors(createActors());
        
        // Create new map and store in Game class (model).
        MapControl controlMap = new MapControl();
        Map map = controlMap.createMap(10, 10, gameItems);
        if (mapControl.createMap(10, 10, gameItems) == null) {
            throw new MapControlException("Failed to create new map.");
        }
        else {
            game.setMap(map);             
        }
        
        OregonTrail.setCurrentGame(game);
        
        setup.requestMonth();
        
        // Store new game in MainMenu (model).
        MainMenu.setGame(game);
        
        System.out.println("\nA new game has been created.\n");
        
        return game;
    }
    
     public static Player createPlayer(String name) {
        
         if (name == null) {
            return null;
        }

        Player playerOne = new Player();
        playerOne.setPlayerName(name); // Assign name to player object.
        
        game.setPlayer(playerOne);
        game.getPlayer().setPlayerName(name); // Assign name to playerName variable in game class.
        
        OregonTrail.setPlayer(playerOne);
        
        return playerOne; // Return player object.
    }
    
    public static Actor[] createActors() {

        Actor[] actors = new Actor[10];

        // String occupation, String name, String description, Point coordinates, double money, double health
        actors[ActorType.Lehi.ordinal()] = new Actor("Pioneer", "Lehi", "Lehi", new Point(1,2), 1000, 100);
        actors[ActorType.Sariah.ordinal()] = new Actor("Pioneer", "Sariah", "Sariah", new Point(1,2), 1000, 100);
        actors[ActorType.Nephi.ordinal()] = new Actor("Pioneer", "Nephi", "Leader of Nephites", new Point(1,2), 1000, 100);
        actors[ActorType.Jacob.ordinal()] = new Actor("Pioneer", "Jacob", "Jacob", new Point(1,2), 1000, 100);
        actors[ActorType.Sam.ordinal()] = new Actor("Pioneer", "Sam", "Sam", new Point(1,2), 1000, 100);
        actors[ActorType.Laman.ordinal()] = new Actor("Pioneer", "Laman", "Laman", new Point(1,2), 1000, 100);
        actors[ActorType.Lemuel.ordinal()] = new Actor("Pioneer", "Lemuel", "Lemuel", new Point(1,2), 1000, 100);
        actors[ActorType.Zoram.ordinal()] = new Actor("Pioneer", "Zoram", "Zoram", new Point(1,2), 1000, 100);
        actors[ActorType.Angel.ordinal()] = new Actor("Pioneer", "Angel", "Angel", new Point(1,2), 1000, 100);
        actors[ActorType.Lord.ordinal()] = new Actor("Pioneer", "Lord", "Lord", new Point(1,2), 1000, 100);
        
        game.setPcActors(actors);
        return actors;
    }
    
 /*   public static Actor[] getActors() {
        return actors;
    } */
    
    public static void visitCalc() {
        
        SumVisitor sumVisitor = new SumVisitor();
        MinVisitor minVisitor = new MinVisitor();
        MaxVisitor maxVisitor = new MaxVisitor();
            
        for (Actor person : game.getPcActors()) {
            sumVisitor.visitElement(person);
            minVisitor.visitElement(person);
            maxVisitor.visitElement(person);
        }
        System.err.println("\nSum: " + sumVisitor.getSum());
        System.err.println("Min: " + minVisitor.getMin());
        System.err.println("Max: " + maxVisitor.getMax());
        
        try {
            Thread.sleep(250);
        } catch (InterruptedException ex) {
            Logger.getLogger(GameControl.class.getName()).log(Level.SEVERE, null, ex);
        }
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
       
      /* lumber = items[ItemType.lumber.ordinal()];
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
       nails = items[ItemType.nails.ordinal()]; */
       
       items[ItemType.lumber.ordinal()] = lumber;
       items[ItemType.ore.ordinal()] = ore;
       items[ItemType.grain.ordinal()] = grain;
       items[ItemType.legume.ordinal()] = legume;
       items[ItemType.oil.ordinal()] = oil;
       items[ItemType.water.ordinal()] = water;
       items[ItemType.honey.ordinal()] = honey;
       items[ItemType.salt.ordinal()] = salt;
       items[ItemType.axe.ordinal()] = axe;
       items[ItemType.hammer.ordinal()] = hammer;
       items[ItemType.drill.ordinal()] = drill;
       items[ItemType.shovel.ordinal()] = shovel;
       items[ItemType.sickle.ordinal()] = sickle;
       items[ItemType.saw.ordinal()] = saw;
       items[ItemType.nails.ordinal()] = nails;
       
       return items;
    }
    
   
    public static Game getGame() {
        return game;
    }

    public static void setGame(Game gameSet) {
        game = gameSet;
    }

    /* 
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
    } */

    // Stub function
    public static void saveGame(Game currentGame, String filePath) throws GameControlException {
        
        try (FileOutputStream fops = new FileOutputStream (filePath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            output.writeObject(currentGame);
        }
        catch (Exception e) {
            throw new GameControlException(e.getMessage());
        }
    }

    public static void getSavedGame(String filePath) throws GameControlException {

        Game game = null;
        
        try (FileInputStream fips = new FileInputStream(filePath)) {
            ObjectInputStream input = new ObjectInputStream(fips);
            
            game = (Game) input.readObject();
        }
        catch (Exception e) {
            throw new GameControlException(e.getMessage());
        }
        
        // Close the output file.
        OregonTrail.setCurrentGame(game);
    }    
}
