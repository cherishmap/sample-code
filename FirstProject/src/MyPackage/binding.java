package MyPackage;

class parent
{
	void method()
	{
		System.out.println("from parent class");
	}
}
class child extends parent
{
	void method()
	{
		System.out.println("from child class");
	}
}
public class binding
{ 
	public static void main(String[] args) 
	{
		parent p=new parent();
		p.method();
		parent c=new child();
		c.method();
	}
	
}
