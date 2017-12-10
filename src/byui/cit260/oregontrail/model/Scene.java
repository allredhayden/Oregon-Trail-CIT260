package byui.cit260.oregontrail.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Scene implements Serializable {

    @Override
    public String toString() {
        return "Scene{" + "description=" + description + ", blocked=" + blocked + ", symbol=" + symbol + ", question=" + question + "visited=" + visited + '}';
    }
	
	protected String description;
	protected boolean blocked;
	protected String symbol;
	protected boolean visited = false;

    public Scene(String description, boolean blocked, String symbol) {
        super();
        this.description = description;
        this.blocked = blocked;
        this.symbol = symbol;
    }

    protected Question question;
        
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
	
	public void setBlocked(boolean blocked) {
		this.blocked = blocked;
	}
	
	// Get & set symbol.
	public String getSymbol() {
       return (visited == false) ? "??" : symbol;
	}
	
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
        
        public Question getQuestion() {
            return question;
        }

        public void setQuestion(Question question) {
            this.question = question;
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
        Scene other = (Scene) obj;
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
    
    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }	
	
}
