package staticKeyword;// Static  is an access modifier in java 
/*
 * The static keyword in java is used for memory management mainly. We can apply java static keyword with variables, methods, blocks and nested class. 
 * The static keyword belongs to the class than instance of the class.
 * 
 * The static can be used with:

    1) static Data member  (also known as class variable/Static variable)
    2) static method (also known as class method/static method)
    3) static block
    4) static inner classes
    5) static import.

 * 1. Static data member/Static variable:
 * 
 * If you declare any data member as static, it is known static data member.


The static variable gets memory only once in class area at the time of class loading.

Default value of static data member is 0.

All static members of the class acquire memory without creating an object. These are not part of object.

For static data members only one copy will be created and that can be shared by all objects of the class.

It is a sharable memory.

These members can be shared by all objects of the class.

These can accessed eighther by class name or through the object.

 */

public class Sample {
	
	private int a;
	//private static int count;
	//public static int count;
	public static int count=10;
	public void setData()
	{
		a=++count;
	}
	
	public void display()
	{
		System.out.println("current object = "+a);
		System.out.println("Total no of objects are = "+count);
	}
	
	
	
	

}
