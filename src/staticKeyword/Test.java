package staticKeyword;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Sample s1=new Sample();
		Sample s2=new Sample();
		Sample s3=new Sample();
		
		s1.setData();
		s2.setData();
		s3.setData();
		
		s1.display();
		s2.display();
		s3.display();
		
		Sample.count=20;
		System.out.println(Sample.count);// to access instance variable out side of the clas , we need to set instance variable as public.
		
		*/
		//Sample.count=10;
		Sample.count++;
		Sample s1= new Sample();
		Sample s2=	new Sample();
		Sample s3= new Sample();
		
		s1.setData();
		Sample.count++;
		
		s2.setData();
		Sample.count++;
		
		s3.setData();
		Sample.count++;
		
		s1.display();
		s2.display();
		s3.display();
		
		
	}

}
