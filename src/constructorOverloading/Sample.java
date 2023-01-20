package constructorOverloading;

/*
 * This is similar to method overloading,

it takes place based no.of arguments and type of arguments.

At compile time, compiler first check for the no.of args, if no.of args are matched then checks for the type of args, if type of args is also matched between constructors then ambiguity, between the constructors and compilation error.


 * 
 * 
 */


public class Sample {
	/*
	private int a;
	private float b;
	private char ch;
	
	public Sample()
	{
		
		System.out.println("constructor with no args");
		a=0;
		b=0.0f;
		ch='\n';
	}
	
	public Sample(int x)
	{
		System.out.println("Constructor with one args");
		a=x;
		b=0.0f;
		ch='\n';
	}

	public Sample (int x,float y)
	{
		System.out.println("constructor with 2 args");
		a=x;
		b=y;
		ch='\n';
	}
	
	public Sample (float y,char z)
	{
		System.out.println("constructor with 2 args and diff types of args");
		a=0;
		b=y;
		ch=z;
	}
	
	public Sample (int x,float y,char z)
	{
		System.out.println("Constructor with 3 args");
		a=x;
		b=y;
		ch=z;
	}
	
	public void display()
	{
		System.out.println("a= " +a+ "\t b= "+b+ "\t ch= "+ch);
	}
	
	*/

//invoking constructors and methods:


	public Sample()
	{
		
		System.out.println("no args");
	}
	public Sample(int x)
	{
		this();// calling same class constuctor and it must 1st of statement 
		System.out.println("one arg");
	}
	public Sample (int x,int y)
	{
		this(x);//calling same class constuctor and it must 1st of statement 
		System.out.println("two args");
	}
	public Sample(int x,int y,int z)
	{
		this(x,y);// calling same class constuctor and it must 1st of statement 
		//this(x,y,z);//Method can be  a recursive but  constructor can not be called recursively.
		System.out.println("three args");
		display();//Constructor can make a call to method, ( but )  method can not make a call to constructor 
	}
	public void display()
	{
		//this(x,y,z);Constructor can make a call to method, ( but )  method can not make a call to constructor. Becasue , constructor can make a call oncly once at the time of object creation.
		System.out.println("i'm in display");
	}
	
	
}
