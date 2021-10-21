
public class Badminton {

	public GameFormat[] gameformat;
	public Rule[] rule;
	public GameComponents[] gamecomp;
	public CourtComponents[] courtcomp;
	public Official[] offs;
	
	public Badminton()
	{
		gameformat = new GameFormat[3];
		rule = new Rule[3];
		gamecomp = new GameComponents[2];
		courtcomp = new CourtComponents[5];
		offs = new Official[6]; 
	}
	
	public void createGame(GameFormat[] teams, Rule[] rules, GameComponents[] gameComponents, CourtComponents[] courtcomponents, Official[] officials )
	{
		
		Integer a=0;
		for(int i=0;a<teams.length; i++, a++)
		{
			gameformat[i]=teams[a];
			
		}
		Integer b=0;
		for(int j=0;b<rules.length; j++, b++)
		{
			rule[j]=rules[b];
			
		}
		Integer c=0;
		for(int k=0;c<gameComponents.length; k++, c++)
		{
			gamecomp[k]=gameComponents[c];
			
		}
		
		Integer d=0;
		for(int l=0;d<courtcomponents.length; l++, d++)
		{
			courtcomp[l]=courtcomponents[d];
			
		}
		
		Integer e=0;
		for(int m=0;e<officials.length; m++, e++)
		{
			offs[m]=officials[e];
			
		}
		
		
		
		
		
		
	}
	
	public void print()
	{
		
		for (int i=0; i<gameformat.length;i++)
		{
			gameformat[i].displayTeam();
		}
		for (int j=0; j<rule.length;j++)
		{
			rule[j].display();
		}
		for (int k=0; k<gamecomp.length;k++)
		{
			gamecomp[k].display();
		}
		for (int l=0; l<courtcomp.length;l++)
		{
			courtcomp[l].display();
		}
		for (int m=0; m<offs.length;m++)
		{
			offs[m].display();
		}
		
		
		
		
	}
}
