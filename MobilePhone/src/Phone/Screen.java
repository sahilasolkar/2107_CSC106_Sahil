package Phone;

public class Screen {
	
	Company companynm;
	
	String pixelQality;

	public Screen(Company companynm, String pixelQality) {
		super();
		this.companynm = companynm;
		this.pixelQality = pixelQality;
	}
	


	public void setCompanynm(Company companynm) {
		this.companynm = companynm;
	}


	public String getPixelQality() {
		return pixelQality;
	}




	public void setPixelQality(String pixelQality) {
		this.pixelQality = pixelQality;
	}




	public String getScreenCompany()
	{
		return companynm.getCompanyname();
	}

}
