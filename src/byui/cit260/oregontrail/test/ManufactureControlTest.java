/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.test;

import java.io.Serializable;

import byui.cit260.oregontrail.control.ManufactureControl;

/**
 *
 * @author blairfurner
 */
public class ManufactureControlTest {
    
    public static void main(String args[]) {
        ManufactureControl manuControl = new ManufactureControl();
        int test1 = manuControl.acquireResources(1, 50);
        int test2 = manuControl.acquireResources(10, -1);
        int test3 = manuControl.acquireResources(-2, 50);
        int test4 = manuControl.acquireResources(1, 2000);
        int test5 = manuControl.acquireResources(20, 10);
        int test6 = manuControl.acquireResources(8, 20);
    }
}
