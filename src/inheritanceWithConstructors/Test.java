package inheritanceWithConstructors;
//Constructors invokes from bottom to top BUT  executes from top to bottom.
//Default constructors are invoked automatically   ( implicitly )

public class Test {
	
	/*
	
	public Test()
	{
		System.out.println("Parent default constructor");
	}
	
	public Test(int x, int y)
	{
		System.out.println("Parent parameterized constructor");
	}
*/
	
	//constructor initilization:
	
	private int a;
	private int b;
	
	public Test()
	{
		a=0;
		b=0;
	}
	
	public Test (int x, int y)
	{
		a=x;
		b=y;
	}
	
	public void display()
	{
		System.out.println("a= " +a+ "\t b= "+b);
	}
	
}
