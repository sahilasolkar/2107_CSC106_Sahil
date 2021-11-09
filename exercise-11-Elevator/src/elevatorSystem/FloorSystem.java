package elevatorSystem;

public class FloorSystem {
	
	FloorButton[] floorbuttons = {};

	public void requestup(Elevator ele, FloorButton floor)
	{
		if(ele.state=="stop")
		{
			if(ele.currentfloor<floor.floorNumber)
			{
				ele.queuedir.add("up");
				ele.targetfloor=floor.floorNumber;
				
			}
			else if (ele.currentfloor>floor.floorNumber)
			{
				ele.queuedir.add("down");
				
				
			}
			
		}
		
		else if (ele.direction=="up")
		{
			
			
		}
	}
	
	public void requestdown(Elevator ele)
	{
		
	}
}
