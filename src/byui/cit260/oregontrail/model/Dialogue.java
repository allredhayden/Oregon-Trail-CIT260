package byui.cit260.oregontrail.model;

import java.io.Serializable;

public class Dialogue implements Serializable {
	
	public static String[] questions = new String[] 
			{"This is question zero."
			,"This is question one."
			,"This is question two."
			,"This is question three."
			,"This is question four."
			,"This is quesiton five."};
	
	public static String[] answers = new String[]
			{"This is answer number one."
			,"This is answer number two."
			,"This is answer number three."
			,"This is answer number four."
			,"This is answer number five."};

	public static String[] getQuestions()
	{
		return questions;
	}

	public static String[] getAnswers()
	{
		return answers;
	}
}
