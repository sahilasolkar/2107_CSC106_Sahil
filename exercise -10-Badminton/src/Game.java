
public class Game {

	public static void main(String[] args) {
	
		GameFormat[] teams = {new Double("pv sindhu", "saina", "female"), 
				              new MixedDouble("pv sindhu", "female", "shrikanth", "male"),
				              new Single("sahil", "male")};
		
		Rule[] rules= {new AboveHeightService(1.15), 
					   new ShortService(1.98), 
					   new WrongSideService()};
		
		GameComponents[] gamecomponent = {new Racket("yonex"), 
										  new ShuttleCock("cosco")};
		
		CourtComponents[] courtcomponent = {new Net(1.55), 
											new ServiceLine(1.98), 
											new DoublesWidth(6.1), 
											new SinglesWidth(5.18),
											new CourtLenght(13.4)};
		
		Official[] officials = {new Refree("r1"), 
							   new ServiceJudge("sr"), 
							   new Umpire("ump"), 
							   new LineMan("middleline Judge", "mj1", "mj2"), 
							   new LineMan("baseline Judge", "bj1", "bj2"), 
							   new LineMan("sideline Judge", "sj1", "sj2")};
		
		
		Badminton game = new Badminton();
		
		
		game.createGame(teams, rules, gamecomponent, courtcomponent, officials);
		game.print();
		
		
		/*GameFormat teamA = new Double("pv sindhu", "saina", "female");
		GameFormat teamB = new MixedDouble("pv sindhu", "female", "shrikanth", "male");
		GameFormat teamC = new Single("sahil", "male");
		
		teamA.displayTeam();
		teamB.displayTeam();
		teamC.displayTeam();
		
		
		Rule rule1 = new AboveHeightService(1.15);
		Rule rule2 = new ShortService(1.98);
		Rule rule3 = new WrongSideService();
		
		rule1.display();
		rule2.display();
		rule3.display();
		
		
		GameComponents racket1= new Racket("yonex");
		GameComponents shuttlecock = new ShuttleCock("cosco");
		
		CourtComponents net = new Net(1.55);
		CourtComponents serviceline = new ServiceLine(1.98);
		CourtComponents doublesWidth = new DoublesWidth(6.1);
		CourtComponents singlesWidth = new SinglesWidth(5.18);
		
		
		racket1.display();
		shuttlecock.display();
		net.display();
		serviceline.display();
		doublesWidth.display();
		singlesWidth.display();
		
		
		
		Official refree = new Refree("r1");
		Official serviceJudge = new ServiceJudge("sr");
		Official umpire = new Umpire("ump");
		Official middlejudge = new LineMan("middleline Judge", "mj1", "mj2");
		Official baselinejudge = new LineMan("baseline Judge", "bj1", "bj2");
		Official sidelinejudge = new LineMan("sideline Judge", "sj1", "sj2");
		
		
		refree.display();
		serviceJudge.display();
		umpire.display();
		middlejudge.display();
		baselinejudge.display();
		sidelinejudge.display();
		*/
		
		

	}

}
