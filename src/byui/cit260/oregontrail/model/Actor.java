package byui.cit260.oregontrail.model;
import java.awt.Point;
import java.io.Serializable;

public enum Actor implements Serializable {
	
	Carpenter("David", "A carpenter with skilled hands, capable of building any number of objects with his surroundings.", new Point(0,1), 6000, 100),
	Farmer("Bill", "A simple farmer, capable of growing food in any area that is sufficient for healthy crop growth.", new Point(1,1), 5000, 100),
	Banker("Eddie", "A sophisticated banker that is good with numbers and has a sharp wit.", new Point(1,2), 7000, 100);
	
	private String name;
	private String description;
	private Point coordinates;
	private double wealth;
	private double health;
	
	// Default constructor.
	Actor (String name, String description, Point coordinates, double wealth, double health) {
		this.name = name;
		this.description = description;
		this.coordinates = coordinates;
		this.wealth = wealth;
		this.health = health;
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

	public double getWealth() {
		return wealth;
	}

	public double getHealth() {
		return health;
	}
	
	@Override
	public String toString() {
		return "Actor{" + "name=" + name + ", description=" + description + ", coordinates=" + coordinates + ", wealth=" + wealth + ", health=" + health + '}';
	}
}
