package MyPackage;

public class try_catch_finally 
{
	
	public static int retInt()
	{
	int a=100;
	
	try
	{
		a=a/0;
		return a; 
	}
	catch(ArithmeticException e)
	{
		System.out.println("Catch block is called");
		System.out.println(e);
		return a;
	}
	finally
	{
		System.out.println("finally block is called");
		a=5000;
		return a;
	}
	}
	public static void main(String[] args) 
	{
		System.out.println(retInt());
	}

}
