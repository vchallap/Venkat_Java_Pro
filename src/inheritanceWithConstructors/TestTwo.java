package inheritanceWithConstructors;

public class TestTwo extends TestOne {
	
	/*
	
	public TestTwo()
	{
		System.out.println("Child 2 default constructor");
	}
	public TestTwo(int x, int y, int z, int k)
	{
		super(x, y, z, k);
		System.out.println("Child 2 parametarized constructor same args as parent");
	}
	public TestTwo(int x, int y, int z, int k, int i, int j)
	{
		//super(x, y, z, k);//it calles parent parametarized class and this must be first statement.
		this(x, y, z, k);
		System.out.println("Child 2 parametarized constructor");
	}
	//in a class having same constructor as parent and if it needs to call this keyword willbe used .
	
	*/
	private int i;
	private int j;
	
	public TestTwo()
	{
		i=0;
		j=0;
	}
	
	public TestTwo(int x, int y, int z, int k)
	{
		super(x, y, z, k);
		System.out.println("same arguments as it's parent");
	}
	
	
	public TestTwo(int x, int y, int z, int k, int m, int n)
	{
		this(x, y, z, k);
		//super(x, y, z, k);
		i=m;
		j=n;
	}
	
	public void display()
	{
		super.display();
		System.out.println("i= " +i+ "\t j= "+j);
	}
	
}
