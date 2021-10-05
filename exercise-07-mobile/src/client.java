
public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		smartPhone sm1 = new smartPhone("pocox2");
		smartPhone sm2 = new smartPhone("redmiNote9");
		smartPhone sm3 = new smartPhone("iphone12");
		
		BWfeaturePhone bw1 = new BWfeaturePhone("nokia 3310");
		BWfeaturePhone bw2 = new BWfeaturePhone("lava");
		BWfeaturePhone bw3 = new BWfeaturePhone("intex");
		
		
		smartEnabledPhone smp1 = new smartEnabledPhone("jio");
		smartEnabledPhone smp2 = new smartEnabledPhone("blackberry");
		smartEnabledPhone smp3 = new smartEnabledPhone("nokia");
		
		mobilePhone[] mP = {sm1, sm2, sm3, bw1, bw2, bw3, smp1, smp2, smp3};
		featurePhone[] fP = {bw1, bw2, bw3, smp1, smp2, smp3};
		
		
		mobilePhone.startPhone(mP);
		
		featurePhone.setpolyRingtone(fP);
		
		
		
		
	    

	}
	
	
    
}
