package callByValueANDcallyByReference;

public class Test {

	public static void main(String[] args) {
		
		Sample s1= new Sample ();
		
		s1.setData(10, 20);
		//Sample s2=s1;
		s1.display();
		//s2.display();
		
		//s2.setData(30, 40);
		//s2.display();
		//s1.display();
		/*int a =10;
		int b=20;
		
		System.out.println("Before swaping the values are");
		
		System.out.println("a= "+a+"\t b= "+b);
		
		swap(a,b);
		
		System.out.println("Ater swaping the values are");
		
		System.out.println("a= "+a+"\t b= "+b);
		
		*/
	updatedata(s1);
	
	s1.display();
		
	}
	
	/*public static void swap(int x,int y)
	{
		int temp=x;
		x=y;
		y=temp;
		
		
	}
	*/
		
		public static void updatedata(Sample  x){
			
			x.setData(30, 40);
			
		}
	
	
	
}
