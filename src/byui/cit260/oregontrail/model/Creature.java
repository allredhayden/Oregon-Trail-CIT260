/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.model;

import java.io.Serializable;
import byui.cit260.oregontrail.control.GenerateInventory;

public class Creature implements Serializable {
    
    protected String item1;
    protected String item2;
    protected String item3;
    protected String item4;
    protected String item5;
    protected boolean living = true;
    
    public Creature() {
        GenerateInventory gen = new GenerateInventory();
        
        item1 = gen.getCreatureItem1();
        item2 = gen.getCreatureItem2();
        item3 = gen.getCreatureItem3();
        item4 = gen.getCreatureItem4();
        item5 = gen.getCreatureItem5();
    }
    
    // Get items.
    public String getItem1() {
        return item1;
    }

    public String getItem2() {
        return item2;
    }

    public String getItem3() {
        return item3;
    }

    public String getItem4() {
        return item4;
    }

    public String getItem5() {
        return item5;
    }
    
    public boolean isLiving() {
        return living;
    }

    public void setLiving(boolean living) {
        this.living = living;
    }
}
