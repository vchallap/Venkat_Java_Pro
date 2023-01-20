package methodOverloading;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sample s1= new Sample();
		
		byte b=10;
		short s=20;
		int i=30;
		long l=40;
		float f=10.2f;
		double d=10.2;
		
		/*
		Sample s2= new Sample();
		Sample s3= new Sample();
		Sample s4= new Sample();
		
		s1.setData();
		s2.setData(10);
		s3.setData(20.0,"Male");
		s4.setData(40, 50.0, "Female");
		
		s1.display();
		s2.display();
		s3.display();
		s4.display();
		*/
		//s1.setData((short) l);
		s1.setData((float)d);
		
		
	}

}
