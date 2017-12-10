package byui.cit260.oregontrail.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("serial")
public class Occupations implements Serializable
{   
    private String actorChoice;
    
    // Create empty list of actors.
    private static List<Actor> actors = new ArrayList<>();
    
    // Function to add actors to empty actor list.
    public static void createActors(String carpenterName, String farmerName, String bankerName) {
        actors.add(new Actor("Carpenter", carpenterName, "A carpenter with skilled hands, capable of building any number of objects with his surroundings.", new Point(0,1), 6000, 100, false));
        actors.add(new Actor("Farmer", farmerName, "A simple farmer, capable of growing food in any area that is sufficient for healthy crop growth.", new Point(1,1), 5000, 100, false));
        actors.add(new Actor("Banker", bankerName, "A sophisticated banker that is good with numbers and has a sharp wit.", new Point(1,2), 7000, 100, false));
        actors.add(new Actor("Hold", "hold", "Placeholder.", new Point(1,2), 7000, 100, false));      
    }
    
    // Create occupation prompt.
    public static List<String> occupationPrompt = new ArrayList<>();
    static {
        occupationPrompt.add("1. Carpenter from Ohio");
        occupationPrompt.add("2. Farmer from Illinois");
        occupationPrompt.add("3. Banker from Boston");
        occupationPrompt.add("4. Which one should I choose?");
    }

    // Getters & Setters
    public String getActorChoice()
    {
        return actorChoice;
    }

    public void setActorChoice(String actorChoice)
    {
        this.actorChoice = actorChoice;
    }
    
    public List<Actor> getActors()
    {
        return actors;
    }
    
    public List<String> getOccupationPrompt() {
        return occupationPrompt;
    }
}
