package inheritance;

public class Test extends Sample{//extends is the keyword to get class data from parent to child
	//int a;
	//int b;
	int c;
	int d;
	
	public void setData(int x, int y, int z, int k)
	{
		//a=x;
		//b=y;
		setAB(x,y);
		c=z;
		d=k;
		
	}
	
	
	public void display()
	
	{
		dispAB();
		System.out.println("c= "+c+"\t d= "+d);
	}
	
	

}
