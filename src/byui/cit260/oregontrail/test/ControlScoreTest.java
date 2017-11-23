package byui.cit260.oregontrail.test;

import java.io.Serializable;

import byui.cit260.oregontrail.control.ControlScore;

public class ControlScoreTest implements Serializable {
    
    double expectedResult;
    double currentScore;
    double peopleLiving;
    double totalTime;
   
    public void testCalcTotalScore(double expectedResult, double currentScore, double peopleLiving, double totalTime) 
    {
        this.expectedResult = expectedResult;
        this.currentScore = currentScore;
        this.peopleLiving = peopleLiving;
        this.totalTime = totalTime;
        
        ControlScore conScore = new ControlScore();
        double result = conScore.calcTotalScore(currentScore, peopleLiving, totalTime);
        System.out.println(result);
    
        if (expectedResult == result) {
        System.out.println("You have passed the test.");
        }
        else {
        System.out.println("You have failed the test.");
        }
        System.out.println("\n");
    }
}
