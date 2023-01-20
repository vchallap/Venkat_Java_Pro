package exceptionHandlingConcepts;

/*
 * Error : It is a compile time one. Such as syntactical errors.
 * 
 * Exception : 	It is a runtime one, it is an unknown instruction to processor at run time. 
 * when exception raises application terminates abnormally. 
 * It can be handled by writing exception handling code.
 * 
 * Bug : It is an unexpected value at runtime. Even bug raises application never terminates
          		 abnormally. It can  be fixed.
Defect :  	It  can't be fixed. Some features may not be provided by the application software. 
It is manufacturing defect.
The exception handling in java is one of the powerful mechanism to handle the runtime errors so that normal flow of the application can be maintained.

In java, exception is an event that disrupts the normal flow of the program. It is an object which is thrown at runtime.

What is exception handling.

Exception Handling is a mechanism to handle runtime errors such as ClassNotFound, IO, SQL, Remote etc.

Advantage of Exception Handling

The core advantage of exception handling is to maintain the normal flow of the application. Exception normally disrupts the normal flow of the application that is why we use exception handling. 


 */


public class TryCatchExceptionConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			int a=10;
			int n= args.length;
			
			int b= a/n;
			
			System.out.println(b);
			
			System.out.println(args[0]);
			System.out.println(args[1]);
			System.out.println(args[2]);
			
			System.out.println("try end");
		}
		catch (ArithmeticException e)
		{
			//System.out.println(e);
			//e.printStackTrace();
			System.out.println("handeled");
		}
		/*catch (ArrayIndexOutOfBoundsException e)
		{
			//e.printStackTrace();
			System.out.println("Handeled array exception");
		}*/
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		finally {
			System.out.println("i',in finally");
		}
		System.out.println("main end");
		
	}

}
