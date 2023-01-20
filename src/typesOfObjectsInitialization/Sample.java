package typesOfObjectsInitialization;
/*
 * An Object can be initialized in three ways
 * 
 * 1)	Class Level
2)	Initialize block / instance block
3)	Constructor
 * 
 * 
 */
//order of calling intialization of variables is : Class level>>Initialize block / instance block>>Constructor level


public class Sample {
	
	//class level initialization:
	
	private int a=10;
	private int b=20;
	
	//Constructor level initialization:
	
	public Sample()
	{
		a=30;
		b=40;
	}
	//Initialize block / instance block- this for constant variables 

	{
	
		a=50;
		b=60;
		
	}
	
	public void display()
	{
		System.out.println("a= "+a+"\t b= "+b);
	}
	
	
}
