package MyPackage;

public class constructor 
{
		
		public static void main(String[] args) 
		{
			demo t1=new demo(5);
			demo t2=new demo(10);
			System.out.println(t1.x+" "+t2.x);
			
			demo2 t3=new demo2();
			demo2 t4=new demo2();
			System.out.println(t3.x+" "+t4.x);

		}
	
}
class demo
{
	int x;
	demo(int i) //parameterized constructor
	{
		x=i;
	}

}
class demo2
{
	int x;
	demo2()
	{
		x=10;
	}
}