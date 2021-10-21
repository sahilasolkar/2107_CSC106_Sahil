
public abstract class GameComponents {
	
	String name;
	double parameter;
	

	GameComponents(double parameter) {
		this.parameter = parameter;
	}



	GameComponents(String name)
	{
		this.name=name;
	}
	


	public abstract void display();

}