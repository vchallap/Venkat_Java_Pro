package hashmapAssignment;
import java.util.HashMap;
public class JavaHashMapexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap hMap = new HashMap();
		
		
		hMap.put("One", new Integer(1));
	    hMap.put("Two", new Integer(2));
		
		
	    Object obj = hMap.get("One");
	    System.out.println(obj);   
		
		
	}

}
