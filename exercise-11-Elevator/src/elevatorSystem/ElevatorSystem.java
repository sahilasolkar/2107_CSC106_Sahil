package elevatorSystem;

public class ElevatorSystem {
	
	
	
	public void gotofloor(Elevator ele, int floor)
	{
		if(ele.currentfloor==floor)
		{
			System.out.println("you are already on that floor");
			
			
		}
		
		if (ele.direction=="up")
		{
			if(ele.currentfloor<floor)
			{
				ele.queueup.add(floor);
				
			}
			else 
			{
				ele.queuedown.add(floor);
			}
		}
		
		else if (ele.direction=="down")
		{
			if(ele.currentfloor>floor)
			{
				ele.queuedown.add(floor);
				
			}
			else 
			{
				ele.queueup.add(floor);
			}
		}
		
		else 
		{
			if (ele.currentfloor< floor)
			{
				ele.queueup.add(floor);
				ele.queuedir.add("up");
			}
			else if (ele.currentfloor>floor)
			{
				ele.queuedown.add(floor);
				ele.queuedir.add("down");
			}
		}
	}
	
	
	
	
	public void processRequest(Elevator ele, Floor[] floor)
	{
		
		
		String dircheck = ele.queuedir.poll();
		
		
		
		
		if (dircheck=="up")
		{
			ele.direction=dircheck;
			ele.currentfloor=ele.queueup.poll();
			for(int i=0;i<=5;i++)
			{
			floor[i].floorbutton.display.setCurrentfloor(ele.currentfloor);
			floor[i].floorbutton.display.setDirection(ele.direction);
			}
			
		}
		else if (dircheck == "down")
		{
			ele.direction=dircheck;
			ele.currentfloor=ele.queuedown.poll();
			for(int i=0;i<=5;i++)
			{
			floor[i].floorbutton.display.setCurrentfloor(ele.currentfloor);
			floor[i].floorbutton.display.setDirection(ele.direction);
			}
		}
		else if (dircheck==null)
		{
			System.out.println("there are no requests");
			ele.direction=dircheck;
			if (ele.queueup.peek()!=null)
			{
				ele.currentfloor=ele.queueup.poll();
				
			}
			else if (ele.queuedown.peek()!=null)
			{
				ele.currentfloor=ele.queuedown.poll();
			}
			
			for(int i=0;i<=5;i++)
			{
			floor[i].floorbutton.display.setCurrentfloor(ele.currentfloor);
			floor[i].floorbutton.display.setDirection(ele.direction);
			}
		}
		
	}
	
	public void requestup(int curflr, Floor[] floor, Elevator ele)
	{
		if(curflr==ele.currentfloor)
		{
			System.out.println("doors opening");
			/*for(int i=0;i<=5;i++)
			{
			floor[i].floorbutton.display.setCurrentfloor(ele.currentfloor);
			floor[i].floorbutton.display.setDirection("stop");
			}
			*/
			
		}
		
		else 
		{
			ele.queuedir.add("up");
			gotofloor(ele, curflr);
			/*for(int i=0;i<=5;i++)
			{
			floor[i].floorbutton.display.setCurrentfloor(ele.currentfloor);
			floor[i].floorbutton.display.setDirection(ele.direction);
			}
			*/
			
		}
		
	}
	
	public void requestdown(int curflr, Floor[] floor, Elevator ele)
	{
		if(curflr==ele.currentfloor)
		{
			System.out.println("doors opening");
			/*for(int i=0;i<=5;i++)
			{
			floor[i].floorbutton.display.setCurrentfloor(ele.currentfloor);
			floor[i].floorbutton.display.setDirection("stop");
			}
			*/
		}
		
		else 
		{
			ele.queuedir.add("down");
			gotofloor(ele, curflr);
			/*for(int i=0;i<=5;i++)
			{
			floor[i].floorbutton.display.setCurrentfloor(ele.currentfloor);
			floor[i].floorbutton.display.setDirection(ele.direction);
			}
			*/
		}
		
	}
	
	

}


