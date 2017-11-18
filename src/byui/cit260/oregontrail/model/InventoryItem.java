/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.model;

import java.io.Serializable;

/**
 *
 * @author Allen
 */
public class InventoryItem implements Serializable {
    private String inventoryType;
    private String inventoryName;
    private int quantityInStock = 0;
    private int requiredAmount;
    
    public InventoryItem(String name, int quantity) {
        inventoryName = name;
        quantityInStock = quantity;
    }
    
    // Get & set inventoryType.   
    public String getInventoryType() {
    	return inventoryType;
    }    
    public void setInventoryType(String inventoryType) {
    	this.inventoryType = inventoryType;
    }
    
    // Get & set quantityInStock.
    public int getQuantityInStock() {
    	return quantityInStock;
    }
    public void setQuantityInStock(int quantityInStock) {
    	this.quantityInStock = quantityInStock;
    }
    
    // Get & set requiredAmount.
    public int getRequiredAmount() {
    	return requiredAmount;
    }
    public void setRequiredAmount(int requiredAmount) {
    	this.requiredAmount = requiredAmount;
    }
    
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((inventoryType == null) ? 0 : inventoryType.hashCode());
		result = prime * result + quantityInStock;
		result = prime * result + requiredAmount;
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
		InventoryItem other = (InventoryItem) obj;
		if (inventoryType == null) {
			if (other.inventoryType != null)
				return false;
		} else if (!inventoryType.equals(other.inventoryType))
			return false;
		if (quantityInStock != other.quantityInStock)
			return false;
		if (requiredAmount != other.requiredAmount)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "InventoryItem [inventoryType=" + inventoryType + ", quantityInStock=" + quantityInStock
				+ ", requiredAmount=" + requiredAmount + "]";
	}
}
