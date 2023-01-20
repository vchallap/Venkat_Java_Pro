package stringsConcepts;
/*
 * String is a class from java.lang package.

It is not a basic data type. It is user defined type ( non-premitive )

 * 
 * Java String provides a lot of concepts that can be performed on a string 
 *such as compare, concat, equals, split, length, replace, compareTo, intern, substring etc.
 * 
 * 
 * 
 * 
 */




public class DiffTypesOfStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Different ways of Creating a string

		//String Assignement:
		
		String s;
		s="Hello";
		
		System.out.println(s);
		
		//String initialization :

		String s1="hello";

		System.out.println(s1);
		
		//Using Constructor :

		String s2= new String ("HELLO");

		System.out.println(s2);
		
		//Creating String from Another String 
		
		String s3= new String (s1);
		System.out.println(s3);
		
		//String reference assignment :
		
		String s4=s1;
		
		System.out.println(s4);
		
		//From byte array:
		
		byte [] b = {65,66,67,68,69};
		String s5= new String (b);
		
		System.out.println(s5);
		
		//From char array:
		
		char [] ch= {'h','e','l','l','o'};
		String s6= new String (ch);
		System.out.println(s6);
		
		//Null String :
		
		String s7=null;
		//System.out.println(s7);
		
		//Empty String :
		
		String s8= new String();
		System.out.println(s8);
		
		//The java.lang.String class implements Serializable, Comparable and CharSequence interfaces

//The java String is immutable i.e. it cannot be changed but a new instance is created.

//For every time of assignment it will create new location.

//For mutable class, you can use StringBuffer and StringBuilder class.
		
		//How to create String object?
		
		/*There are two ways to create String object:

    By string literal
    By new keyword

		 * 1) String Literal

Java String literal is created by using double quotes. For Example:

    String s="welcome";  
Note: String objects are stored in a special memory area known as string constant pool.
		 * 2) By new keyword

    String s=new String("Welcome");//creates two objects and one reference variable  

		 */

	}

}
