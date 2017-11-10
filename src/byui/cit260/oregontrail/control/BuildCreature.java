/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.control;

import byui.cit260.oregontrail.model.Creature;
import byui.cit260.oregontrail.model.CreatureInventory;

public class BuildCreature {
    
    protected String creatureItem1;
    protected String creatureItem2;
    protected String creatureItem3;
    protected String creatureItem4;
    protected String creatureItem5;
    protected boolean living = true;
    
    public BuildCreature() {
        
    Creature creature = new Creature();
    
    creatureItem1 = creature.getItem1();
    creatureItem2 = creature.getItem2();
    creatureItem3 = creature.getItem3();
    creatureItem4 = creature.getItem4();
    creatureItem5 = creature.getItem5();
    }
    
    // Get items.
    public String getCreatureItem1() {
        return creatureItem1;
    }

    public String getCreatureItem2() {
        return creatureItem2;
    }

    public String getCreatureItem3() {
        return creatureItem3;
    }

    public String getCreatureItem4() {
        return creatureItem4;
    }

    public String getCreatureItem5() {
        return creatureItem5;
    }
    
    public boolean isLiving() {
        return living;
    }

    public void setLiving(boolean living) {
        this.living = living;
    }
}
