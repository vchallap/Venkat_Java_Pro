package collectionsAssignment;
import java.util.Vector;
import java.util.Collections;
public class ReplaceAllElementsOfJavaVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 Vector v = new Vector();
		
		  v.add("A");
		    v.add("B");
		    v.add("D");
		    
		    System.out.println("Before replacement, Vector contains : " + v);
		    
		    Collections.fill(v,"REPLACED");
		   
		    System.out.println("After replacement, Vector contains : " + v);
		    
	}

}
