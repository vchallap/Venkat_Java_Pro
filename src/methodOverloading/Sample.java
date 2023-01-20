package methodOverloading;// takes place b/w Same method with different signature
//it is based on no of arguments and type of arguments.

/*
 * Method over loading is compile time binding (or)  static binding.
 * First compiler checks no.of arguments,  if no.of args are matched between methods then cheks for type of arguments, 
 * if type is also matched then ambiguity b/w methods and compiler shows error massage.

1)	Method Overloading based on no of arguments

2)	Method Overloading based on type of arguments

 * 
 * 
 */

public class Sample {
	


/*	
 * 
 * 
	private int a;
	//private int b;
	//private int c;
	private double b;
	private String ch;
	
	public void setData()
	{
		a=0;
		b=0.0f;
		ch="\0";
		
	}
	
	public void setData(int x)
	{
		a=x;
		b=0.0f;
		ch="\0";
	}
	
	public void setData(double x,String y)
	{
		a=0;
		b=x;
		ch=y;
		
	}
	
	public void setData(int x,double y,String z)
	{
		a=x;
		b=y;
		ch=z;
	}
*/
	public void setData(float x)
	{
		
	}
	
	
	public void display()
	{
		System.out.println("a= "+a+"\t b =" +b+"\t c= "+ch);
	}
	
}
