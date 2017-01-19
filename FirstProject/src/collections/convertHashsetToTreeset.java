package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class convertHashsetToTreeset 
{
	
	
	public static void main(String[] args) 
	{
		HashSet<String> hset= new HashSet<String>();
		
		hset.add("cherishma");
		hset.add("monisha");
		hset.add("juno");
		hset.add("apple");
		
		HashSet<Integer> hset2= new HashSet<Integer>();
		
		hset2.add(55);
		hset2.add(10);
		hset2.add(15);
		hset2.add(1);
		
		System.out.println(hset);
		System.out.println(hset2);
		
		Set<String> tset= new TreeSet<String>(hset);
		Set<Integer> tset2= new TreeSet<Integer>(hset2);
		
		System.out.println("tree set contains");
		for(String temp : tset)
		{
	        System.out.println(temp);
		}
		
		//System.out.println(tset);
		//System.out.println(tset2);
		
		for(Integer temp2 : tset2)
		{
			System.out.println(temp2);
		}
	}

}
