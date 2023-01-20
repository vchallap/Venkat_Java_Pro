package test;

public class TypeCasting { 
	
	public static void main(String[] args) {
		
		//converting data from one type to another type: two types : Primitive and non primitive 
		
		
		/*
		 * primitive type casting are basic or system defined from the complier 
		 * non primitive are class -oops concepts
		 * 
		 * primitive are two types: Implicit and explicit type casting
		 * 
		 * Implicit type casting: Internal type casting- converts automatically
		 * 
		 * Implicit are two types: small to big type and integer to real number
		 * 
		 * 
		 * 
		 * byte--short--int--long--float--double
		 * char-int-long
		 * 
		 */
		//Implicit type casting
		/*
		
		byte b= 10;
		short s=b;
		int i= s;
		long l=i;
		char ch='A';
		int ii=ch;
		float f=l;
		double d=f;
		
				
		System.out.println(l);
		System.out.println(ii);
		System.out.println(f);
		System.out.println(d);
		
		
		//explicit type casting- big to small and real number to integer..
		*/
		
		// type casting is used for only constants and not for variables.
		short s =10;
		byte b = (byte)s;
		System.out.println(b);
		
		
		long l =100;
		int i =(int) l;
		
		System.out.println(i);
		
		double d=100.5;
		float f=(float) d; 
		System.out.println(f);
		
		
		int x=10;
		int y =3;
		float ff= (float) x/y;
		
		System.out.println(ff);
		
		float fff=13.90f;
		double dd=f;
		
		float ffff=(float) (fff/dd);
		
		System.out.println(ffff);
		
		
		
	}
	
	

}
