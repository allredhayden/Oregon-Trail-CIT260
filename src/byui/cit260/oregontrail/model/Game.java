package byui.cit260.oregontrail.model;

import java.io.Serializable;
import java.util.List;

import byui.cit260.oregontrail.view.GeneralStoreView;
import byui.cit260.oregontrail.view.SetupView;

public class Game implements Serializable
{
    private double totalTime;
    private boolean noPeople;
    private Player player;
    private List<Actor> actors;
    private Actor[] npcActors;
    private Actor[] pcActors;
    public static Map map;
    private InventoryItem[] gameItems;
    private Location[][] gameLocations;
    private Scene[] gameScenes;
    private Question[] gameQuestions;
    private SetupView setup;
    private GeneralStoreView storeView;
    private String playerOccupationName;
    private Occupations occupation;
    private String[] items;
    
    public Game() {
        // Default constructor
    }
    
    public double getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(double totalTime) {
        this.totalTime = totalTime;
    }

    public boolean isNoPeople() {
        return noPeople;
    }

    public void setNoPeople(boolean noPeople) {
        this.noPeople = noPeople;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
        System.out.println("\nNew actors created for this this.");
    }
  
    public Actor[] getNPCActors() {
        return npcActors;
    }

    public void setNPCActors(Actor[] npcActors) {
        this.npcActors = npcActors;
        System.out.println("\nNew NPC actors created for this this.");        
    }
    
/*    public InventoryItem[] getInventory() {
        return inventory;
    }

    public void setInventory(InventoryItem[] inventory) {
        this.inventory = inventory;
        System.out.println("\nNew items created for this this.");        
    } */

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
        System.out.println("\nNew map created for this this this.");        
    }
    public InventoryItem[] getGameItems() {
        return gameItems;
    }

    public void setGameItems(InventoryItem[] gameItems) {
        this.gameItems = gameItems;
    }

    public Location[][] getGameLocations() {
        return gameLocations;
    }

    public void setGameLocations(Location[][] gameLocations) {
        this.gameLocations = gameLocations;
    }

    public Scene[] getGameScenes() {
        return gameScenes;
    }

    public void setGameScenes(Scene[] gameScenes) {
        this.gameScenes = gameScenes;
    }

    public Question[] getGameQuestions() {
        return gameQuestions;
    }

    public void setGameQuestions(Question[] gameQuestions) {
        this.gameQuestions = gameQuestions;
    }

    public SetupView getSetup() {
        return setup;
    }

    public  void setSetup(SetupView setup) {
        this.setup = setup;
    }

    public  GeneralStoreView getStoreView() {
        return storeView;
    }

    public  void setStoreView(GeneralStoreView storeView) {
        this.storeView = storeView;
    }
    public  Actor[] getPcActors() {
        return pcActors;
    }

    public  void setPcActors(Actor[] pcActors) {
        this.pcActors = pcActors;
    }
    
    public String[] getItems() {
        return items;
    }

    public void setItems(String[] items) {
        this.items = items;
    }

    public String getPlayerOccupationName() {
        return playerOccupationName;
    }

    public void setPlayerOccupationName(String playerOccupationName) {
        this.playerOccupationName = playerOccupationName;
    }

    public Occupations getOccupation() {
        return occupation;
    }

    public void setOccupation(Occupations occupation) {
        this.occupation = occupation;
    }

    public String getCurrentMonth() {
        return currentMonth;
    }

    public void setCurrentMonth(String currentMonth) {
        this.currentMonth = currentMonth;
    }

    private String currentMonth;    
}
