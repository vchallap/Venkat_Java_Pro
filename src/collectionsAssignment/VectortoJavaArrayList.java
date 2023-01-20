package collectionsAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

public class VectortoJavaArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Vector v = new Vector();
		
		v.add(1);
		v.add(2);
		v.add(3);
	    
	    ArrayList arrayList = new ArrayList();
		
	    arrayList.add("One");
	    arrayList.add("Two");
	    arrayList.add("Three");
	    arrayList.add("Four");
	    arrayList.add("Five");
	    
	    System.out.println("Before copy ArrayList Contains : " + arrayList);
	    
	    Collections.copy(arrayList,v);
	  
	    System.out.println("After Copy ArrayList Contains : " + arrayList); 
		

	}

}
