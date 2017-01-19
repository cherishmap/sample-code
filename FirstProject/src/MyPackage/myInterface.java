package MyPackage;

public interface myInterface 
{
	
	public void method1();
	public void method2();

}

 class XYZ implements myInterface
{
	public void method1()
	{
		System.out.println("this is method 1");
	}
	public void method2()
	{
		System.out.println("this is method 2");
	}
	
	public static void main (String arg[])
	{
		myInterface obj= new XYZ();
		
		obj.method1();
		obj.method2();
	}
}