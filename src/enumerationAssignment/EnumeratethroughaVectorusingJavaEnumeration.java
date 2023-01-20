package enumerationAssignment;
import java.util.Vector;
import java.util.Enumeration;
public class EnumeratethroughaVectorusingJavaEnumeration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector v = new Vector();
		
		 v.add("One");
		    v.add("Two");
		    v.add("Three");
		    v.add("Four");
		    Enumeration e = v.elements();
		    
		    System.out.println("Elements of the Vector are : ");
		    
		    while(e.hasMoreElements())
		      System.out.println(e.nextElement());
		    
		
	}

}
