package elevatorSystem;

public class Floor {

	int floor;
	
	FloorButton floorbutton;
	
	public Floor(int floor)
	{
		this.floor = floor;
		this.floorbutton = new FloorButton(floor);
		System.out.println("floor"+floor+"created");
	}
	
	
	public int getfloor()
	{
		return floor;
	}
	
	
}
