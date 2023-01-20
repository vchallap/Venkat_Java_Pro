package stringsConcepts;

public class StringClassMethods {
//The java.lang.String class provides many useful methods to perform operations on sequence of char values.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1.	charAt()
		
		
		String s1="hello";
		char ch=s1.charAt(0);
		System.out.println(ch);
		
		//ch=s1.charAt(5); out of range exception
		ch=s1.charAt(4);
		System.out.println(ch);
		
		
		
		// 2.2.	length()
		
		int len= s1.length();
		System.out.println(len);
		
		//3. getBytes()
		
		byte [] b= s1.getBytes();
		
		for (int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		
		//4.String to char array :
		
		char [] ch1=s1.toCharArray();
				
				System.out.println(ch1);
		//5. indexOf()
			int i1= s1.indexOf('e');
			
			System.out.println(i1);
		//6.  isEmpty()
			
			String s2="";
			 if (s2.isEmpty())
			 {
				 System.out.println("true");
			 }
			 else
			 {
				 System.out.println("False");
			 }
		
			 /*String s3=null;
			 
			 if (s3.isEmpty())
			 {
				 System.out.println("true");
			 }
			 else
			 {
				 System.out.println("false");
			 }
			 */
			 
			 //7. replace()
			 
			 String s4="this is java";
					String s5= s4.replace("java", "rava");
			 System.out.println(s4);
			 System.out.println(s5);
					 
					//no chnage, since string is inmutable - mean can't change. 
			 
			 /*String is immutable object, it can not be modified .

Types of objects in java.

There are two types

1)	mutable
2)	immutable

			  * 
			  * 
			  */
			 
			//toUpperCase();
			 
			 String s6="venkatesh";
			 String s7= s6.toUpperCase();
			 System.out.println(s7);
			 
			 String s8= s7.toLowerCase();
			 System.out.println(s8);
			 
			 //trim()
			 
			 String s9= " venky ";
			 System.out.println(s9.length());
			 String s10=s9.trim();
			 System.out.println(s10);
			 System.out.println(s10.length());
			 
			 //contains()
			 String s11="This is java";
			 if (s11.contains("is"))
			 {
				 System.out.println("yes");
	
			 }
			 else
			 {
				 System.out.println("no");
			 }
			 
			 
	}

}
