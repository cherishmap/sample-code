package MyPackage;

import java.util.Scanner;
public class Class 
{

	public static void main(String[] args) 
	{
	Scanner scan= new Scanner(System.in);
	System.out.println("enter any number:");
	int user_input_variable=scan.nextInt();
	System.out.println("you have entered:" + user_input_variable);
	scan.close();
	} 

	
	
	
}
