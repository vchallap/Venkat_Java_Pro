package accessModifiers;

public class FinalStatic {

	/*
	private static final int A=10;//
	
	private int x;
	private int y;
	*/
	//In the above case, only x and y part of Objects, final and static data member A,  is not a part of object, it is a separate copy, 
	//it can be shared by all objects of the class ( only read can not modify ).
	//static and final,   is a read only sharable data. 
	
	//Initializing static and final data member.

//1)	Class level
//2)	Using static block.

	//class level
	
	//static final int A=10;
	static final int A
	
	static 
	{
		A=20;
	}
	
	//Purpose of static block is used to initiailize final and static data memebrs.
	
	// Construcor to initialize the variables
	// Instance block to initialize the final variables
	//static block to initialize the static and  final  variables.
	
	//method as final:
	//static method can override but it should be static in both classes, parent as well as child.

//static and final should not override , both are static and final in both classe, parent as well as child.
	
	//class as final:
	
	//it prevents from the inheritance. Final class members can not be inherited into child class.

}


