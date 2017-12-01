package byui.cit260.oregontrail.view;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Console;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;
import java.util.UnknownFormatConversionException;

import byui.cit260.oregontrail.control.DistanceControl;
import byui.cit260.oregontrail.control.GenerateInventory;
import byui.cit260.oregontrail.control.MapControl;
import byui.cit260.oregontrail.model.Game;
import byui.cit260.oregontrail.model.OregonTrail;
import byui.cit260.oregontrail.model.Player;
import byui.cit260.oregontrail.model.Scene;

public class TempMenu extends View
{
    // protected String item = getItem();
    protected String item = "default";
    // protected String opponent = getOpponent();
    protected String opponent = "Wolf";
        
    public TempMenu() {
        super("\n"
              + "\n-----------------------------------------"
              + "\n|           Temporary Menu              |"
              + "\n-----------------------------------------"
              + "\nA - Go to attack menu"
              + "\nB - Go to build menu"            
              + "\nR - Go to river encounter menu"
              + "\nT - Go to about authors menu"
              + "\nL - Go to location enounter menu"
              + "\nC - Go to loot menu"   
              + "\nX - Go to choose target menu"
              + "\nD - Populate distance array"
              + "\nP - Populate yokes array"
              + "\nM - Manufacture resources"              
              + "\nY - Calculate current funds after specific purchase"
              + "\nS - Go back to general store"
              + "\nG - Verify game session"         
              + "\nF - Go to FileView"                
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
        case "A":
            new AttackView(opponent);
            break;
        case "B":
            new BuildView();
            break;
        case "R":
            new RiverEncounterView();
            break;
        case "T":
            new AboutAuthorsView();
            break;
        case "L":
            new LocationEncounterView();
            break;
        case "C":
            new LootView();
            break;
        case "X":
            new ChooseTargetView();
            break;
        case "D":
            new DistanceView();
            break;
        case "P":
            new YokesView();
            break;
        case "M":
            new ManufactureView();
            break;            
        case "Y":
            new MoneyView();
            break;
        case "S":
            new GeneralStoreView();
            break;
        case "G":
            Game game = OregonTrail.getCurrentGame();
            Player player = game.getPlayer();
            
            String name = player.getPlayerName();
            this.console.println("Welcome back " + name + ".");
            
            this.console.println("Your current occupation is: " + game.getPlayerOccupationName());
            
            new GeneralStoreView();
            break;
        case "F":
            new FileView();
            // requestFileLocation();
            break;
        case "Z":
            new MainMenuView();
        default:
            ErrorView.display(this.getClass().getName(), "\nInvalid selection. Please try again.");
        }
        return false;
    }
}
