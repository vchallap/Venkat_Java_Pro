package myPreparation;

public class Test {

	private int a;
	private int b;
	
	public Test() {
		// TODO Auto-generated constructor stub
		
		System.out.println("Test parent class started");
	}
	

	/*public Test(int x, int y) {
		// TODO Auto-generated constructor stub
		a=x;
		b=y;
	}
	*/
	/*
	public int getA() {
		return a;
	}*/
	/*
	public void setA(int a) {
		this.a = a;
	}/*
	public int getB() {
		return b;
	}*/
	/*
	public void setB(int b) {
		this.b = b;
	}
	
	/*
	public void setData(int m, int n)
	{
		a=m;
		b=n;
	}
	*/
	
	public void setData(int a, int b)
	{
		this.a=a;
		this.b=b;
	}

	
	public void display()
	{
		System.out.println("The value of a: " +a);
		System.out.println("The value of b: " +b);
		
	}
	
	
	
}
