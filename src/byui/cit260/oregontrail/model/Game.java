package byui.cit260.oregontrail.model;

import java.io.Serializable;
import java.util.List;

import byui.cit260.oregontrail.control.MapControl.Pair;
import byui.cit260.oregontrail.view.GeneralStoreView;
import byui.cit260.oregontrail.view.SetupView;
import byui.cit260.oregontrail.view.TravelView;

@SuppressWarnings("serial")
public class Game implements Serializable
{
    private double totalTime;
    private boolean noPeople;
    private Player player;
    private List<Actor> actors;
    private Actor[] npcActors;
    private Actor[] pcActors;
    public Map map;
    private InventoryItem[] gameItems;
    private Location[][] gameLocations;
    private List<QuestionScene> questionScenes;
    private SetupView setup;
    private String currentMonth;
    private GeneralStoreView storeView;
    private String playerOccupationName;
    private Occupations occupation;
    private String[] items;
    private List<Pair> coordinatePairs;
    private int wood = 60;

    public Game() {
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
    }
  
    public Actor[] getNPCActors() {
        return npcActors;
    }

    public void setNPCActors(Actor[] npcActors) {
        this.npcActors = npcActors;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
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

    public List<QuestionScene> getQuestionScenes() {
        return questionScenes;
    }

    public void setQuestionScenes(List<QuestionScene> questionScene) {
        this.questionScenes = questionScene;
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
    
    public List<Pair> getCoordinatePairs() {
        return coordinatePairs;
    }

    public void setCoordinatePairs(List<Pair> coordinatePairs) {
        this.coordinatePairs = coordinatePairs;
    }

    public int getWood() {
        return wood;
    }

    public void setWood(int wood) {
        this.wood = wood;
    }

    public void clear() {
        setActors(null);
        setCoordinatePairs(null);
        setCurrentMonth(null);
        setGameItems(null);
        setGameLocations(null);
        setItems(null);
        setMap(null);
        setNoPeople(false);
        setNPCActors(null);
        setOccupation(null);
        setPcActors(null);
        setPlayer(null);
        setPlayerOccupationName(null);
        setQuestionScenes(null);
        setSetup(null);
        setStoreView(null);
        setTotalTime(0.0);
        setWood(60);
        Pair.clear();
        TravelView.setSceneIndex(0);
    }
}
