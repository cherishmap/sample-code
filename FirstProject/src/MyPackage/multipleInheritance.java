package MyPackage;

public class multipleInheritance extends y 
{

	public void multipleInheritanceMethod() 
	{
		System.out.println("this is main class");
	}

	public static void main(String[] args) 
	{
		multipleInheritance obj= new multipleInheritance();
		
		obj.methodX();
		obj.methodY();
		obj.multipleInheritanceMethod();
	}

	
}
	class x
	{
		public void methodX()
		{
			System.out.println(" this is method X");
		}
	}
	class y extends x
	{
		public void methodY()
		{
			System.out.println("this is method Y");
		}
	}


