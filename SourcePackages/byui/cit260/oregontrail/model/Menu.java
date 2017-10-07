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
    public String toString() {
        return "Menu{" + "menuStatus=" + menuStatus + ", options=" + options + '}';
    }
     
    
   
}
