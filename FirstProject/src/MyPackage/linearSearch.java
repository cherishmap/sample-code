package MyPackage;

import java.util.Scanner;

public class linearSearch 
{

	public static void main(String[] args) 
	{
		int num,counter, array[],item;
		//here we have taken the no.of inputs
		Scanner input= new Scanner (System.in); 
		System.out.println("enter the no.of inputs:");
		num = input.nextInt();
		 
		array=new int[num];
		System.out.println("enter"+num+"inputs");
		 
		for(counter=0;counter<num;counter++)
		array[counter]= input.nextInt();
		
		System.out.println("enter the search value:");
		item=input.nextInt();
		
		for(counter=0;counter<num;counter++)
		{
			if(array[counter]==item)
			{
				System.out.println(item+":the search value is found at "+(counter+1)+"position");
				break;
			}
		}
		if(counter==num)
		System.out.println(item+"does not exist");
	}

}
