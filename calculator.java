package singleton;

public class calculator 
{
	private static calculator1 calci = new calculator1();
	private calculator()
	{
		System.out.println("calculator object is created.....");
	}
	public static calculator1 get calculator() 
	{
		return calci;
	}
	//some methods
}
//hrraji.jobssure@gmail.com