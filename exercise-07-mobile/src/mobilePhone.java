
public abstract class mobilePhone {
	
	String name;

	public mobilePhone(String name) {
		super();
		this.name = name;
		
		//System.out.println(name +" created");
	}
	
	public static void startPhone(mobilePhone[] mPhone) {
		
		for (int i=0;i<mPhone.length;i++)
		{
			System.out.println("starting - "+mPhone[i].name);
		}
		return;
	}

}
