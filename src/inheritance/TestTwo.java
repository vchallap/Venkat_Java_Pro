package inheritance;

public class TestTwo extends TestOne {

	int c;
	int d;
	
	public void setData(int x, int y, int z, int k)
	{
		setData(x,y);
		c=z;
		d=k;
	}
	
	public void display()
	{
		super.display();
		System.out.println("c= " +c+ "\t d= "+d);
		
	}
	
	
}
