package collectionsAssignment;
import java.util.HashSet;
import java.util.Collections;
public class MaxmimumelementofJavaHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashSet hashSet = new HashSet();
		
		
		 hashSet.add(new Long("923740927"));
		    hashSet.add(new Long("4298748382"));
		    hashSet.add(new Long("2374324832"));
		    hashSet.add(new Long("2473483643"));
		    hashSet.add(new Long("32987432984"));
		   
		
		
		    Object obj = Collections.max(hashSet);
		    
		    System.out.println("Maximum Element of Java HashSet is : " + obj);
		
		
		
		
		
		
	}

}
