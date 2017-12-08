package byui.cit260.oregontrail.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Serializable;

@SuppressWarnings("serial")
public class OregonTrail implements Serializable
{

    private static Game currentGame = null;
    private static Player player = null;
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    private static PrintWriter logFile = null;
    
    // Main method.
    public static void main(String args[]) throws Throwable {
        
        try {
            OregonTrail.inFile = new BufferedReader(new InputStreamReader(System.in));
            OregonTrail.outFile = new PrintWriter(System.out, true);

            String filePath = "C:\\tmp\\log.txt";
            OregonTrail.logFile = new PrintWriter(filePath);
            
            StartProgram program = new StartProgram();
            program.displayStartProgramView();
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        catch (Throwable e) {
            System.out.println("Exception: " + e.toString() + "\nCause: " + e.getCause() + "\nMessage: " + e.getMessage());
            // e.printStackTrace(); // Commented out for Team Assignment (Week 12)
        }
        finally {
            try {
                if (OregonTrail.inFile != null) {
                    OregonTrail.inFile.close();
                }
                if (OregonTrail.outFile != null) {
                    OregonTrail.outFile.close();
                }
                if (OregonTrail.logFile != null) {
                    OregonTrail.logFile.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing files.");
                return;
            }
        }
    }

    // Getters & Setters
    public static Game getCurrentGame()
    {
        return currentGame;
    }
    
    public static void setCurrentGame(Game currentGame)
    {
        OregonTrail.currentGame = currentGame;
    }
    
    public static Player getPlayer()
    {
        return player;
    }
    
    public static void setPlayer(Player player)
    {
        OregonTrail.player = player;
    }
    
    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        OregonTrail.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        OregonTrail.inFile = inFile;
    }
    
    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        OregonTrail.logFile = logFile;
    }   
}
