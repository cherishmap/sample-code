package MyPackage;

public class inheritance 
{
	public static void main(String[] args) 
	{
		triangle tri=new triangle();
		rectangle rec=new rectangle();
		
		tri.methodPolygon(20, 10);
		rec.methodPolygon(20, 10);
		
		System.out.println("area of triangle:"+tri.area());
		System.out.println("area of rectangle:"+rec.area());
	}
}
	class polygon 
	{
		int height;
		int width;
		
		public void methodPolygon(int a, int b)
		{
			height=a;
			width=b;
		}
	}
	class triangle extends polygon
	{
		public int area()
		{
			return (height*width)/2;
		}
	}	
	class rectangle extends polygon
	{
		public int area()
		{
			return height*width;
		}
	}


