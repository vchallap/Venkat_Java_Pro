package collectionsAssignment;
import java.util.TreeMap;
import java.util.Collections;
import java.util.Map;
public class GetSynchronizedMapfromJavaTreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap treeMap = new TreeMap();
		
		
		Map map = Collections.synchronizedMap(treeMap);
		
		
		System.out.println(map);
		
		
	}

}
