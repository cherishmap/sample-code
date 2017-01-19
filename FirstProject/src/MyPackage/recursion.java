package MyPackage;

import java.util.Scanner;

public class recursion {

	public static int factorial(int n) 
	{
		if (n<=1)
			return 1;
		else
			return (n*factorial(n-1));
		
	}

	public static void main(String[] args) 
	{
		
		Scanner scan= new Scanner(System.in);
		System.out.println("enter any number:");
		int input_number=scan.nextInt();
		System.out.println("entered number is:");
		System.out.println(input_number);
		System.out.println("and its fatorial is "+factorial(input_number));
		scan.close();
	}

}
	