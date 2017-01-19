package MyPackage;

import java.util.ArrayList;

public class arrays 
{
	public static void main(String[] args)
	{
		//below code is an example of how arrays are used
		/*int newarray[]={1,2,3,4,5};
		int index=0;
		while (index < 5)
		{
			System.out.println(newarray[index]);
			index++; 
		}*/
		
		int newarray[]= new int[5];
		
		ArrayList<Integer> mylist=new ArrayList<Integer>();
		mylist.add(5);
		mylist.add(10);
		mylist.add(15);
		mylist.add(20);
		mylist.add(25);
		
		for (Integer x: mylist)
		System.out.println(x);

		System.out.println("------------------");
		
		System.out.println("size="+mylist.size());

		System.out.println("------------------");
		
		mylist.add(30);
		for (Integer x: mylist)
		System.out.println(x);
		
		System.out.println("------------------");
		
		mylist.add(2, 16);
		for (Integer x: mylist)
		System.out.println(x);

		System.out.println("------------------");
		
		//this did not work correctly
		mylist.get(5);
		for (Integer x: mylist)
		System.out.println(x);

  		System.out.println("------------------");
		
		if(mylist.isEmpty()==true)
		{
			System.out.println("array is empty");
		}
		else
		{
			System.out.println("array is not empty");
		}

		System.out.println("------------------");
		
		System.out.println(mylist.hashCode());
		
		System.out.println("------------------");
		
		System.out.println(mylist.size());

		System.out.println("------------------");
		
		mylist.clear();
		System.out.println(mylist.size());
	}

}
