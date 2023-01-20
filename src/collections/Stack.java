package collections;
import java.util.Stack;
public class Stack {
	
	
	public static void main(String[] args) {

		Stack <String> bookRack = new Stack<String>();
		
		bookRack.push("HADOOP");
		bookRack.push("JAVA");
		bookRack.push("ORACLE");
		bookRack.push("C");
		bookRack.push("LINUX");
		
		System.out.println("books in the Rack "+bookRack);
		
		System.out.println("Top book : "+bookRack.peek());
		
		String book = bookRack.pop();
		
		System.out.println("Removed Book  "+book);
		
		 book = bookRack.pop();
		
		System.out.println("Removed Book  "+book);
		
		System.out.println("Current books in the Rack "+bookRack);		
	}

	
	
	
	
	

}
