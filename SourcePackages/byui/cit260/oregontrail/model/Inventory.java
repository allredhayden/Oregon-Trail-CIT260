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
public class Inventory implements Serializable {
    private double weight;
    private int quantity;
    private int capacity;
    private double money;
    private boolean inventoryStatus;
    
public double getWeight()
 {
 	return weight;
 }
 public void setWeight(double weight)
 {
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
}