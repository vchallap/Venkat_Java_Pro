package collectionsAssignment;
import java.util.Vector;
import java.util.Collections;
public class MaxmimumelementofJavaVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Vector v = new Vector();
		
		 v.add(new Double("324.4324"));
		    v.add(new Double("345.3532"));
		    v.add(new Double("342.342"));
		    v.add(new Double("357.349"));
		    v.add(new Double("23.32453"));
		    
		    

		    Object obj = Collections.max(v);
		   
		    System.out.println("Maximum Element of Java Vector is : " + obj);
		
		
	}

}
