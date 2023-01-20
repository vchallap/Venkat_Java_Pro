package accessModifiers;
/*It defines behaviour of classes and it’s members.
 * 
 * there are 7 access modifiers :
 * 1) static

2) final

3) abstract

4) synchronize.

5) transient.

 6) native

7) volatile
//final :

It can be used with following

1)  local variables
2) class data members ( instance variable / class variable )
3) methods
4) classes.

1) local variable as final ( constant ):

 * --this is to declare local variable as constant.
 * it's value can not be changed.
 * it takes only one time assignment.
 * Naming conventions :

1)	name of the constant must be in upper case alphabets

2)	it constant contains multiple words, then every word should be seperated with underscore

 */


public class FinalKey {
	
	/*
	final int A =10;
	final int MIN_BUFF_SIZE=20;
	final int MAX_BUFF_SIZE-30;
	
	*/
	/*public void display()
	{
		//below is the local vaRiable
		//final int A=10;
		//A=20;//INVALID SINCE A IS CONSTANCT
		final  int A;
		A=10;
		A=20;//INVALID , AS WE CAN INTILIZE ONLY ONE TIME
	}
	*/
//2) class data members ( instance variable / class variable )
	
/*
	final  int A=10;
	A=20;//INVALID 
	final int B;
	B=10;
	B=20;//INVALID
	*/
	
	/*There are three ways to initialize final data member 

	1)	class level 

	2)	using constructor 

	3)	using initialize block.
*/
	
	//	1)	class level 
	
	//final private int A=10;
	/*
	final private int A;
	public void setData()
	{
		A=20;
	}
	*/
	//using inilize block / instance block.
	
	
	//final private int A;
	
	//final private int A=10;
	
	/*
	{
		A=10;//this is also In valid when above class level initialization done 
		A=20;//THIS IS INVALID, second time assigment
	}
	
	*/
	//Using constructor:
	
	/*public FinalKey()
	{
		A=20;//THIS IS INVALID, 
		A=20;
	}
	*/
	
	//When both constructor and inilize block there
	
	final private int A;
	//final private int A=10;
	
	{
		A=10;
	}
	
	public FinalKey()
	{
		A=10;
	}
}
//Purpose of constructor is to initialize variable data members ( its value can be changed ) 

//Purpose of initiailize / instance block  is used to initialize final data members ( its value can not be changed ) 


