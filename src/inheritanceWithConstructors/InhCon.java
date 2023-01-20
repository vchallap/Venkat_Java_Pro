package inheritanceWithConstructors;

public class InhCon {

	public static void main(String[] args) {
		
		
	TestTwo t1= new TestTwo();//calling default constructor.
	TestTwo t2= new TestTwo(1,2,3,4,5,6);//calling parametarized constructor
	// only child 2 parametarized can be invoked and rest defaut will be invoked only
		
	t1.display();
	t2.display();
		
	}
	
	
	
	
}
