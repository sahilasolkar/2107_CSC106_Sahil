package elevatorSystem;

public class FloorButton extends Button {
	
	Display display;
	
	

	public FloorButton(int floor) {
		super();
		this.floorNumber=floor;
		this.display = new Display();
		// TODO Auto-generated constructor stub
	}
	
	public int getfloor()
	{
		return floorNumber;
	}

	

	

}
