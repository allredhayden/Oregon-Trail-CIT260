package byui.cit260.oregontrail.model;
        

public class OregonTrail {

	public static void main(String[] args) {
	
		// Create player.
		Player playerOne = new Player();
		playerOne.setPlayerName("Fred Flintstone");
		playerOne.setBestTime(7.00);
		
		String playerOneName = playerOne.getPlayerName();
		double playerOneTime = playerOne.getBestTime();
		
   	    System.out.println(playerOne.toString());
            System.out.println(Actor.Banker.getName());
            
            //test Location.java
            Location location = new Location();
            location.setAmountRemaining(1);
            location.setColumn(2);
            location.setCurrentGeography("Idaho");
            location.setRow(3);
            location.setVisited(true);
            System.out.println(location.toString());
            
            //test Score.java
            Score score = new Score();
            score.setCurrentScore(1000);
            score.setHighScore(1588);
            score.setRequiredScore(1250);
            int[] values = {3, 6};
            score.setScoreList(values);
            System.out.println(score.toString());
            
            //test Weather.java
            Weather weather = new Weather();
            weather.setWeatherType("Windy");
            System.out.println(weather.toString());
            
	}
}


