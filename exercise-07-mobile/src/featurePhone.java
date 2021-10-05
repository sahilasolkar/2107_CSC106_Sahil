
public abstract class featurePhone extends mobilePhone {

	public featurePhone(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public static void setpolyRingtone(featurePhone[] fPhone)
	{
		for (int i = 0; i< fPhone.length ; i++)
		{
			
			System.out.println("polyPhonic Ringtone is all set for the phone - "+fPhone[i].name);
			
		}
		return;
	}
	

}
