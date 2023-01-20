package myPreparation;

public class TestChild extends Test{

	private int c;
	private int d;
	
	
	public TestChild() {
		// TODO Auto-generated constructor stub
		
		System.out.println("TestChild Constructor started");
		
	}

	public void setDeta(int a, int b, int c, int d)
	{
		setData(a,b);
		this.c=c;
		this.d=d;
		
		
	}
		
	public void display()
	{
		super.display();
		System.out.println("The value of c= "+c);
		System.out.println("The value of d= "+d);
	}
		
		
		
	}

