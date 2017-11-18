package byui.cit260.oregontrail.model;

import java.io.Serializable;

public class Question implements Serializable {
    
    private String question;
    private String answer;
    private int points;

    public Question() {
        // Default constructor.
    }
    
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
