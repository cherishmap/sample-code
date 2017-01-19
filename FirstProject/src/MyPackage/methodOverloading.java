package MyPackage;

public class methodOverloading /*method overloading is defining different method with 
same name but different data type or different number of parameters*/  
{

	public static void main(String[] args) 
	{
		System.out.println(Add(2,3,4));
		System.out.println(Add(10.52,3.55));
		System.out.println(Add("hello","world"));
	}
	public static int Add (int a, int b, int c)
	{
		return(a+b+c);
	}
	public static double Add (double a, double b)
	{
		return(a+b);
	}
	public static String Add (String a,  String b)
	{
		return(a+b);
	}
}
