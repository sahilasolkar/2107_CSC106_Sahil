package elevatorSystem;

public class Floor {

	int floor;
	//public static String dir;
	
	Button[] floorbuttons = {new FloorButton("UP"), new FloorButton("DOWN")};
	
	public Floor(int floor)
	{
		this.floor = floor;
	}
	
	public void print()
	{
		System.out.println("this is a floor");
	}
}
