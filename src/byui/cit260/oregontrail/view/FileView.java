package byui.cit260.oregontrail.view;

import java.io.IOException;
import java.io.PrintWriter;

import byui.cit260.oregontrail.control.GenerateInventory;
import byui.cit260.oregontrail.model.Game;
import byui.cit260.oregontrail.model.OregonTrail;

public class FileView extends View {
    public FileView() {
        super("\n"
              + "\n-----------------------------------------"
              + "\n|           File View                   |"
              + "\n-----------------------------------------"
              + "\n1 - IA #12 - Jeremy"
              + "\n2 - IA #12 - Allen"
              + "\n3 - IA #12 - Blair"
              + "\n4 - IA #12 - Hayden"
              + "\nZ - Quit"
              + "\n-----------------------------------------");
        display();
    }
    
    @Override
    public boolean doAction(String choice)
    {
        choice = choice.toUpperCase();

        switch (choice)
        {
        case "1":
            writeItemReport(requestFileLocation());
            break;
        case "2":
            writeMapDescription(requestFileLocation());
            break;
        case "3":
             writePartyNames(requestFileLocation());
        case "4":
            // writeQuestions(requestFileLocation());
            break;
        case "Z":
            new MainMenuView();
        default:
            ErrorView.display(this.getClass().getName(), "\nInvalid selection. Please try again.");
        }
        return false;
    }
    
    public String requestFileLocation() {
        String path = "C:\\tmp\\default.txt";
        
        this.console.println("\nPlease enter the path of the file that you'd like to write your report to.");
        path = getInput();
        
        return path;
    }
    
    public void writeItemReport(String path) {
        new GenerateInventory();
        Game game = OregonTrail.getCurrentGame();

        String[] items = game.getItems();

        try (PrintWriter out = new PrintWriter(path)) {
            out.println("\n\n       Item List       ");
            out.printf("%n%-14s%-20s", "Index", "Item");
            out.printf("%n%-14s%-20s", "------", "---------------");
            for (int i = 0; i < items.length - 1; i++) {
                out.printf("%n%-14s%-10s", "Item #" + (i+1) + ": ", items[i]);
            }
        } catch (IOException ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
        }
        
        this.console.println("\nReport successfully written to: " + path);
    }
    public void writePartyNames(String path) {
        Game game = OregonTrail.getCurrentGame();
        Occupations occupation = game.getOccupation();
        
        try (PrintWriter out = new PrintWriter(path)) {
            out.println("\n\n      Name List       ");
            out.printf("%n%-14s%-20s", "Index", "Name");
            out.printf("%n%-14s%-20s", "------", "---------------");
            for (int i = 0; i <= 2; i++) {
                String name = occupation.getActors().get(i).getName();
                out.printf("%n%-14s%-10s", "Name #" + (i+1) + ": ", name);
            }
        } catch (IOException ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
        }
        
        this.console.println("\nReport successfully written to: " + path);
    }
        
         public void writeMapDescription(String path) {
        Game game = OregonTrail.getCurrentGame();
        Scene[] scene = game.getGameScenes();
        
        try (PrintWriter out = new PrintWriter(path)) {
            out.println("\n\n       Item List       ");
            out.printf("%n%-14s%-20s", "Index", "Description");
            out.printf("%n%-14s%-20s", "------", "---------------");
            for (int i = 0; i < scene.length - 1; i++) {
                String description = scene[i].getDescription();
                out.printf("%n%-14s%-40s", "Scene #" + (i+1) + ": ", description);
                out.println("\n");
            }
        } catch (IOException ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
        }
        
        this.console.println("\nReport successfully written to: " + path); 
    } 
    }




