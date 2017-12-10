package byui.cit260.oregontrail.model;

import java.io.Serializable;
/**
 *
 * @author Allen
 */
@SuppressWarnings("serial")
public class Inventory implements Serializable {
    private double weight;
    private int quantity;
    private int currentCarried = 1;
    private int capacity = 200;
    private double money;
    private boolean inventoryStatus;
    
    public double getWeight()
    {
        return weight;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public int getQuantity()
    {
        return quantity;
    }
    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }
    public int getCapacity()
    {
        return capacity;
    }
    public void setCapacity(int capacity)
    {
        this.capacity = capacity;
    }
    public double getMoney()
    {
        return money;
    }
    public void setMoney(double money)
    {
        this.money = money;
    }
    public boolean isInventoryStatus()
    {
        return inventoryStatus;
    }
    public void setInventoryStatus(boolean inventoryStatus)
    {
        this.inventoryStatus = inventoryStatus;
    }
    public int getCurrentCarried() {
        return currentCarried;
    }
    public void setCurrentCarried(int currentCarried) {
        this.currentCarried = currentCarried;
    }
    
    @Override
    public int hashCode()
    {
	final int prime = 31;
	int result = 1;
	result = prime * result + capacity;
	result = prime * result + (inventoryStatus ? 1231 : 1237);
	long temp;
	temp = Double.doubleToLongBits(money);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	result = prime * result + quantity;
	temp = Double.doubleToLongBits(weight);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	return result;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Inventory other = (Inventory) obj;
	if (capacity != other.capacity)
		return false;
	if (inventoryStatus != other.inventoryStatus)
		return false;
	if (Double.doubleToLongBits(money) != Double.doubleToLongBits(other.money))
		return false;
	if (quantity != other.quantity)
		return false;
	if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight))
		return false;
	return true;
	}

    @Override
    public String toString() {
	return "Inventory [weight=" + weight + ", quantity=" + quantity + ", capacity=" + capacity + ", money=" + money
			+ ", inventoryStatus=" + inventoryStatus + "]";
    }
    
    public void insertItem(String item) {
    System.out.println(item + " has been looted successfully.");
    System.out.println("You are now carrying " + currentCarried + " items out of your maximum capacity of " + capacity + ".\n");
    }
}