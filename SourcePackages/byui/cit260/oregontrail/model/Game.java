package byui.cit260.oregontrail.model;

import java.io.Serializable;

public class Game implements Serializable
{

	private double totalTime;
	private boolean noPeople;
	private Player player;

	public Game()
	{
		// Default constructor.
	}

	// Get & set player.
	public Player getPlayer()
	{
		return player;
	}

	public void setPlayer(Player player)
	{
		this.player = player;
	}

	// Get & set totalTime.
	public double getTotalTime()
	{
		return totalTime;
	}

	public void setTotalTime(double totalTime)
	{
		this.totalTime = totalTime;
	}

	// Get & set noPeople.
	public boolean isNoPeople()
	{
		return noPeople;
	}

	public void setNoPeople(boolean noPeople)
	{
		this.noPeople = noPeople;
	}

	@Override
	public int hashCode()
	{
		int hash = 7;
		hash = 29 * hash
				+ (int) (Double.doubleToLongBits(this.totalTime) ^ (Double.doubleToLongBits(this.totalTime) >>> 32));
		hash = 29 * hash + (this.noPeople ? 1 : 0);
		return hash;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final Game other = (Game) obj;
		if (Double.doubleToLongBits(this.totalTime) != Double.doubleToLongBits(other.totalTime)) {
			return false;
		}
		return this.noPeople == other.noPeople;
	}

    @Override
    public String toString() {
        return "Game{" + "totalTime=" + totalTime + ", noPeople=" + noPeople + ", player=" + player + '}';
    }
}
