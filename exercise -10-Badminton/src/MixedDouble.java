
public class MixedDouble extends GameFormat {

	MixedDouble(String player1, String gender1, String player2, String gender2) {
		super(player1, gender1, player2, gender2);
		// TODO Auto-generated constructor stub
	}
	
	public void displayTeam()
	{
		System.out.println("team of - "+player1+"("+gender1+") and " +player2+ "("+gender2+") created");
	}

}
