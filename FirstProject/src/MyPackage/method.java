package MyPackage;

public class method {
	
	method()
	{
		
	}
	
	
	int a =1;
	int b=2;
	static int c;
	public int addition()
	{
		c=a+b;
		return c;
		
	}

	public static void main(String[] args) 
	
	{
		method obj=new method();
		obj.addition();
		System.out.println(c);
	
	myMethod("cherishma");

	int sum= myMethodSum(4,5);
	System.out.println(sum);
	}
	public static void myMethod(String name)
	{
	System.out.println("hello " +name);	
	}
	public static int myMethodSum (int a, int b)
	{
	return (a+b);
	
	
	}
}
