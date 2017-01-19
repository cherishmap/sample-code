package MyPackage;

import java.util.Scanner;

public class binarySearch 
{
	public static void main(String[] args)
	{
		int item,num,array[],counter, first,last, middle;

		Scanner input=new Scanner(System.in);
		System.out.println("Enter the no.of inputs:");
		num= input.nextInt();
				
		array=new int[num];
		System.out.println("enter"+num+"inputs:");
		
		for(counter=0;counter<num;counter++)
		array[counter]=input.nextInt();
		
		System.out.println("enter the search value:");
		item=input.nextInt();
		
		first=0;
		last=num-1;
		middle=(first+last)/2;
		
		while(first<=num)
		{
			if(array[middle]<item)
			first=middle+1;
			else if(array[middle]==item)
			{
				System.out.println("position of the item found is"+(middle+1)+".");
				break;
			}
			else
			{
				last=middle-1;
			}
			middle=(first+last)/2;
		}
		if(first>num)
			System.out.println("item not found");
	}
}
