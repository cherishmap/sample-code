package MyPackage;

import java.util.Scanner;

public class fibonacci 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter the value of n:");
		Scanner inputNum=new Scanner(System.in);
		int num=inputNum.nextInt();
		execution(num);
	}
	
	public static void execution(int num)
	{
		if (num==0)
		{
			System.out.println("0");
		}
		else if (num==1)
		{
			System.out.println("0 1");
		}
		else
		{
			System.out.println("0 1");
			int a=0;
			int b=1;
			for(int i=1; i<num; i++)
			{
				int nextNum=a+b;
				System.out.println(nextNum+" ");
				a=b;
				b=nextNum;
				
			}
		}
	}

}
