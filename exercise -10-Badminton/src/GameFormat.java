
public abstract class GameFormat {

	String player, player1, player2, gender, gender1, gender2;
	
	GameFormat(String player, String gender)
	{
		this.player=player;
		this.gender=gender;
		
	}
	
	GameFormat(String player1, String player2, String gender)
	{
		this.player1=player1;
		this.player2=player2;
		this.gender= gender;
	}
	
	GameFormat(String player1, String gender1, String player2, String gender2)
	{
		this.player1=player1;
		this.gender1=gender1;
		this.player2=player2;
		this.gender2= gender2;
	}
	
	public abstract void displayTeam();
}
