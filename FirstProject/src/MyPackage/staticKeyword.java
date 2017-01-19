hun package MyPackage;

public class staticKeyword 


{
	
	int a;int b;
	int staticKeyword(int a, int b)
	{
	 return (a+b);
	}
	static
	{
		System.out.println("Static Block");
	}

	public static void main(String[] args) 
	{
		staticKeyword obj=new staticKeyword();
		System.out.println("Main Method");
		student cherishma= new student();
		System.out.println(cherishma.getId());
		cherishma.setId(2);
		System.out.println(cherishma.getId());
	}
	
}
