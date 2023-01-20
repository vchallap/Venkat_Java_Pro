package collectionsAssignment;

import java.util.ArrayList;

public class OneJavaArrayListtoAnotherJavaArrayList {
	
	public static void main(String[] args) {
		
		
		ArrayList<String> first = new ArrayList<String>();
		first.add("VENKA");
		first.add("TESH");
		ArrayList<String> second= new ArrayList<String>();
		second.addAll(first);
			
		System.out.println(first);
		
	}
	
	
}
