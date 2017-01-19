package MyPackage;


public class trycatch 
{
	public static void main(String[] args)
	{
	
	
	try
	{
		int n=100/0;
		
		int a[]=new int[2];
		
		System.out.println("the value of a is "+a[3]);
	}
	catch(ArithmeticException e)
	{
		System.out.println("we can not divide by zero/catch block is called");
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("this is know as array out of bounds exception");
	}
	catch(Exception e)
	{
		System.out.println("this excption can not be written on the begining or at the ending. this should be written at the end");
	}
	finally //finally block executes when try block exits. This executs even if unexpected error occurs.  
	{
		System.out.println("Finally block is called"); //System.exit() is the only thing which allows not to execute finally block
	} 
	}

}
