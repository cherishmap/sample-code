package MyPackage;

import java.util.ArrayList;
import java.util.LinkedList;

public class arrayVslinked {

	public static void main(String[] args) 
	{
		long n= (long) 1E7;
		
		ArrayList array= new ArrayList();
		long milis=System.currentTimeMillis();
		for (int i=0;i<1;i++)
		{
			array.add(i);
		}
		System.out.println("Insertion in arraylist takes "+(System.currentTimeMillis()-milis)+" milli secs");
	
		LinkedList link= new LinkedList();
		milis=System.currentTimeMillis();
		for (int i=0;i<1;i++)
		{
			link.add(i);
		}
		System.out.println("Insertion in linkedlist takes "+(System.currentTimeMillis()-milis)+" milli secs");
		
		milis=System.currentTimeMillis();
		array.remove(0);
		System.out.println("Deletion in arraylist takes "+(System.currentTimeMillis()-milis)+" milli secs");
		
		milis=System.currentTimeMillis();
		link.remove(0);
		System.out.println("Deletion in linkedlist takes "+(System.currentTimeMillis()-milis)+" milli secs");
		
		milis=System.currentTimeMillis();
		array.get((int) ((long)n/2));
		System.out.println("Get in arraylist takes "+(System.currentTimeMillis()-milis)+" milli secs");
		
		milis=System.currentTimeMillis();
		link.get((int) ((long)n/2));
		System.out.println("Get in arraylist takes "+(System.currentTimeMillis()-milis)+" milli secs");
		
	}

}
