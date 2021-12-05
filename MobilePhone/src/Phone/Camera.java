package Phone;

public abstract class Camera {
	
	Company companynm;
	
	int megapixel;
	
	public Camera(Company companynm, int megapixel) {
		super();
		this.companynm = companynm;
		this.megapixel = megapixel;
	}

	public Company getCompanynm() {
		return companynm;
	}

	public void setCompanynm(Company companynm) {
		this.companynm = companynm;
	}

	public int getMegapixel() {
		return megapixel;
	}

	public void setMegapixel(int megapixel) {
		this.megapixel = megapixel;
	}
	
	

}
