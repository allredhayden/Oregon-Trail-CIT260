package byui.cit260.oregontrail.view;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import java.util.Scanner;

import byui.cit260.oregontrail.model.*;

public class SetupView extends View implements Serializable
{   
    static Occupations playerOccupation = new Occupations();
    // Months monthList = new Months();

    public SetupView() {

    }

    public String requestOccupation() {
        displayOccupations();
        int occupation = StartProgramView.readAnswer();
        String actorChoice = playerOccupation.getActors().get(occupation-1).getOccupation();
        
        if (occupation == 4) {
            this.console.println("The banker starts with $1,600.\nThe carpenter starts with $800.\n"
                    + "The farmer starts with $400.\n");
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
        enterName(1);
        enterName(2);
        enterName(3);
        displayActors();
        // TODO - If number selected, prompt to change name.
    }
    
    private void enterName(int nameNumber) {
        this.console.println(String.format("Enter name %d:",nameNumber));
        String name = InputReader.readString();
        playerOccupation.getActors().get(nameNumber-1).setName(name);
    }
    
    public void displayActors() {
        for (Actor actor : playerOccupation.getActors()) {
            actor.getName();
        }
    }

    public void changeName() {
        /*
         * Request a number, if they enter space bar, exit the loop.
         * If they enter a number, call requestName with that number 
         * to change the name of corresponding actor.
         */
    }
    
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
}

