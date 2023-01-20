package constructors;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		Sample s1= new Sample();//default constructor
		Sample s2= new Sample();////default constructor
		Sample s3= new Sample();////default constructor
		//new keyword is responsible to create object as well as callling a constructor. Sample() is a constructor.
		Sample s4= null;//Method should not be invoked through the null reference. It throws NullPointerException
		s1.display();
		s2.display();
		s3.display();
		s4.display();
		*/
	/*	
		Sample s1 = new Sample( 10, 20);//parameterized constructors are used to initialize the object with different values .
		Sample s2=new Sample(30, 40);
		
		s1.display();
		s2.display();
		*/
		
		
		Sample s1= new Sample(); //if class don’t have constructors, then compiler generates a default constructor for every class.
		//the above one gives an error when If class contains at least one user defined constructor, then compiler will not generate default constructor.and if the default constrctor 
		//object is created, and if it does not have in sample class ,this gives an erorr.
		Sample s2= new Sample(10,20);// When this gives error means, the constructor was not created in sample class
		s1.display();
		
		
	}

}
