package hashmapAssignment;
import java.util.HashMap;
public class KeyexistsinJavaHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap hMap = new HashMap();
		   
	    //add key value pairs to HashMap
	    hMap.put("1","One");
	    hMap.put("2","Two");
	    hMap.put("3","Three");
	    
	    
	    boolean blnExists = hMap.containsKey("3");
	    System.out.println("3 exists in HashMap ? : " + blnExists);
		
		
		
		
		
		
		
		
		
		
		
	}

}
