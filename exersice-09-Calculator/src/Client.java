
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculatorApp cal;
		
		cal = new CalculatorApp();
		cal.on();
		cal.Calculate(4,'+',3);
		
		
		cal.add(5, 4);
		cal.off();
		cal.mul(3,5);
		cal.on();
		cal.log(10);
		cal.sqrt(49);
		cal.add(80);
		cal.div(9);
		cal.memoryStore(500);
		cal.memoryDisplay();
		cal.memoryClear();
		cal.memoryDisplay();
		

	}

}
