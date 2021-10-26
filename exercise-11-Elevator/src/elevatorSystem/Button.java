package elevatorSystem;

public abstract class Button {
	
	int floorNumber;
	String direction;
	
	Button(String direction)
	{
		this.direction = direction;
		
	}
	
	Button(int floorNumber)
	{
		this.floorNumber = floorNumber;
		
	}

}
