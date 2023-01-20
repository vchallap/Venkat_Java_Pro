package typesOfMethodsCalling;

public class Sample {

	private int a;
	
	public void setData()
	{
		System.out.println("I'm in setData Sample class");
		
		display();
		this.show();
		put();
	}
	
	public void display()
	{
		System.out.println("I'm in display Sample class");
	}
	
	public void show()
	{
		System.out.println("I'm in show sample class");
	}
	public static void put()
	{
		String [] names={};
		Test.main(names);
		System.out.println("i'm in put");
	}
	
}
