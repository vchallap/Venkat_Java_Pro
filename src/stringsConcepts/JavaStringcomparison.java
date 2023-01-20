package stringsConcepts;

public class JavaStringcomparison {
//We can compare string in java on the basis of content and reference.
	
/*
 * there are three ways to compare strings in java:
 * 
 * By equals() method
    By = = operator
    By compareTo() method
    
    It is used in authentication (by equals() method), 
sorting (by compareTo() method), 
reference matching (by == operator) etc
//1) String compare by equals() method

The String equals() method compares the original content of the string. 
It compares values of string for equality. String class provides two methods:

      public boolean equals(Object another) 
compares this string to the specified object.
 
   public boolean equalsIgnoreCase(String another) 
compares this String to another string, ignoring case.

    
 */

   
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String s1="hello";
		//String s2="hello";
		String s2="Hello";
		
		//if (s1.equals(s2))
		if (s1.equalsIgnoreCase(s2))
		{//equals method is case sense
			//equals ignore case
			System.out.println("both are equal");
		}
		
		else 
		{
			System.out.println("Both are not equal");
		}
		
		/*
		 *2.String compare by == operator
		 *The = = operator   :compares references ( locations )  not values.
		 *
		 *
		 */
		
		
		//String s11= new String ("hello");
		
		/*
		 String s11= new String ("hello");
  How may objects are created
Ans : 1 or two

If  “hello”  already exist in the string pool, then only one creates inside the heap memory.

If  “hello”  does not exist in the string pool, then one object with “hello” palcing inside the string pool and another is created inside the heap memory.

		 */
		String s11="hello";
		//String s22= new String ("hello");
		//String s22="hello";
		
		//if (s11==s22)
		if (s1== new String ("hello"))	
		{
			System.out.println("Equal");
		}
		else 
		{
			System.out.println("NO equal");
		}
		
		//Advantage of String pool is to save the heap memory.
		
		//3) String compare by compareTo() method:
		/*The String compareTo() method compares values lexicographically and returns an integer value that describes if first string is less than, equal to or greater than second string.
		It compares ASCII value of the String.
		Suppose s1 and s2 are two string variables.*/

		
		String s3=  new String ("hello");
		String s4=new String ("hella");
		
		//int diff= s1.compareTo(s4);
		//System.out.println(diff);
		
		if (s1.compareTo(s2)==0)
		{
			System.out.println("same");
		}
		
		else
		{
			System.out.println("not same");
		}
		
		//compareTo() is used sort the strings in ascending order or descending order.
		//Sorting Strings:
		
		String []names=new String[]{"java","hadoop","linux","unix","servlet","jsp","html"};
		
		System.out.println ("Before Sorting ");
		
		/*for (int i = 0; i < names.length; i++)
	      {
			System.out.println (names[i]);
	      }*/

		for (int i = 0; i < names.length; i++)
	      {
	    	  for(int j=0; j<names.length-1-i;j++)
	    	  {
	    		  if((names[j].compareTo(names[j+1]))>0)
	    		  {
	    			 String temp = names[j];
	    			 names[j]=names[j+1];
	    			 names[j+1]=temp;    			  
	    		  }    		  
	    	  }		
	      }
	      
	      System.out.println ("After Sorting ");
	      
	     
	       for (int i = 0; i < names.length; i++)
	      {
			System.out.println (names[i]);
	      }    
	        
	  //String Concatenation in Java
	       
	       //+ is an operator to concate the Strings.
	
	String con1= "hello";
	String con2= s1+" java";
	System.out.println(con2);
	
	
	//Java String replace() method
	
	//The string replace() method replaces all occurrence of first sequence of character with second sequence of character.
	
	String sold="Welcome to Java. Java is good and easy language. learning Java is a future";
	String replaceString= sold.replace("Java", "Kava");
	System.out.println(sold);
	System.out.println(replaceString);
	
	//Spilt() of String class:
	
	//It return array of Strings;
	
	String splold="Java:Test:C:c++:python:net:html";
	String [] spl= splold.split(":");
	for (String str:spl)
	{
		System.out.println(str);
	}
	
	String record = "1001:nrit:25:5000:male";
	String [] fields = record.split(":");
	
	System.out.println(fields[0]+"\t"+fields[1]+"\t"+fields[4]);
	
	
	}  
		
	}

