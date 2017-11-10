package byui.cit260.oregontrail.model;

import java.io.Serializable;

public class CreatureInventory implements Serializable {
    
    protected String finalItem1;
    protected String finalItem2;
    protected String finalItem3;
    protected String finalItem4;
    protected String finalItem5;
    
    public CreatureInventory(String item1, String item2, String item3, String item4, String item5) {
        String[] creatureItems = new String[5];
        finalItem1= creatureItems[0] = item1;
        finalItem2= creatureItems[1] = item2;
        finalItem3= creatureItems[2] = item3;
        finalItem4= creatureItems[3] = item4;
        finalItem5= creatureItems[4] = item5;
    }
    
    // Get items.
    public String getFinalItem1() {
        return finalItem1;
    }

    public String getFinalItem2() {
        return finalItem2;
    }

    public String getFinalItem3() {
        return finalItem3;
    }

    public String getFinalItem4() {
        return finalItem4;
    }

    public String getFinalItem5() {
        return finalItem5;
    }
}
