package staticKeyword;

public class StaticMethod {//the purpose of static method is to access private data
	
	//Static methods also like a static data members, it acquires memory without  creating an object.
	//All static members acquires memory by the name of the class without  creating an object.
	//static method acquires memory as soon as class gets loaded into the memory (without any class instance)

	//Static method can be called by the reference of class name or though the object.
	//main purpose of static method is to access private static data member.

//Static method can access only static data members  and  static methods
	//Static method acquires memory without any object but for non static members object is required. 

//non static method can access any member ( static or non static members )
// Eg : 
	//calling by the class name -->   Test.display();

	//method are two types:
	//Static method :- 
	
	/*
	 * 
	 * 	it acquires memory with reference of object.

	for this method object required

	it is invoking through the object ( instance )

	instance method can access any data 

	it can make a call to any method , static as well non-static methods.

	 */
	//non static method:
	/*
	 * 
	 * it acquires memory with reference of class name.

	for this method object is not required

	it is invoking by the class name 

	static method can access only static data.

	static method can make a call to only static methods.

//this keyword cant be used in static methods . as static doesn't have object and this works on reference of object.
	 * 
	 * 
	 */
	private static int a;//instance variable
	private static int count;//static variable
	
	public  void setData()
	{
		//int a=10;//local varible
	a=++count;	
	System.out.println(a);
	//display();// non static method can call static method . this method doesn't have any class or object , 
	//but they are within the class and they are part an object  indirectly.
	
	
	}
	
	public static void display()
	{
		System.out.println(count);
		//setData();// static method can't call non static method.the called method shoudl be static.
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
