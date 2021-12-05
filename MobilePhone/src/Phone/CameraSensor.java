package Phone;

public class CameraSensor extends Camera {

	
	String sensorname;
	
	public CameraSensor(Company companynm, int megapixel, String sensorname) {
		super(companynm, megapixel);
		this.sensorname=sensorname;
		// TODO Auto-generated constructor stub
	}

	public String getSensorname() {
		return sensorname;
	}

	public void setSensorname(String sensorname) {
		this.sensorname = sensorname;
	}
	
	public String getSensorCompany()
	{
		return companynm.getCompanyname();
	}

}
