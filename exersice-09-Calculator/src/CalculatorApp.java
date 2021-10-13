
public class CalculatorApp extends Operations {
	
	static char operand;
	
	int num1, num2;
	//constructor empty
	public CalculatorApp()
	{
		System.err.println("Calculator Created");
	}
	
	
	//operand  operator operand
	public CalculatorApp( int num1, char operand, int num2) {
		super();
		CalculatorApp.operand = operand;
		this.num1 = num1;
		this.num2 = num2;
	}
	
	//operand operator
	public CalculatorApp( int num1, char operand) {
		super();
		CalculatorApp.operand = operand;
		this.num1 = num1;
		
	}
	
	public void Calculate(int num1, char operand, int num2)
	{
		switch(operand)
		{
		case '+' : 
			add(num1, num2);
			break;
			
		case '-' :
			sub(num1, num2);
			break;
			
		case '*' :
			mul(num2, num1);
			break;
			
		case '/' :
			div(num1, num2);
			break;
			
			
		}
	}
	

}
