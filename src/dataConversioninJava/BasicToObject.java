package dataConversioninJava;

public class BasicToObject {
//for every basic data type, java provides Object Wrapper class to convert basic data type to Object type.
	
/*Basic type key words	Object Wrapper class
byte						Byte
short						Short
int							Integer
long						Long
float						Float
double						Double
char						Character
boolean 					Boolean
	 * 
	 * Note: All the above wrapper classes are from java.lang  package.

Wrapper classes are immutable and final.

	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		Integer i1= new Integer(a);
		
		System.out.println(i1);
		
		float f=20.1f;
		Float f1= new Float (f);
		System.out.println(f);
		
		double d=22.4;
		Double dd= new Double(d);
		System.out.println(dd);
	//3) Object to Basic Type:
		
		Long lo = new Long (10);
		
		long l= lo.longValue();
		System.out.println(l);
		
		Double ddd= new Double(67.9);
		
		double x= ddd.doubleValue();
		
				System.out.println(x);
		
		/*
		 * Auto Boxing and Unboxing:

it converts basic to object,  object to basic automatically.
This concept was introduced from jdk1.5 ( tiger version ) onwards.

Auto boxing:
it is a conversion of data from basic to Object type:

		 * 
		 * 
		 * 
		 */
				
			//short s=10;
			//Short ss= new Short (s);
				Short ss=10;
			
			System.out.println(ss);
				
			
			//Integer ii= new Integer(10);
			//int it=i1.intValue();
			Integer ii=20;
			int it=ii;
			System.out.println(it);
				
		
	}

}
