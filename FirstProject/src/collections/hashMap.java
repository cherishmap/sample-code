package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashMap 
{

	public static void main(String[] args) 
	{
		//this is how we declare hashmap
		HashMap<Integer, String> hmap= new HashMap<Integer,String>();
		
		hmap.put(5, "Cherishma");
		hmap.put(10, "vamsi");
		hmap.put(15, "juno");
		
		 Set set = hmap.entrySet();
	     Iterator iterator = set.iterator();
	     while(iterator.hasNext()) 
	     {
	         Map.Entry names = (Map.Entry)iterator.next();
	         System.out.print("key is: "+ names.getKey() + " & Value is: ");
	         System.out.println(names.getValue());
	     }
	      
	     hmap.remove(5);
	     System.out.println("List after removal:");
	     
	     Set set2 = hmap.entrySet();
	     Iterator iterator2 = set2.iterator();
	     while(iterator2.hasNext()) 
	     {
	         Map.Entry names2 = (Map.Entry)iterator2.next();
	         System.out.print("key is: "+ names2.getKey() + " & Value is: ");
	         System.out.println(names2.getValue());
	     }
	}

}
