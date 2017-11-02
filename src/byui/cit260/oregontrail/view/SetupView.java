package byui.cit260.oregontrail.view;

import java.util.List;
import byui.cit260.oregontrail.model.*;
import byui.cit260.oregontrail.control.*;

public class SetupView
{   
    Occupations playerOccupation = new Occupations();
    Months monthList = new Months();

    public SetupView() {
        // Create actors with default names.
        Occupations.createActors("Dog", "Cat", "Pig");
        requestOccupation();
        requestName();
        requestMonth();
    }

    
    /* 
     * Occupation request.
     */
    private void requestOccupation() {
        displayOccupations();
        int occupation = StartProgramView.readAnswer();
        if (occupation == 4) {
            System.out.println("The banker starts with $1,600.\nThe carpenter starts with $800.\n"
                    + "The farmer starts with $400.\n");
            requestOccupation();
        }
        else {
            String actorChoice = Occupations.getActors().get(occupation-1).getOccupation();
            playerOccupation.setActorChoice(actorChoice);
        }
    }
    
    public void displayOccupations()
    {
        List<String> menuOptions = Occupations.getOccupationPrompt();
        
        System.out.println("Choose your occupation: ");
        for (int i = 0; i < menuOptions.size(); i++) {
            System.out.println(menuOptions.get(i));
        }
    }

    /*
     * Name request.
     */
    private void requestName() {
        // Prompt player to choose names of party members.
        System.out.println("********** The Oregon Trail ********************");
        System.out.println("Enter the names of those in your wagon party:");
        System.out.println("1.\n2.\n3.");
        enterName(1);
        enterName(2);
        enterName(3);
        displayActors();
        // TODO - If number selected, prompt to change name.
    }
    private void enterName(int nameNumber) {
        System.out.println(String.format("Enter name %d:",nameNumber));
        String name = InputReader.readString();
        Occupations.getActors().get(nameNumber-1).setName(name);
    }
    
    public void displayActors() {
        for (Actor actor : Occupations.getActors()) {
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
    
    /*
     * Month request.
     */
    public void requestMonth() {
        System.out.println("Choose a month to begin your journey:");
        System.out.println("********** The Oregon Trail ********************");
        List<String> months = monthList.getMonths();
        for (int i = 0; i < months.size(); i++) {
            System.out.println(months.get(i));
        }
        System.out.println("*           What is your choice?           *");
        System.out.println("********************************************");
//        String name = InputReader.readString();
//        months.setCurrentMonth(name);
    }
}

