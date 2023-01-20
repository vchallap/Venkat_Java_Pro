package collectionsAssignment;
import java.util.Vector;
import java.util.Collections;
public class PerformBinarySearchonJavaVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Vector v = new Vector();	
		
		 v.add("A");
		    v.add("B");
		    v.add("D");
		    v.add("E");
		    v.add("F");
		
		    Collections.sort(v);
		    System.out.println("Sorted Vector contains : " + v);
		    
		    int index = Collections.binarySearch(v,"D");
		    
		    System.out.println("Element found at : " + index);
		    
	}

}
