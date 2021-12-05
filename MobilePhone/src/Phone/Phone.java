package Phone;

public class Phone {
	
	
	Company samsung = new Company("samsung");
	
	Company sony = new Company("sony");
	
	Company mi = new Company("mi");
	
	Company oneplus = new Company("oneplus");
	
	
	//screen
	Screen amoled = new Screen(samsung, "4k");
	
	
	//buttons
	PowerBtn powerbtn = new PowerBtn();
	
	Dndbtn dndbtn = new Dndbtn();
	
	VolumeBtn  volbtn = new VolumeBtn();
	
	//camera
	CameraSensor camsense  = new CameraSensor(sony, 12, "imx");
	
	//os
	OperatingSystem oxygenos = new OperatingSystem(oneplus, "oxygen");
	

}
