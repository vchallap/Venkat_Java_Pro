package collectionsAssignment;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;
public class ListcontainingnCopiesofSpecifiedObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = Collections.nCopies(5,"A");
		
		
		System.out.println("List contains, ");
	    Iterator itr = list.iterator();
	   
	    while(itr.hasNext())
	      System.out.println(itr.next());
		
		
	}

}
