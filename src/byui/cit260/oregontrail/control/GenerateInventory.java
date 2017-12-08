package byui.cit260.oregontrail.control;

import byui.cit260.oregontrail.model.CreatureInventory;
import byui.cit260.oregontrail.model.Game;
import byui.cit260.oregontrail.model.OregonTrail;

import java.util.Random;

public class GenerateInventory {

    String creatureItem1;
    String creatureItem2;
    String creatureItem3;
    String creatureItem4; 
    String creatureItem5;

    public GenerateInventory() {
       createInventory();
    }
    
    public void createInventory() {
        String[] itemList = new String[41];
        itemList[0] = "Axe";
        itemList[1] = "Hammer";
        itemList[2] = "Sword";
        itemList[3] = "Stick";
        itemList[4] = "Pistol";
        itemList[5] = "Leather Shirt";
        itemList[6] = "Leather Pants";
        itemList[7] = "Cloth Shirt";
        itemList[8] = "Cloth Pants";
        itemList[9] = "Helmet";
        itemList[10] = "Staff";
        itemList[11] = "20 Silver Coins";
        itemList[12] = "20 Silver Coins";
        itemList[13] = "20 Silver Coins";
        itemList[14] = "20 Silver Coins";
        itemList[15] = "20 Silver Coins";
        itemList[16] = "20 Silver Coins";
        itemList[17] = "20 Silver Coins";
        itemList[18] = "20 Silver Coins";
        itemList[19] = "100 Silver Coins";
        itemList[20] = "100 Silver Coins";
        itemList[21] = "100 Silver Coins";
        itemList[22] = "100 Silver Coins";
        itemList[23] = "200 Silver Coins";
        itemList[24] = "200 Silver Coins";
        itemList[25] = "400 Silver Coins";
        itemList[26] = "10 Pounds of Wood";
        itemList[27] = "10 Pounds of Wood";
        itemList[28] = "10 Pounds of Wood";
        itemList[29] = "10 Pounds of Wood";
        itemList[30] = "40 Pounds of Wood";
        itemList[31] = "40 Pounds of Wood";
        itemList[32] = "2 Pounds of Meat";
        itemList[33] = "2 Pounds of Meat";
        itemList[34] = "2 Pounds of Meat";
        itemList[35] = "2 Pounds of Meat";
        itemList[36] = "5 Pounds of Meat";
        itemList[37] = "5 Pounds of Meat";
        itemList[38] = "10 Pounds of Meat";        
        itemList[39] = "20 Pounds of Meat";       
        itemList[40] = "30 Pounds of Meat";
        
        Random ran = new Random();        
        String itemOne = itemList[ran.nextInt(40)];
        String itemTwo = itemList[ran.nextInt(40)];       
        String itemThree = itemList[ran.nextInt(40)];
        String itemFour = itemList[ran.nextInt(40)];
        String itemFive = itemList[ran.nextInt(40)];
        
        CreatureInventory inventory = new CreatureInventory(itemOne, itemTwo, itemThree, itemFour, itemFive);
        creatureItem1 = inventory.getFinalItem1();
        creatureItem2 = inventory.getFinalItem2();        
        creatureItem3 = inventory.getFinalItem3();        
        creatureItem4 = inventory.getFinalItem4();    
        creatureItem5 = inventory.getFinalItem5();
        
        Game game = OregonTrail.getCurrentGame();
        game.setItems(itemList);
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
}
