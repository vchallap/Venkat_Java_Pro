package methodOveridding;

/*method overidding takes place when Super class and sub class with same methods :
 * Parent class and child class contains same methods with same signature then method Overriding takes place.
 * Method overriding is a redefining parent class method in the child class.
Purpose of method overriding is to changing or extending functionality of existing methods ( parent class methods )

 */

public class Sample {

	int a;
	int b;
	
	public void setAB(int x, int y)
	{
		a=x;
		b=y;
	}
	
	public void display()
	{
		System.out.println("a= " +a + "\t b= "+b);
	}
	
	
}
