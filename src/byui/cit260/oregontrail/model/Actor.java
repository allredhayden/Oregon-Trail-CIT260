package byui.cit260.oregontrail.model;

import java.awt.Point;
import java.io.Serializable;
@SuppressWarnings("serial")
public class Actor implements Serializable {
    
    private String occupation;
    private String name;
	private String description;
	private Point coordinates;
	private double money;
	private double health;
	private boolean dead;

    // Default constructor.
	public Actor (String occupation, String name, String description, Point coordinates, double money, double health, boolean dead) {
		this.occupation = occupation;
		this.name = name;
		this.description = description;
		this.coordinates = coordinates;
		this.money = money;
		this.health = health;
		this.dead = dead;
	}
	
	public void setName(String name)
    {
        this.name = name;
    }

    public boolean isCarpenter() {
	    return "Carpenter".equals(name);
	}
	
    public boolean isFarmer() {
        return "Farmer".equals(name);
    }
    
    public boolean isBanker() {
        return "Banker".equals(name);
    }

	// Get methods.
	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public Point getCoordinates() {
		return coordinates;
	}

	public double getMoney() {
		return money;
	}

	public double getHealth() {
		return health;
	}
	
	
	
	@Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((coordinates == null) ? 0 : coordinates.hashCode());
        result = prime * result + ((description == null) ? 0 : description.hashCode());
        long temp;
        temp = Double.doubleToLongBits(health);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(money);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((occupation == null) ? 0 : occupation.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Actor other = (Actor) obj;
        if (coordinates == null) {
            if (other.coordinates != null)
                return false;
        } else if (!coordinates.equals(other.coordinates))
            return false;
        if (description == null) {
            if (other.description != null)
                return false;
        } else if (!description.equals(other.description))
            return false;
        if (Double.doubleToLongBits(health) != Double.doubleToLongBits(other.health))
            return false;
        if (Double.doubleToLongBits(money) != Double.doubleToLongBits(other.money))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (occupation == null) {
            if (other.occupation != null)
                return false;
        } else if (!occupation.equals(other.occupation))
            return false;
        return true;
    }
    
    public boolean isDead() {
        return dead;
    }

    public void setDead(boolean dead) {
        this.dead = dead;
    }

    @Override
	public String toString() {
		return "Actor{occupation=" + occupation + "name=" + name + ", description=" + description + ", coordinates=" + coordinates + ", money=" + money + ", health=" + health + '}';
	}

    public String getOccupation()
    {
        return occupation;
    }

    public void setOccupation(String occupation)
    {
        this.occupation = occupation;
    }
    
    public void accept(BaseVisitor v) {
        v.visitElement(this);
    }
}
