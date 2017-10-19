/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.control;

import java.io.Serializable;

public class ControlScore implements Serializable {
    double currentScore;
    double peopleLiving;
    double totalTime;
    double totalScore;
    
    public double calcTotalScore(double currentScore, double peopleLiving, double totalTime) {
        this.currentScore = currentScore;
        this.peopleLiving = peopleLiving;
        this.totalTime = totalTime;
        totalScore = (currentScore + (peopleLiving * 1000) - totalTime);
        
        if (currentScore < 0 || currentScore > 10000) {
            System.out.println ("The value of currentScore must be between 0 and 10,000, cheater.");
            return totalScore;
        }
        if (peopleLiving < 0) {
            System.out.println ("You cannot have a negative number of living players.");
            return totalScore;
        }
        if (peopleLiving > 3) {
            System.out.println ("You can't end with more people than you started with.");
            return totalScore;
        }
        if (totalTime < 0 ) {
            System.out.println ("You can't have less than zero seconds played.");
            return totalScore;
        }
        else {
            return (totalScore);
        }
    }

    public double getTotalScore() {
        return totalScore;
    }
}
