
public class Double extends GameFormat{

	Double(String player1, String player2, String gender) {
		super(player1, player2, gender);
		// TODO Auto-generated constructor stub
	}
	
	public void displayTeam()
	{
		System.out.println("team of - " +player1+ " and " +player2+ " in the doubles " +gender+ " category created" );
	}

}
