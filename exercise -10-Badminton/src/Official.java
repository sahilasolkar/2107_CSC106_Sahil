
public abstract class Official {
	
	String name, name1, role;
	

	public Official(String name) {
		
		this.name = name;
	}
	
	public Official(String role, String name, String name1)
	{
		this.name=name;
		this.name1=name1;
		this.role=role;
	}

	public abstract void display();

}
