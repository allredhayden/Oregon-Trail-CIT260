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
	}
}


