package Phone;

public class OperatingSystem {
	
	Company companynm;
	
	String osname;
	
	public OperatingSystem(Company companynm, String osname) {
		super();
		this.companynm = companynm;
		this.osname = osname;
	}
	
	public String getosCompany()
	{
		return companynm.getCompanyname();
	}

}
