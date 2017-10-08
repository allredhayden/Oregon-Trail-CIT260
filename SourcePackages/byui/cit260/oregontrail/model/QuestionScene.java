package byui.cit260.oregontrail.model;

import java.io.Serializable;

public class QuestionScene implements Serializable {
	
	private boolean noToAnswer;
	private boolean bonus;
	
	public boolean getNoToAnswer() {
		return noToAnswer;
	}
	
	public void setNoToAnswer() {
		this.noToAnswer = noToAnswer;
	}
	
	public boolean getBonus(boolean bonus) {
		return bonus;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + (bonus ? 1231 : 1237);
		result = prime * result + (noToAnswer ? 1231 : 1237);
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
		QuestionScene other = (QuestionScene) obj;
		if (bonus != other.bonus)
			return false;
		if (noToAnswer != other.noToAnswer)
			return false;
		return true;
	}

	@Override
	public String toString()
	{
		return "QuestionScene [noToAnswer=" + noToAnswer + ", bonus=" + bonus + "]";
	}
	
	
}
