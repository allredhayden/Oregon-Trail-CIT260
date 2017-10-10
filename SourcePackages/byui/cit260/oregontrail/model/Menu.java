/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.model;

import java.io.Serializable;

/**
 *
 * @author blairfurner
 */
public class Menu implements Serializable {
   private boolean menuStatus; 
   private boolean options;

    public Menu() {
    }

    public boolean isMenuStatus() {
        return menuStatus;
    }

    public void setMenuStatus(boolean menuStatus) {
        this.menuStatus = menuStatus;
    }

    public boolean isOptions() {
        return options;
    }

    public void setOptions(boolean options) {
        this.options = options;
    }

    @Override
    public int hashCode()
    {
    	final int prime = 31;
    	int result = 1;
    	result = prime * result + (menuStatus ? 1231 : 1237);
    	result = prime * result + (options ? 1231 : 1237);
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
    	Menu other = (Menu) obj;
    	if (menuStatus != other.menuStatus)
    		return false;
    	if (options != other.options)
    		return false;
    	return true;
    }

    @Override
    public String toString() {
        return "Menu{" + "menuStatus=" + menuStatus + ", options=" + options + '}';
    }
}
