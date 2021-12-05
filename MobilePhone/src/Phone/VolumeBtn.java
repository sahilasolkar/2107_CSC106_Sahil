package Phone;

public class VolumeBtn extends Button {

	
	public void pressbtnup() {
		// TODO Auto-generated method stub
		if(vol<=5)
		{
			vol++;
			System.out.println("volume = "+vol);
		}
		else
		{
			System.out.println("max volume reached");
		}
		
		
	}

	
	public void pressbtndown() {
		// TODO Auto-generated method stub
		if(vol>=0)
		{
			vol--;
			System.out.println("volume = "+vol);
		}
		else
		{
			System.out.println("min volume reached");
		}
		
	}

}
