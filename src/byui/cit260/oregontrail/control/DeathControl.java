package byui.cit260.oregontrail.control;

import java.util.Random;

import byui.cit260.oregontrail.model.Game;
import byui.cit260.oregontrail.model.OregonTrail;
import byui.cit260.oregontrail.model.PartyDeathAudio;

public class DeathControl {
    
    private String causeOfDeath = null;
    private String[] deathList = null;
    private Game game = OregonTrail.getCurrentGame();
    private static String path = "http://faintdev.net/rzx/sounds/death.wav";
    private PartyDeathAudio audio = null;
    
    public DeathControl() {
       createDeathList();
    }
    
    public void createDeathList() {
        deathList = new String[11];
        deathList[0] = "Frostbite";
        deathList[1] = "Drowning";
        deathList[2] = "Burning";
        deathList[3] = "Pneumonia";
        deathList[4] = "Heart Attack";
        deathList[5] = "Murder";
        deathList[6] = "Starvation";
        deathList[7] = "Dehydration";
        deathList[8] = "Infection";
        deathList[9] = "Aneurysm";
        deathList[10] = "Asphyxiation";
    }
    
    public void randomizeDeath(int memberID) {

        boolean flag = false;
        int determine = 0;
        Random ran = new Random();
        determine = ran.nextInt(2);
        causeOfDeath = deathList[ran.nextInt(10)];
        
        if (memberID == 1) {
            game.getPartyMember1().setDead(flag);
            if (determine == 0) {
                System.out.println("Congratulations. Party member " + game.getPartyMember1().getName() + " has escaped death and is still alive.");
            }
            else {
                flag = true;
                game.getPartyMember1().setDead(flag);
                System.out.println(game.getPartyMember1().getName() + " has died from " + getCauseOfDeath() + ".");
                playDeathSound();
            }
        }
        
        else if (memberID == 2) {
            if (determine == 0) {
                System.out.println("Congratulations. Party member " + game.getPartyMember2().getName() + " has escaped death and is still alive.");
            }
            else {
                flag = true;
                game.getPartyMember2().setDead(flag);
                System.out.println(game.getPartyMember2().getName() + " has died from " + getCauseOfDeath() + ".");
                playDeathSound();
            }
            game.getPartyMember2().setDead(flag);
        }
        
        else if (memberID == 3) {
            if (determine == 0) {
                System.out.println("Congratulations. Party member " + game.getPartyMember3().getName() + " has escaped death and is still alive.");
            }
            else {
                flag = true;
                game.getPartyMember3().setDead(flag);
                System.out.println(game.getPartyMember3().getName() + " has died from " + getCauseOfDeath() + ".");
                playDeathSound();
            }
        }
    }
    
    public void playDeathSound() {
        if (audio == null) {
            audio = new PartyDeathAudio();
        }
    }
    
    public String getCauseOfDeath() {
        return causeOfDeath;
    }

    public void setCauseOfDeath(String causeOfDeath) {
        this.causeOfDeath = causeOfDeath;
    }
    
    public static String getPath() {
        return path;
    }
}
