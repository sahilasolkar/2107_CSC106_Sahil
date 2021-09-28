package cricket;
public class Client {
	
	public static void main(String[] args) {
		
		Batsman batsman[] = {new Batsman("bat1", 10, 5, 3, 4.1f), new Batsman("bat2", 10, 3, 6, 5.2f)};
		
		Bowler bowler[] = {new Bowler("bow1", 15, 4, 2, 3, 2.1f), new Bowler("bow2", 20, 9, 5, 2, 3.1f)};
		
		printAll(batsman, bowler);
	}
	
	static void printAll(Batsman batsman[], Bowler bowler[]) {
		for(int i = 0; i < batsman.length; i++) {
			batsman[i].displayResults();
		}
		
		for(int i = 0; i < bowler.length; i++) {
			bowler[i].displayResults();
		}
	
	}
	
	
}