package Phone;

public class Dndbtn extends Button {

	public void slidbtn(String action)
	{
		if(action=="up")
		{
			System.out.println("the device is put on dnd mode");
		}
		else if (action == "down")
		{
			System.out.println("the device is removed from dnd mode");
		}
		else
		{
			
		}
	}
	

}
