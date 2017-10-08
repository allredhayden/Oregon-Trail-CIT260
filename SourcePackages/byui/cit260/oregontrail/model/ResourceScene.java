package byui.cit260.oregontrail.model;

import java.io.Serializable;

public class ResourceScene implements Serializable {
	private int amount;
	
	// Get & set amount.
	public int getAmount() {
		return amount;
	}
	
	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + amount;
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
		ResourceScene other = (ResourceScene) obj;
		if (amount != other.amount)
			return false;
		return true;
		}

	@Override
	public String toString() {
		return "ResourceScene [amount=" + amount + "]";
		}
}
