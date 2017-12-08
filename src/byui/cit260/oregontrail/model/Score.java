package byui.cit260.oregontrail.model;

import java.io.Serializable;
import java.util.Arrays;

@SuppressWarnings("serial")
public class Score implements Serializable{
    
    private int currentScore;
    private int highScore;
    private int[] scoreList;
    private int requiredScore;

    public int getCurrentScore() {
        return currentScore;
    }

    public void setCurrentScore(int currentScore) {
        this.currentScore = currentScore;
    }

    public int getHighScore() {
        return highScore;
    }

    public void setHighScore(int highScore) {
        this.highScore = highScore;
    }

    public int[] getScoreList() {
        return scoreList;
    }

    public void setScoreList(int[] scoreList) {
        this.scoreList = scoreList;
    }

    public int getRequiredScore() {
        return requiredScore;
    }

    public void setRequiredScore(int requiredScore) {
        this.requiredScore = requiredScore;
    }
    
    public void addScore(int scoreAmount) {
        currentScore += scoreAmount;        
    }
    
    public void subtractScore(int scoreAmount) {
        currentScore -= scoreAmount;
    }
    
    public void displayScore() {
        
    }
    
    public void setScore(int score) {
        currentScore = score;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + this.currentScore;
        hash = 89 * hash + this.highScore;
        hash = 89 * hash + Arrays.hashCode(this.scoreList);
        hash = 89 * hash + this.requiredScore;
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
        final Score other = (Score) obj;
        if (this.currentScore != other.currentScore) {
            return false;
        }
        if (this.highScore != other.highScore) {
            return false;
        }
        if (this.requiredScore != other.requiredScore) {
            return false;
        }
        if (!Arrays.equals(this.scoreList, other.scoreList)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Score{" + "currentScore=" + currentScore + ", highScore=" + highScore + ", scoreList=" + scoreList + ", requiredScore=" + requiredScore + '}';
    }
    
    
    
}
