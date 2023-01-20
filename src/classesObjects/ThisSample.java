package classesObjects;

public class ThisSample {

	


		int x;
		
		public void setData(int x)
		{
			this.x=x;
		}
		
		public void display()
		{
			int x=10;
			System.out.println("local value is : "+x);
			System.out.println("instance value is :" +this.x);
		}

		
		
		
	}





