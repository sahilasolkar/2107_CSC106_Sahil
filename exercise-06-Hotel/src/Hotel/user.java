package Hotel;

public abstract class user {
	
	String name;
	
	Integer age;
	
	public user(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public static void listage(user[] u) {
		
		for(int i=0; i<u.length ; i++)
		{
			System.out.print(" \n the age of " +u[i].name +" is " +u[i].age);
		}
		
		return;
	}
	

}
