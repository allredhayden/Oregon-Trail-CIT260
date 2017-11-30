package byui.cit260.oregontrail.model;

import byui.cit260.oregontrail.view.StartProgramView;

public class StartProgram
{
    private static String playerName;
    
    public StartProgram() {
    }

    public void displayStartProgramView() {        
        // Construct StartProgramView, which displays the welcome screen.
        StartProgramView view = new StartProgramView();
        view.displayWelcome();
        view.displayBanner();
        playerName = view.requestPlayerName();
        view.doAction(playerName);
    }
    
    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        StartProgram.playerName = playerName;
        }
}
