package Phone;

public class PowerBtn extends Button{
	
	public void pressbtn()
	{
		if (btnstate=="off")
		{
			
			System.out.println("device started");
			btnstate="on";
		}
		else
		{
			System.out.println("device poweroff ");
			btnstate="off";
		}
	}

}
