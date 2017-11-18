package byui.cit260.oregontrail.model;

import java.io.Serializable;
import java.util.List;

public class Game implements Serializable
{
    private double totalTime;
    private boolean noPeople;
    private Player player;
    private static List<Actor> actors;
    private Actor[] npcActors;
    private InventoryItem[] inventory;
    private Map map;
    
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

    public static List<Actor> getActors() {
        return actors;
    }

    public static void setActors(List<Actor> actors) {
        Game.actors = actors;
        System.out.println("\nNew actors created for this game.");
    }
  
    public Actor[] getNPCActors() {
        return npcActors;
    }

    public void setNPCActors(Actor[] npcActors) {
        this.npcActors = npcActors;
        System.out.println("\nNew NPC actors created for this game.");        
    }
    
    public InventoryItem[] getInventory() {
        return inventory;
    }

    public void setInventory(InventoryItem[] inventory) {
        this.inventory = inventory;
        System.out.println("\nNew items created for this game.");        
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
        System.out.println("\nNew map created for this this game.");        
    }              
}
