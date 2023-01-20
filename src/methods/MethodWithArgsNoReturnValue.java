package methods;

public class MethodWithArgsNoReturnValue {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		
		System.out.println("Main start");
		
		int a =10;
		int b =20;
		 display(a,b);//a and b are called parameters
		 
	System.out.println("After passing a and b");
		 
		 display (30,40);//we can pass values directly and these are called parameters.
		 
		 System.out.println("Main end");
	}
	
	public static void display(int x, int y)
	{
		System.out.println("in diplay method");
		System.out.println("x= "+x+"\t y= "+y);
	
	}

}
