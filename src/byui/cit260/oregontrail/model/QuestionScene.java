package byui.cit260.oregontrail.model;

public class QuestionScene extends Scene {
    
    private boolean noToAnswer;
    private boolean bonus;

    // Get & set noToAnswer.
    public boolean getNoToAnswer() {
        return noToAnswer;
    }
    
    public void setNoToAnswer(Boolean answer) {
        answer = noToAnswer;
    }

    // Get & set bonus.
    public boolean getBonus(boolean bonus) {
        return bonus;
    }
    
    public void setBonus(boolean bonus) {
        this.bonus = bonus;
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + (this.noToAnswer ? 1 : 0);
        hash = 79 * hash + (this.bonus ? 1 : 0);
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
        final QuestionScene other = (QuestionScene) obj;
        if (this.noToAnswer != other.noToAnswer) {
            return false;
        }
        if (this.bonus != other.bonus) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "QuestionScene{" + "noToAnswer=" + noToAnswer + ", bonus=" + bonus + '}';
    }
}
