package byui.cit260.oregontrail.model;

import java.io.Serializable;
import java.util.Objects;

public class Location implements Serializable {
    
    private int row;
    private int column;
    private int amountRemaining;
    private boolean visited;
    private String currentGeography;

    
    public void displayCurrentGeography(String particularLocation) {
        
    }
    
    
    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getAmountRemaining() {
        return amountRemaining;
    }

    public void setAmountRemaining(int amountRemaining) {
        this.amountRemaining = amountRemaining;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public String getCurrentGeography() {
        return currentGeography;
    }

    public void setCurrentGeography(String currentGeography) {
        this.currentGeography = currentGeography;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 19 * hash + this.row;
        hash = 19 * hash + this.column;
        hash = 19 * hash + this.amountRemaining;
        hash = 19 * hash + (this.visited ? 1 : 0);
        hash = 19 * hash + Objects.hashCode(this.currentGeography);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Location other = (Location) obj;
        if (this.row != other.row) {
            return false;
        }
        if (this.column != other.column) {
            return false;
        }
        if (this.amountRemaining != other.amountRemaining) {
            return false;
        }
        if (this.visited != other.visited) {
            return false;
        }
        if (!Objects.equals(this.currentGeography, other.currentGeography)) {
            return false;
        }
        return true;
    }

    

    @Override
    public String toString() {
        return "Location{" + "row=" + row + ", column=" + column + ", amountRemaining=" + amountRemaining + ", visited=" + visited + ", currentGeography=" + currentGeography + '}';
    }
    
    
    
}
