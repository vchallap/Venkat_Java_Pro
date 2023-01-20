package collectionsAssignment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class GetSynchronizedListfromJavaArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList arrayList = new ArrayList();
		
		
		
		
		List list = Collections.synchronizedList(arrayList);
		
		
		System.out.println(list);
		
		
	}

}
