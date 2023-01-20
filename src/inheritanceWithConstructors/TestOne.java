package inheritanceWithConstructors;

public class TestOne extends Test {
	
	/*
	public TestOne()
	{
		System.out.println("Child 1 default constructor");
	}
	public TestOne(int x,int y,int z, int k)
	{
		super(x, y);
		System.out.println("Child 1 parametarized constructor");
	}
	*/
	
	private int c;
	private int d;
	
	public TestOne()
	{
		c=0;
		d=0;
		
	}

	public TestOne(int x, int y, int z, int k)
	{
		super(x, y);
		c=z;
		d=k;
	}
	
	
	public void display()
	{
		super.display();
		System.out.println("c= " +c+ "\t d = "+d);
	}
}
