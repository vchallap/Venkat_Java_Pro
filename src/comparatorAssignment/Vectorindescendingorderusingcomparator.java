package comparatorAssignment;
import java.util.Vector;
import java.util.Collections;
import java.util.Comparator;
public class Vectorindescendingorderusingcomparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Vector v = new Vector();
		
		 v.add("1");
		    v.add("2");
		    v.add("3");
		    v.add("4");
		    v.add("5");
		    
		    
		    Comparator comparator = Collections.reverseOrder();
		    
		    System.out.println("Before sorting Vector in descending order : " + v);
		    
		    Collections.sort(v,comparator);
		    System.out.println("After sorting Vector in descending order : " + v);
		
		
	}

}
