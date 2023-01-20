package methods;

public class MethodWithNoArgsReturnValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("main starts");
		
		String message = display();
		System.out.println("Message = "+message );
		
		System.out.println("Main ends");
	
	}
	
	public static String display()
	{
		return "hello";//retunr type can be used to retun value or terminate from the method
	}

}
