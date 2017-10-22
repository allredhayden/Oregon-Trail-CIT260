/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.control;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author andrewwestensee
 */
public class TravelControlTest {
    
    public TravelControlTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of travelTime method, of class TravelControl.
     */
    @Test
    public void testTravelTime() {
        System.out.println("travelTime");
        double speed = 0.0;
        double distanceRequired = 0.0;
        double idleTime = 0.0;
        TravelControl instance = new TravelControl();
        double expResult = 0.0;
        double result = instance.travelTime(speed, distanceRequired, idleTime);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
