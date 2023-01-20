package collectionsAssignment;
import java.util.Vector;
import java.util.Collections;
public class ReverseorderofallelementsofJavaVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector v = new Vector();
		
		v.add("A");
	    v.add("B");
	    v.add("C");
	    v.add("D");
	    v.add("E");	
		
	    System.out.println("Before Reverse Order, Vector Contains : " + v);
	    
	    Collections.reverse(v);
	    
	    System.out.println("After Reverse Order, Vector Contains : " + v);
	   
		
	}

}
