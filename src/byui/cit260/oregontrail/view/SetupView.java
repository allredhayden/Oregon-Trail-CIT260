package byui.cit260.oregontrail.view;

import java.awt.Point;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;

import byui.cit260.oregontrail.model.Actor;
import byui.cit260.oregontrail.model.InputReader;
import byui.cit260.oregontrail.model.Occupations;

@SuppressWarnings("serial")
public class SetupView extends View implements Serializable
{   
    static Occupations playerOccupation = new Occupations();
    private Actor member1 = null;
    private Actor member2 = null;
    private Actor member3 = null;

    public SetupView() {

    }

    public String requestOccupation() {
        displayOccupations();
        int occupation = StartProgramView.readAnswer();
        String actorChoice = playerOccupation.getActors().get(occupation-1).getOccupation();
        
        if (occupation == 4) {
            this.console.println("\nYour occupation won't effect your ability to win the game whatsoever. Pick whichever role you want!");
            requestOccupation();
        }
        return actorChoice;
    }
    
    public void displayOccupations()
    {
        List<String> menuOptions = playerOccupation.getOccupationPrompt();
        
        this.console.println("\nChoose your occupation: ");
        for (int i = 0; i < menuOptions.size(); i++) {
            this.console.println(menuOptions.get(i));
        }
    }

    public void requestNames() {
        // Prompt player to choose names of party members.
        this.console.println("\n********** The Oregon Trail ********************");
        this.console.println("Enter the names of those in your wagon party:");
        this.console.println("1.\n2.\n3.");

        String name1 = enterName(1);
        String name2 = enterName(2);
        String name3 = enterName(3);
        
        member1 = new Actor("Commoner", name1, "A simple farmer, here to assist you in your travels.", new Point(0,0), 2000, 100, false);
        member2 = new Actor("Commoner", name2, "A simple farmer, here to assist you in your travels.", new Point(0,0), 2000, 100, false);
        member3 = new Actor("Commoner", name3, "A simple farmer, here to assist you in your travels.", new Point(0,0), 2000, 100, false);
        
        displayActors();
        // TODO - If number selected, prompt to change name.
    }
    
    private String enterName(int nameNumber) {
        this.console.println(String.format("Enter name %d:",nameNumber));
        String name = InputReader.readString();
        playerOccupation.getActors().get(nameNumber-1).setName(name);
        
        return name;
    }
    
    public void displayActors() {
        for (Actor actor : playerOccupation.getActors()) {
            actor.getName();
        }
    }
    
    @SuppressWarnings("unused")
    private String getHelpMenuOption() {
        
        String value = "";
        boolean valid = false;
        
        while (!valid) {
            ErrorView.display(this.getClass().getName(), "\nPlease enter a value: ");
            
        try {
            value = keyboard.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        value = value.trim();
        
        if (value.length() < 1) {
            ErrorView.display(this.getClass().getName(), "\nInvalid value: value can not be blank");
            continue;
            }
        
            break; // end the loop
        }
        
        return value;
    }
    
    public Occupations getPlayerOccupation() {
        return playerOccupation;
    }
    
    public Actor getMember1() {
        return member1;
    }

    public void setMember1(Actor member1) {
        this.member1 = member1;
    }

    public Actor getMember2() {
        return member2;
    }

    public void setMember2(Actor member2) {
        this.member2 = member2;
    }

    public Actor getMember3() {
        return member3;
    }

    public void setMember3(Actor member3) {
        this.member3 = member3;
    }
}

