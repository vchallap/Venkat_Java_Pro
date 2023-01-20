package collections;
import java.util.HashMap;
import java.util.Stack;

public class HashMapp {

	public static void main(String[] args) {

		HashMap  hmap = new HashMap();
		
		hmap.put(1, "java");
		hmap.put("hello", 1);		
		hmap.put(2, new Employee());

		System.out.println(hmap);		
	}

	
	
}
