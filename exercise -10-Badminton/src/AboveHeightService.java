
public class AboveHeightService extends Foul {

	public AboveHeightService(double parameter) {
		super(parameter);
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Maximum Height allowed while serving = "+parameter+" m");
	}
	
}
