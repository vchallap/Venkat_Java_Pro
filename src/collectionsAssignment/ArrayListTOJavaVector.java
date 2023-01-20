package collectionsAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;
public class ArrayListTOJavaVector {

	public static void main(String[] args) {
		
		ArrayList arrayList = new ArrayList();
		
		arrayList.add("10");
	    arrayList.add("20");
	    arrayList.add("30");
		
	    Vector v = new Vector();
	    v.add("V");
	    v.add("E");
	    v.add("N");
	    v.add("K");
	    v.add("A");
	    v.add("T");
	    v.add("E");
	    v.add("S");
	    v.add("H");
	    
	    
	    System.out.println("before copy: " + v);
	    
	    Collections.copy(v,arrayList);
	    
	    System.out.println("after Copy : " + v);   
	    
	}
	
	
	
}
