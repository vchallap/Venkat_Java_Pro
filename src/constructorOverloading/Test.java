package constructorOverloading;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		Sample s1= new Sample();
		Sample s2= new Sample(10);
		Sample s3= new Sample(10,2.0f);
		Sample s4= new Sample(3.0f,'v');
		Sample s5= new Sample(10,4.0f,'C');
		
		s1.display();
		s2.display();
		s3.display();
		s4.display();
		s5.display();
		*/
		
		//calling constructors:
		
		Sample s1=new Sample(10,20,30); //a constructor can make a call to one constructor at a time and only once after object cretaion 
		
		
		
	}

}
