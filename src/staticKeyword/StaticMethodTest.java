package staticKeyword;

public class StaticMethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticMethod.display();//static methods calling - static method can only call to static method and no object is require to create
		
		StaticMethod.setData();
		
		StaticMethod sm= new StaticMethod();
		
		sm.setData();//non static methods calling- non static method can call to any methods. An object to be created to call non static methods.
		sm.display();
		
	}

}
