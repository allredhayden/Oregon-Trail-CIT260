package byui.cit260.oregontrail.model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

@SuppressWarnings("serial")
public class Player implements Serializable{
    
    private String playerName;
    private double bestTime;
    private ArrayList<Game> games = new ArrayList<Game>();
    
    // Default constructor.
    public Player() {
    }
    
    // Get & set "games" array list.
    public ArrayList<Game> getGames() {
		return games;
	}

	public void setGames(ArrayList<Game> games) {
		this.games = games;
	}
	
	// Get & set playerName.    
    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
    
    // Get & set bestTime.
    public double getBestTime() {
        return bestTime;
    }

    public void setBestTime(double bestTime) {
        this.bestTime = bestTime;
    }


    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + Objects.hashCode(this.playerName);
        hash = 11 * hash + (int) (Double.doubleToLongBits(this.bestTime) ^ (Double.doubleToLongBits(this.bestTime) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Player other = (Player) obj;
        if (Double.doubleToLongBits(this.bestTime) != Double.doubleToLongBits(other.bestTime)) {
            return false;
        }
        if (!Objects.equals(this.playerName, other.playerName)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Player{" + "playerName=" + playerName + ", bestTime=" + bestTime + '}';
    }
}
