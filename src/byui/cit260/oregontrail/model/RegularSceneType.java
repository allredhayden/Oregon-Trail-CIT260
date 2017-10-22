package byui.cit260.oregontrail.model;

import java.io.Serializable;

public class RegularSceneType implements Serializable {
	
	private String description;
	private boolean blocked;
	private String symbol;
	
	// Get & set description.
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	// Get & set blocked.
	public boolean getBlocked() {
		return blocked;
	}
	
	public void SetBlocked(boolean blocked) {
		this.blocked = blocked;
	}
	
	// Get & set symbol.
	public String getSymbol() {
		return symbol;
	}
	
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (blocked ? 1231 : 1237);
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((symbol == null) ? 0 : symbol.hashCode());
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
		RegularSceneType other = (RegularSceneType) obj;
		if (blocked != other.blocked)
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (symbol == null) {
			if (other.symbol != null)
				return false;
		} else if (!symbol.equals(other.symbol))
			return false;
		return true;
		}
	
	@Override
	public String toString() {
		return "RegularSceneType [description=" + description + ", blocked=" + blocked + ", symbol=" + symbol + "]";
		}
}
