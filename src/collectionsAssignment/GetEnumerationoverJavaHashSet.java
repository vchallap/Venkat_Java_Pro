package collectionsAssignment;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Collections;
public class GetEnumerationoverJavaHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hashSet = new HashSet();
		
		   hashSet.add("A");
		    hashSet.add("B");
		    hashSet.add("D");
		    hashSet.add("E");
		    hashSet.add("F");
		
		    Enumeration e = Collections.enumeration(hashSet);
		
		    System.out.println("Enumerating through Java HashSet");
		    while(e.hasMoreElements())
		      System.out.println(e.nextElement());
	}

}
