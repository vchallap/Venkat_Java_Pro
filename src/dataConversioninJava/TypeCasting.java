package dataConversioninJava;

/*
 * It is a conversion of data from one type to another type.

It is called as type casting.

There are two types in type casting

1)	Primitive type casting
2)	Non-primitive type casting

 * 1)Basic to Basic ( primitive type casting )
 * Below all are Non-primitive type casting
 * 
 * 2)Basic to Object

3)Object to Basic

4) Object to Object 

5) Sting to Numeric

6) Numeric to String

 * 1)Basic to Basic ( primitive types )
 * 
 * 
 * These are system defined types.

all primitive types are basic type
eg: int, float ,char....

this type of conversion is type casting.

 * 
These are

1) Implicit Casting  and 2) Explicit casting
1) implicit casting:
it is a conversion of data from small type to big type. It is an implicit process ( automatically/internally )


 * 
 * byte ===> short ===> int ===> long ==>float ===> double


char ==>  int ==>long==>float ===> double

 * 	//Implicit casting is available for the below 
		//1)	Small size to bigsize
		//2)	Integer  to real number
 * 
 * 2) Explicit casting:

It is a conversion of data from big type to small type.
Java developer has to convert explicitly .

 * it is required for below one

1) big type to Small type

2) real number type to Integer type

 * 
 */


public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte b=10;
		short s=b;
		int i=s;
		long l=i;
		float f=l;
		double d=f;
		
		System.out.println(d);
		
		
		char ch='A';
		int sr=ch;
		long lo=sr;
		float ff=lo;
		double dd=ff;
		
		
		System.out.println(dd);
	
			
//1) big type to Small type
		
		
		long lon=10;
		int in=(int)l;
		short sho=(short) in;
		byte by=(byte)sho;
		
		System.out.println(by);
		
		double dou=21.8;
		float fl=(float) dou;
		System.out.println(fl);
		
		long lll=(long)fl;
		System.out.println(lll);
		
		int inn=(int) fl;
		short sss=(short) dou;
		
		System.out.println(inn);
		System.out.println(sss);
		
		
	}

}
