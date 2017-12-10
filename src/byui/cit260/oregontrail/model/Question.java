package byui.cit260.oregontrail.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Question implements Serializable {
    
    private String question;
    private String answer;
    private int points;

    public Question(String question, String answer, int points) {
        super();
        this.question = question;
        this.answer = answer;
        this.points = points;
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
