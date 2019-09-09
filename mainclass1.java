package singleton;

public class mainclass1 
{
	public static void main(String[] args) 
	{
		calculator c1 = calculator.get calculator();
		calculator c2 = calculator.get calculator();
	}
}