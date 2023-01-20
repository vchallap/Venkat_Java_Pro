package methods;

public class MethodWithArgsReturnValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int a=10;
		//int b=20;
		
		int addition= add(10,10);
		
		System.out.println("Addition= "+addition);
		int subtraction=sub(20,10);
		
		System.out.println("Subtraction= "+subtraction);
		
		float average=avg(30,40);
		
		System.out.println("avargae = "+average);
		
	}
	
	

	public static int add(int a, int b)
	{
		int temp;
		temp=a+b;
		return temp;
	}
	

	private static int sub(int a, int b) {
		// TODO Auto-generated method stub
		int temp;
		temp=a-b;
		
		return temp;
	}
	
	private static float avg(int a, int b) {
		// TODO Auto-generated method stub
		
		float temp;
		temp= (a+b)/2f;
		return temp;
	}

}
