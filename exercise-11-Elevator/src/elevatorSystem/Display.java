package elevatorSystem;

public class Display {
	
	int currenfloor;
	String dir;
	
	public Display() {
		
		this.currenfloor = 0;
		this.dir = null;
	}
	
	//setters 
	
	public void setCurrentfloor(int cf)
	{
		this.currenfloor = cf;
	}
	
	public void setDirection(String dir)
	{
		this.dir = dir;
	}
	
	
	//getters
	
	public int getfloor()
	{
		return currenfloor;
	}
	
	public String getdirection()
	{
		return dir;
	}
	
	public void display()
	{
		System.out.println("this lift is currently on floor "+currenfloor + "\nthe direction of the lift is:" + dir);
	}
	
	

}
