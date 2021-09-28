package Hotel;

public abstract class staff extends user{
	
	
	public Integer leavesTaken;



	public staff(String name, Integer age, Integer leavesTaken) {
		super(name, age);
		this.leavesTaken = leavesTaken;
		// TODO Auto-generated constructor stub
	}
	
	
	
	public static Integer totleaves(staff[] s) {
		
		Integer totleav = 0;
		for (int i = 0; i < s.length; i++)
		{
			totleav = totleav + s[i].leavesTaken;
			
		}
		return totleav;
		
		
		
		
	}
	
	

}
