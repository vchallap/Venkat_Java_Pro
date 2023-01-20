package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {

public static void main(String[] args) {
		
		
	ArrayList <String> list = new ArrayList <String> ();
		
		list.add("java");
		
		list.add("hadoop");
		
		list.add("python");
		
		list.add("html");
		
		list.add("oracle");
		
		list.add("java");
		


		System.out.println("list of elements ");
		
		System.out.println(list);
		
		System.out.println("using for loop ");
		
		
		for(int i = 0; i<list.size(); i++)
		{
			String str = (String) list.get(i);
			
			System.out.println(str);
		}
		
		System.out.println("using foreach loop ");

		for( String str   :  list )
		{
			System.out.println(str);
		}
		
		System.out.println("using iterator ");
		
		Iterator<String> iterator = list.iterator();
		
		while( iterator.hasNext() )
		{      
			String str = iterator.next();
			
			System.out.println(str);
		}
		
	}

	
	
	
}
