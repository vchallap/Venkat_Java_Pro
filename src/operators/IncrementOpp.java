package operators;

public class IncrementOpp {
	
	public static void main(String[] args) {
		
		
		/* Example 1:
		 * 
		 * 
			int a=10;
				
				int b;
				
				int c;
				
				int d;
				
				b=++a; //a=11;b=11
				
				c=b++;//c=11;b=12
				
				d=++c; //c=12;d=12
				
				System.out.println (a+"\t"+b+"\t"+c+"\t"+d); // 11;12;12;12
				
		 * 
		 */
		
		//Example 2:
		/*
		 
		int a=10;
		int b;
		int c;
		int d;
		
		b=a++;		//b=10,a=11
		c=++b;		//b=11,c=11
		d=c++;		//d=11,c=12
		b=d++;		//b=11,d=12
		a=++c;		//c=13,a=13
		System.out.println (a+"\t"+b+"\t"+c+"\t"+d);	//13;11;13;12

				*/
		
		//Example 3:
		
		/*
		
		int a=10;
		int b;
		int c;
		int d;
		
		d=++a;		//a=11,d=11
		b=d++;		//b=11,d=12
		a=++b;		//b=12,a=12
		c=d++;			//c=12,d=13
		d=++c;//c=13,d=13
		
		System.out.println (a+"\t"+b+"\t"+c+"\t"+d);// 12,12,13,13

			*/
		
		//Example 4:
		/*
		int a=10;
		int b;
		int c;
		int d;		
		
		b=--a;			//a=9,b=9
		c=b++;		//c=9,b=10
		d=--c;		//c=8,d=8
		a=++b;		//b=11,a=11
		d=a--;//d=11,a=10
		
		System.out.println (a+"\t"+b+"\t"+c+"\t"+d);//10,11,8,11

 */
		
		//Example 5:
		
		
		int a = 10;
		int b;
		int c;
		int d;

		d = a--;//d=10,a=9
		b = ++d;//d=11,b=11
		c = a++;//c=9,a=10
		a = --b;//b=10,a=10
		d = c++;//d=9c=10

		System.out.println (a + "\t" + b + "\t" + c + "\t" + d);//10,10,10,9

		
		
		

		
		
	}

}
