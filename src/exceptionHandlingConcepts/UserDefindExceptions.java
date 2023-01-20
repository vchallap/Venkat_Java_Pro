package exceptionHandlingConcepts;

public class UserDefindExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Main start");
		
		try {
			
			System.out.println("Try start");
			int a=10;
			
			int n= args.length;
			
			if (n==0)
			{
				throw new SampleException("Sample error");
			}
			
			int b= a/n;
			
			System.out.println(b);
			
			System.out.println("Try end");
			
		} catch (SampleException e) {
			// TODO: handle exception
			
			//e.printStackTrace();
			System.out.println(e.toString());
		}
		
		
		
		
	}

}
