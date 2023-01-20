package methods; //Method is set of statements to perform some task. and it ends with ;
//Access specifier return type method name (type arg1, type ar2,type arg3..)
//method name should start with lower case alphabats 
// 4 types of methods- 1.method with no args and no return type 2.method with args and no return value 3.method with no args and retun value 4. method with  args and  retun 
public class BasicMethod {// method with no args and no return 

	public static void main(String[] args) //calling method
	{ //if main method is static in a class, the mentods in class are also should be static when they are called from main method
		// TODO Auto-generated method stub

		
		System.out.println("Main start");
		
		display();
		
		System.out.println("Main end");
		
	}
	public static void display()//called method
	{
		System.out.println("i am in display");
		show();
		System.out.println("Display end");
		
	}

	public static void show()
	{
		System.out.println("I'm in show");
		demo();
		System.out.println("Demo end");
		
	}
	
	
	public static void demo()
	{
		System.out.println("im  in demo");
	}
	
}
