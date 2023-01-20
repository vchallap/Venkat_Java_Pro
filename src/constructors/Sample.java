package constructors;
/*
 * Constructor is a member of the class, it is like a method, which is invoked automatically when object is created.
 * The main purpose of the constructor is to initialize objects with required values.
 * Constructors are  invoked implicitly when object is created. Whereas method to be invoked explicitly  by the developer.

 * Rules to define a constructor :

1) Name of the constructor should be the same as the class name.

2) Constructor must be a public

3) Constructor should not have any return type not even void also. Implicitly it returns its own type.

4) constructor can have arguments, like a method

5) constructor can be overloaded, like a method

6) constructor should not be static, abstract,  final, synchronize, transient, native and volatile

7) constructor cannot be overridden.
Types of constructors :

There are two types of constructors in java

1) default constructor  --> it is a constructor without any parameters

2) parameterized constructor --> it is a constructor with parameters .

 * 
 * 
 * 
 */

public class Sample {
	
	private int a;
	private int b;
	
/*
	public Sample()
	{
		a=10; //intializing the values for constuctor.
		b=20;
	}
	*/
	/*public Sample(int x, int y)
	{
		a=x;
		b=y;
	}
	
public void display()
{
	System.out.println("a= "+ a + "\t b = "+b);
}
	
	*/
	//Complier default constutor concept:
	//If class contains constructors then one of the constructors must be a default constructor.

//when you defining a class with constructors, 
//then first define default constructor and then other constrctors ( parameterized )

	
	public Sample()
	{
		a=10;
		b=20;
	}

public Sample (int x, int y)
{
	a=x;
	b=y;
}
	
	
	
	public void display()
	{
		System.out.println("a= " + a + "\t b= "+b);
	}
	
	
	
	
	
}
