package interfaceTopic;

/*
 * 
interface is similar to abstract class

it allows only reference decalaration

it does not allow to create instance
default properties of interface :
=========================

1)	interface by default, it is a public

2)	interface data members are by default public , static and final.

3)	Interface methods are by default public and abstract.

 * 
 * implements is a keyword to inherit interface members into child class.
 * 
 * 
 * Concrete class Vs Abstract class Vs Interface 

1)	concrete class, is a fully implemented class ( fully qualified class )

2)	abstract class, is a partially implemented  ( partially qualified class )

3)	interface is a fully abstract

 * an interface can refer to child class instance .

a parent can refer to child class instance but child can not refer to parent.

 * An interface can extends of anther interface but not implements
 * 
 * Interface data members are public , since these are public , these behaves like a Global data, these can be used any where in the project by importing interface.

If it is same package , importing is not necessary .

 * 
 */




public interface SampleInterface {

	public static final int A=10;

	public void show();

	public void display();

	

	
	
	
	
	
	
}
