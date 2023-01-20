package collectionsAssignment;
import java.util.ArrayList;
import java.util.Collections;
public class MinimumelementofJavaArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList arrayList = new ArrayList();
		
		arrayList.add(new Integer("327482"));
	    arrayList.add(new Integer("13408"));
	    arrayList.add(new Integer("802348"));
	    arrayList.add(new Integer("345308"));
	    arrayList.add(new Integer("509324"));
		
		
	    Object obj = Collections.min(arrayList);
	    
	    System.out.println("Minimum Element of Java ArrayList is : " + obj);
		
		
	}

}
