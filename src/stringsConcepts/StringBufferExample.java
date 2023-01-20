package stringsConcepts;

public class StringBufferExample {

	/*It is a class from java.lang package

Java StringBuffer class is used to create mutable (modifiable) string. The StringBuffer class in java is same as String class except, it is mutable i.e. it can be changed.

	 * 
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		StringBuffer sb = new StringBuffer();
		
		sb.append("Hi");
		
	
		
		sb.append("hello");
		
	sb.append("Welcome");
	sb.append("java");
		
	String result = sb.toString();
	System.out.println(result);
		
		
		
		
	}

}
