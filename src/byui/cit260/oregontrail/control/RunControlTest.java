/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.control;

<<<<<<< HEAD:SourcePackages/byui/cit260/oregontrail/control/runTest.java
/**
 *
 * @author Robert
 */
public class runTest {
=======
public class RunControlTest {
>>>>>>> ba997cf9e4a17b659f76897b6a3cf08740771e0c:src/byui/cit260/oregontrail/control/RunControlTest.java
    public static void main(String args[]) {
        
    ControlScoreTest test = new ControlScoreTest();
    
    test.testCalcTotalScore(2200, 2000, 2, 1800);
    test.testCalcTotalScore(0, 1500, 1, -200);
    test.testCalcTotalScore(0, -10.5, 3, 2000);
    test.testCalcTotalScore(0, 1800, 20, 4000);
    test.testCalcTotalScore(0, 2000, -1, 3000);
    test.testCalcTotalScore(6000, 4000, 3, 1000);
    }
}
