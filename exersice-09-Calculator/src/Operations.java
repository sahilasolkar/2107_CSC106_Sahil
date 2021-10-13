import java.lang.Math;
public class Operations implements AdvanceOperations, BasicOperations, CalculatorFeatures{
	//basic operations
	
	
	public static String CalculatorStatus = "off";
	int mem;
	
	@Override
	public void add(int a, int b) {
		// TODO Auto-generated method stub
		if (CalculatorStatus=="off")
		{
			System.out.println("please switch on the calculator to use");
		}
		else
		{
		System.out.println(a+b);
		}
	}

	@Override
	public void add(int a) {
		// TODO Auto-generated method stub
		if (CalculatorStatus=="off")
		{
			System.out.println("please switch on the calculator to use");
		}
		else
		{
		System.out.println(a+a);
		}
	}

	@Override
	public void div(int a, int b) {
		// TODO Auto-generated method stub
		if (CalculatorStatus=="off")
		{
			System.out.println("please switch on the calculator to use");
		}
		else
		{
		float c = (float) a/b;
		System.out.println(c);
		}
	}

	@Override
	public void div(int a) {
		// TODO Auto-generated method stub
		if (CalculatorStatus=="off")
		{
			System.out.println("please switch on the calculator to use");
		}
		else
		{
		System.out.println("1");
		}
	}

	@Override
	public void mul(int a, int b) {
		// TODO Auto-generated method stub
		if (CalculatorStatus=="off")
		{
			System.out.println("please switch on the calculator to use");
		}
		else
		{
		System.out.println(a*b);
		}
	}

	@Override
	public void mul(int a) {
		// TODO Auto-generated method stub
		if (CalculatorStatus=="off")
		{
			System.out.println("please switch on the calculator to use");
		}
		else
		{
		System.out.println(a*a);
		}
	}

	@Override
	public void sub(int a, int b) {
		// TODO Auto-generated method stub
		if (CalculatorStatus=="off")
		{
			System.out.println("please switch on the calculator to use");
		}
		else
		{
		System.out.println(a-b);
		}
	}

	@Override
	public void sub(int a) {
		// TODO Auto-generated method stub
		if (CalculatorStatus=="off")
		{
			System.out.println("please switch on the calculator to use");
		}
		else
		{
		System.out.println("0");
		}
	}
	
	
	@Override
	public void sqrt(double a) {
		// TODO Auto-generated method stub
		if (CalculatorStatus=="off")
		{
			System.out.println("please switch on the calculator to use");
		}
		else
		{
		System.out.println(Math.sqrt(a));
		}
	}

	@Override
	public void log(double a) {
		// TODO Auto-generated method stub
		if (CalculatorStatus=="off")
		{
			System.out.println("please switch on the calculator to use");
		}
		else
		{
		System.out.println(Math.log(a));
		}
	}

	@Override
	public void expo(double a, double b) {
		// TODO Auto-generated method stub
		if (CalculatorStatus=="off")
		{
			System.out.println("please switch on the calculator to use");
		}
		else
		{
		System.out.println(Math.pow(a, b));
		}
	}

	@Override
	public void on() {
		// TODO Auto-generated method stub
		
		CalculatorStatus = "on";
		System.out.println("Calculator started");
		
		
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		CalculatorStatus = "off";
		System.out.println("Shutting down Calculator");
	}

	@Override
	public void memoryStore(int a) {
		// TODO Auto-generated method stub
		if (CalculatorStatus=="off")
		{
			System.out.println("please switch on the calculator to use");
		}
		else
		{
		mem = a;
		System.out.println(mem + " stored in memory");
		}
	}

	@Override
	public void memoryClear() {
		
		// TODO Auto-generated method stub
		if (CalculatorStatus=="off")
		{
			System.out.println("please switch on the calculator to use");
		}
		else
		{
		mem = 0;
		System.out.println("memory cleared");
		}
	}

	@Override
	public void memoryDisplay() {
		// TODO Auto-generated method stub
		if (CalculatorStatus=="off")
		{
			System.out.println("please switch on the calculator to use");
		}
		else
		{
		System.out.println(mem);
		}

	}
	
}
	
	
	


