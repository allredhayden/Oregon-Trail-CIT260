package byui.cit260.oregontrail.model;

import java.io.Serializable;

public class Wagon implements Serializable {
	
	private int durability;
	private int speed;
	private boolean wagonStatus;
	
	public int getDurability()
	{
		return durability;
	}
	public void setDurability(int durability)
	{
		this.durability = durability;
	}
	public int getSpeed()
	{
		return speed;
	}
	public void setSpeed(int speed)
	{
		this.speed = speed;
	}
	public boolean isWagonStatus()
	{
		return wagonStatus;
	}
	public void setWagonStatus(boolean wagonStatus)
	{
		this.wagonStatus = wagonStatus;
	}
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + durability;
		result = prime * result + speed;
		result = prime * result + (wagonStatus ? 1231 : 1237);
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
		Wagon other = (Wagon) obj;
		if (durability != other.durability)
			return false;
		if (speed != other.speed)
			return false;
		if (wagonStatus != other.wagonStatus)
			return false;
		return true;
	}
	@Override
	public String toString()
	{
		return "Wagon [durability=" + durability + ", speed=" + speed + ", wagonStatus=" + wagonStatus + "]";
	}
}