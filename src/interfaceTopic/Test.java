package interfaceTopic;
//all methods of an interface should be implemented in the child class, 
	//otherwise child class becomes as an abstract class.

//public abstract class Test implements SampleInterface
//public  class Test implements SampleInterface
public class Test implements SampleInterface,SampleInterface2{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
		System.out.println("i'm in child class show");
		
		
		
		//Child class  own methods,  should not be invoked through the parent reference.
		
		
	}
	
	//its own method child class
	public void demo()
	{
		System.out.println("I am in demo ");
		
		
	}

	/*
	 * @Override -->  it is a method from parent class, which is overriding 

		at child class

@Override  --> it is an optional ,

		but to understand code , it is required 

		it is  required  to indentify parent class and child class methods 

		it can not be used with child class own methods

	 * 
	 * 
	 */
	
	@Override
	public void display()
	{
		System.out.println("i'min display");
	}

	@Override
	public void put() {
		// TODO Auto-generated method stub
		System.out.println("I'm in put of parent interface2");
	
		
	}
	
	
	
}
