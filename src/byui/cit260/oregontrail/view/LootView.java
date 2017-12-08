package byui.cit260.oregontrail.view;

import byui.cit260.oregontrail.control.BuildCreature;
import byui.cit260.oregontrail.model.Inventory;

public class LootView extends View {
    
    Inventory inventory = new Inventory();
    BuildCreature creature = new BuildCreature();

    String item1 = creature.getCreatureItem1();
    String item2 = creature.getCreatureItem2();
    String item3 = creature.getCreatureItem3();
    String item4 = creature.getCreatureItem4();
    String item5 = creature.getCreatureItem5();
    
    int capacity = inventory.getCapacity();
    int carried = inventory.getCurrentCarried();
    boolean pickedUp1 = false;
    boolean pickedUp2 = false;
    boolean pickedUp3 = false;
    boolean pickedUp4 = false;
    boolean pickedUp5 = false;
    
    public LootView() {
        super("\n"
              + "\n-----------------------------------------"
              + "\n|              Loot                     |"
              + "\n-----------------------------------------");
        this.console.println(
                "\n1 - Pick up " + item1 + ".               "
              + "\n2 - Pick up " + item2 + ".               "            
              + "\n3 - Pick up " + item3 + ".               "
              + "\n4 - Pick up " + item4 + ".               "
              + "\n5 - Pick up " + item5 + ".               "                      
              + "\n6 - Return to travel menu                "
              + "\n7 - Quit"
              + "\n-----------------------------------------");
        super.display();
    }
    
    @Override
    public boolean doAction(String choice)
    {
        choice = choice.toUpperCase();
        
        switch (choice)
        {
        case "1":
            addToInventory(item1);
            break;
        case "2":
            addToInventory(item2);
            break;
        case "3":
            addToInventory(item3);
            break;
        case "4":
            addToInventory(item4);
            break;
        case "5":
            addToInventory(item5);
            break;
        case "6":
            new TravelView();
            break;
        case "7":
            new MainMenuView();
            break;
        default:
            ErrorView.display(this.getClass().getName(), "\nInvalid selection. Please try again.");
        }
        return false;
    }
    
    protected void addToInventory(String item) {
        
        if (carried <= capacity) {
            // Check if item 1 has been picked up.
            if (item == item1 && !pickedUp1) {
                inventory.insertItem(item);
                carried++;
                inventory.setCurrentCarried(carried);
                setPickedUp1(true);
                }
            else if (item == item1 && pickedUp1) {
                ErrorView.display(this.getClass().getName(), "You have already picked up this item.");
            }
            
            // Check if item 2 has been picked up.            
            if (item == item2 && !pickedUp2) {
                inventory.insertItem(item);
                carried++;
                inventory.setCurrentCarried(carried);
                setPickedUp2(true);
                }
            else if (item == item2 && pickedUp2) {
                ErrorView.display(this.getClass().getName(), "You have already picked up this item.");                
            }
            
            // Check if item 3 has been picked up.
            if (item == item3 && !pickedUp3) {
                inventory.insertItem(item);
                carried++;
                inventory.setCurrentCarried(carried);
                setPickedUp3(true);
                }
            else if (item == item3 && pickedUp3) {
                ErrorView.display(this.getClass().getName(), "You have already picked up this item.");                
            }

            // Check if item 4 has been picked up.            
            if (item == item4 && !pickedUp4) {
                inventory.insertItem(item);
                carried++;
                inventory.setCurrentCarried(carried);
                setPickedUp4(true);
                }
            else if (item == item4 && pickedUp4) {
                ErrorView.display(this.getClass().getName(), "You have already picked up this item.");
            }

            // Check if item 5 has been picked up.            
            if (item == item5 && !pickedUp5) {
                inventory.insertItem(item);
                carried++;
                inventory.setCurrentCarried(carried);
                setPickedUp5(true);
                }
            else if (item == item5 && pickedUp5) {
                ErrorView.display(this.getClass().getName(), "You have already picked up this item.");
            }
        }
        // Else, if carried > capacity:
        else {
            ErrorView.display(this.getClass().getName(), "You cannot carry any more items.");
        }
    }
    
    // Set pickedUp values.
    public void setPickedUp1(boolean pickedUp1) {
        this.pickedUp1 = pickedUp1;
    }

    public void setPickedUp2(boolean pickedUp2) {
        this.pickedUp2 = pickedUp2;
    }

    public void setPickedUp3(boolean pickedUp3) {
        this.pickedUp3 = pickedUp3;
    }

    public void setPickedUp4(boolean pickedUp4) {
        this.pickedUp4 = pickedUp4;
    }

    public void setPickedUp5(boolean pickedUp5) {
        this.pickedUp5 = pickedUp5;
    }
}
